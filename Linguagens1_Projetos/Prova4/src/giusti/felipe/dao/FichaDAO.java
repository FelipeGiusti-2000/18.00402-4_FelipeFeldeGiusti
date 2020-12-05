package giusti.felipe.dao;

import giusti.felipe.enums.ProfissoesEnum;
import giusti.felipe.enums.RacasEnum;
import giusti.felipe.models.FichaDePersonagem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FichaDAO implements DAO<FichaDePersonagem>, DAOFields{
    private Connection connection;
    private final String myDBConnectionString = "jdbc:sqlite:p4Ficha.db";

    public FichaDAO(){
        try{
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<FichaDePersonagem> get(String condition) {
        List<FichaDePersonagem> fichaDePersonagems = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectConditionalString(getTableName()) + condition);
            while(result.next()){
                FichaDePersonagem produto = new FichaDePersonagem(
                        result.getInt("id"),
                        result.getString("nome"),
                        RacasEnum.valueOf(result.getString("raca")),
                        ProfissoesEnum.valueOf(result.getString("profissao")),
                        result.getInt("mana"),
                        result.getInt("ataque"),
                        result.getInt("ataqueMagico"),
                        result.getInt("defesa"),
                        result.getInt("defesaMagica"),
                        result.getInt("velocidade"),
                        result.getInt("destreza"),
                        result.getInt("experiencia"),
                        result.getInt("nivelAtual")
                );
                fichaDePersonagems.add(produto);
            }
            result.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return fichaDePersonagems;
    }

    @Override
    public List<FichaDePersonagem> getAll() {
        List<FichaDePersonagem> fichaDePersonagems = new ArrayList<>();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getSelectAllString((getTableName())));

            ResultSet result = preparedStatement.executeQuery();
            while(result.next()){
                FichaDePersonagem fichaDePersonagem = new FichaDePersonagem(
                        result.getInt("id"),
                        result.getString("nome"),
                        RacasEnum.valueOf(result.getString("raca")),
                        ProfissoesEnum.valueOf(result.getString("profissao")),
                        result.getInt("mana"),
                        result.getInt("ataque"),
                        result.getInt("ataqueMagico"),
                        result.getInt("defesa"),
                        result.getInt("defesaMagica"),
                        result.getInt("velocidade"),
                        result.getInt("destreza"),
                        result.getInt("experiencia"),
                        result.getInt("nivelAtual")
                );
                fichaDePersonagems.add(fichaDePersonagem);
            }
            result.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return fichaDePersonagems;
    }

    @Override
    public void delete(FichaDePersonagem fichaDePersonagem) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getDeleteString(getTableName()));
            preparedStatement.setInt(1, fichaDePersonagem.getId());
            preparedStatement.executeUpdate();
        }
        catch(Exception e){
            System.out.println("Erro no delete\n");
            e.printStackTrace();
        }
    }

    @Override
    public void insert(FichaDePersonagem fichaDePersonagem) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getInsertString(getTableName()));
            preparedStatement.setString(1, fichaDePersonagem.getNome());
            preparedStatement.setString(2, fichaDePersonagem.getRaca().toString());
            preparedStatement.setString(3, fichaDePersonagem.getProfissao().toString());
            preparedStatement.setInt(4, fichaDePersonagem.getMana());
            preparedStatement.setInt(5, fichaDePersonagem.getAtaque());
            preparedStatement.setInt(6, fichaDePersonagem.getAtaqueMagico());
            preparedStatement.setInt(7, fichaDePersonagem.getDefesa());
            preparedStatement.setInt(8, fichaDePersonagem.getDefesaMagica());
            preparedStatement.setInt(9, fichaDePersonagem.getVelocidade());
            preparedStatement.setInt(10, fichaDePersonagem.getDestreza());
            preparedStatement.setInt(11, fichaDePersonagem.getExperiencia());
            preparedStatement.setInt(12, fichaDePersonagem.getNivelAtual());

            preparedStatement.executeUpdate();
        }catch (Exception e){
            System.out.println("Erro no insert\n");
            e.printStackTrace();
        }
    }

    @Override
    public void update(FichaDePersonagem fichaDePersonagem, String id) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getUpdateString(getTableName()));
            preparedStatement.setString(1, fichaDePersonagem.getNome());
            preparedStatement.setString(2, fichaDePersonagem.getRaca().toString());
            preparedStatement.setString(3, fichaDePersonagem.getProfissao().toString());
            preparedStatement.setInt(4, fichaDePersonagem.getMana());
            preparedStatement.setInt(5, fichaDePersonagem.getAtaque());
            preparedStatement.setInt(6, fichaDePersonagem.getAtaqueMagico());
            preparedStatement.setInt(7, fichaDePersonagem.getDefesa());
            preparedStatement.setInt(8, fichaDePersonagem.getDefesaMagica());
            preparedStatement.setInt(9, fichaDePersonagem.getVelocidade());
            preparedStatement.setInt(10, fichaDePersonagem.getDestreza());
            preparedStatement.setInt(11, fichaDePersonagem.getExperiencia());
            preparedStatement.setInt(12, fichaDePersonagem.getNivelAtual());
            preparedStatement.setString(13, id);

            preparedStatement.executeUpdate();
        }catch (Exception e){
            System.out.println("Erro no update\n");
            e.printStackTrace();
        }
    }

    @Override
    public String getTableName() {
        return "p4Ficha";
    }

    @Override
    public String getDeleteString(String table) {
        return "DELETE FROM \"" + table + "\" WHERE id = ?;";
    }

    @Override
    public String getInsertString(String table) {
        return "INSERT INTO " + table + " (nome, raca, profissao, mana, ataque, ataqueMagico, defesa, defesaMagica, velocidade, destreza, experiencia, nivelAtual) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
    }

    @Override
    public String getSelectAllString(String table) {
        return "SELECT * FROM " + table;
    }

    @Override
    public String getSelectConditionalString(String table) {
        return "SELECT * FROM "+table+" WHERE ";
    }

    @Override
    public String getUpdateString(String table) {
        return "UPDATE "+ table +" SET nome = ?, raca = ?, profissao = ?, mana = ?, ataque = ?, ataqueMagico = ?, defesa = ?, defesaMagica = ?, velocidade = ?, destreza = ?, experiencia = ?, nivelAtual = ? WHERE id = ?;";
    }
}
