package giusti.felipe.controller;

import giusti.felipe.dao.PokemonCardDAO;
import giusti.felipe.models.CardList;
import giusti.felipe.models.PokemonCard;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.sqlite.SQLiteException;

import java.sql.SQLException;

/**
 * Controlador da interface grafica
 * @author Felipe Felde Giusti
 * @since 16/09/2020
 */
public class ControllerInterface {
    private PokemonCardDAO pokemonCardDAO = new PokemonCardDAO();
    private CardList cardList = new CardList(pokemonCardDAO.getAll());

    @FXML
    private TextField txtId_Reg;
    @FXML
    private TextField txtUrl_Reg;
    @FXML
    private TextField txtName_Reg;
    @FXML
    private TextField txtRarity_Reg;
    @FXML
    private TextField txtSeries_Reg;
    @FXML
    private TextField txtCardSet_Reg;

    @FXML
    private Button btnRegisterCard;

    @FXML
    private ImageView imgCard;
    @FXML
    private Button btnLastCard;
    @FXML
    private Button brnNextCard;

    @FXML
    private TextField txtId_Card;
    @FXML
    private TextField txtUrl_Card;
    @FXML
    private TextField txtName_Card;
    @FXML
    private TextField txtRarity_Card;
    @FXML
    private TextField txtSeries_Card;
    @FXML
    private TextField txtCardSet_Card;

    @FXML
    private Button btnUpdateCard;
    @FXML
    private Button btnDeleteCard;

    @FXML
    private Label lblListIndex;

    /**
     * Metodo carregado ao inicializar a interface com uma carta da lista
     */
    @FXML
    public void initialize(){
        updateCardUI();
    }

    /**
     * Metodo que registra uma carta na database e na lista de cartas
     */
    @FXML
    public void register(){
        PokemonCard pokemonCard = new PokemonCard(
                txtId_Reg.getText(), txtUrl_Reg.getText(), txtName_Reg.getText(),
                txtRarity_Reg.getText(), txtSeries_Reg.getText(), txtCardSet_Reg.getText()
        );
        try{
            pokemonCardDAO.create(pokemonCard);

            cardList.addCard(pokemonCard);

            txtId_Reg.clear();
            txtUrl_Reg.clear();
            txtName_Reg.clear();
            txtRarity_Reg.clear();
            txtSeries_Reg.clear();
            txtCardSet_Reg.clear();
        }
        catch (SQLException throwables) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Id incorreto");
            alert.setHeaderText("O id \'" +txtId_Reg.getText()+ "\' já foi usado.\n" +
                    "Certifique-se que digitou o id correto.");
            alert.showAndWait();

            txtId_Reg.clear();
            txtId_Reg.requestFocus();
//            throwables.printStackTrace();
        }


    }

    /**
     * Metodo que atualiza a interface do usuario com os dados de uma lista de carta
     */
    @FXML
    public void updateCardUI(){

        lblListIndex.setText(String.format("Carta: (%d / %d)",cardList.getCurrentCardIndex()+1, cardList.getListSize()));
        txtId_Card.setText(cardList.getPokemonCard().getId());
        txtUrl_Card.setText(cardList.getPokemonCard().getImageUrl());
        txtName_Card.setText(cardList.getPokemonCard().getName());
        txtRarity_Card.setText(cardList.getPokemonCard().getRarity());
        txtSeries_Card.setText(cardList.getPokemonCard().getSeries());
        txtCardSet_Card.setText(cardList.getPokemonCard().getCardSet());

        previewPhoto();
    }

    /**
     * Metodo para exibir uma imagem na tela, erros na url causam um alerta
     */
    @FXML
    public void previewPhoto(){
        try {
            String url = txtUrl_Card.getText();
            Image image = new Image(url);
            imgCard.setImage(image);
        }
        catch (IllegalArgumentException exception) {
            imgCard.setImage(null);
            txtUrl_Card.clear();
            txtUrl_Card.requestFocus();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("URL Incorreta");
            alert.setHeaderText("Certifique-se que a URL é válida.");
            alert.showAndWait();
        }
    }

    /**
     * Avanca na lista para a próxima carta e atualiza a UI com as novas informacoes
     */
    public void nextCard(){
        cardList.changeToNextCardIndex();
        updateCardUI();
    }

    /**
     * Regride na lista para a ultima carta e atualiza a UI com as novas informacoes
     */

    public void lastCard(){
        cardList.changeToLastCardIndex();
        updateCardUI();
    }

    /**
     * Metodo que atualiza as informacoes de uma carta ja presente na database e depois a UI
     */

    public void updateCard(){
        PokemonCard pokemonCard = new PokemonCard(
                txtId_Card.getText(), txtUrl_Card.getText(), txtName_Card.getText(),
                txtRarity_Card.getText(), txtSeries_Card.getText(), txtCardSet_Card.getText()
        );

        try {
            pokemonCardDAO.update(pokemonCard, cardList.getPokemonCard().getId());
            cardList.updateCard(pokemonCard);

            updateCardUI();
        }
        catch (SQLException throwables) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Id incorreto");
            alert.setHeaderText("O id \'" +txtId_Card.getText()+ "\' já foi usado.\n" +
                    "Certifique-se que digitou o id correto.");
            alert.showAndWait();

            txtId_Card.clear();
            txtId_Card.requestFocus();

//            throwables.printStackTrace();
        }

    }

    /**
     * Metodo que deleta uma carta ja presente na database
     */
    public void deleteCard(){
        PokemonCard pokemonCard = new PokemonCard(
                txtId_Card.getText(), txtUrl_Card.getText(), txtName_Card.getText(),
                txtRarity_Card.getText(), txtSeries_Card.getText(), txtCardSet_Card.getText()
        );
        pokemonCardDAO.delete(pokemonCard);

        cardList.removeCard();
        nextCard();
    }
}
