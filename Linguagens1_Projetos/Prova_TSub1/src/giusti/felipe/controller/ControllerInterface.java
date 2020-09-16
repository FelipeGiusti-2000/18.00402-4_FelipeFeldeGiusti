package giusti.felipe.controller;

import giusti.felipe.dao.PokemonCardDAO;
import giusti.felipe.models.CardList;
import giusti.felipe.models.PokemonCard;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ControllerInterface {
    PokemonCardDAO pokemonCardDAO = new PokemonCardDAO();
    CardList cardList = new CardList(pokemonCardDAO.getAll());;

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
    public void register(){
        PokemonCard pokemonCard = new PokemonCard(
                txtId_Reg.getText(), txtUrl_Reg.getText(), txtName_Reg.getText(),
                txtRarity_Reg.getText(), txtSeries_Reg.getText(), txtCardSet_Reg.getText()
        );
        pokemonCardDAO.create(pokemonCard);

        cardList.addCard(pokemonCard);

        txtId_Reg.clear();
        txtUrl_Reg.clear();
        txtName_Reg.clear();
        txtRarity_Reg.clear();
        txtSeries_Reg.clear();
        txtCardSet_Reg.clear();
    }

    @FXML
    public void updateCardUI(){

        txtId_Card.setText(cardList.getPokemonCard().getId());
        txtUrl_Card.setText(cardList.getPokemonCard().getImageUrl());
        txtName_Card.setText(cardList.getPokemonCard().getName());
        txtRarity_Card.setText(cardList.getPokemonCard().getRarity());
        txtSeries_Card.setText(cardList.getPokemonCard().getSeries());
        txtCardSet_Card.setText(cardList.getPokemonCard().getCardSet());

        previewPhoto();
    }

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

    public void nextCard(){
        cardList.changeToNextCardIndex();
        updateCardUI();
    }

    public void lastCard(){
        cardList.changeToLastCardIndex();
        updateCardUI();
    }

    public void updateCard(){
        PokemonCard pokemonCard = new PokemonCard(
                txtId_Card.getText(), txtUrl_Card.getText(), txtName_Card.getText(),
                txtRarity_Card.getText(), txtSeries_Card.getText(), txtCardSet_Card.getText()
        );
        pokemonCardDAO.update(pokemonCard);

        cardList.updateCard(pokemonCard);

    }
}
