package giusti.felipe.dao;

import giusti.felipe.models.PokemonCard;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PokemonCardDAO implements DAO<PokemonCard>, DAOFields {
    private Connection connection;
    private String myDBConnectionString = "jdbc:sqlite:card_data.db";

    public PokemonCardDAO(){
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<PokemonCard> get(String condition) {
        List<PokemonCard> pokemonCards = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectConditionalString(getTableName()) + condition);
            while(result.next()){
                PokemonCard pokemonCard = new PokemonCard(
                        result.getString("id"),
                        result.getString("imageUrl"),
                        result.getString("name"),
                        result.getString("rarity"),
                        result.getString("series"),
                        result.getString("cardSet")
                );
                pokemonCards.add(pokemonCard);
            }
            result.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return pokemonCards;
    }

    @Override
    public List<PokemonCard> getAll() {
        List<PokemonCard> pokemonCards = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectAllString(getTableName()));
            while(result.next()){
                PokemonCard pokemonCard = new PokemonCard(
                        result.getString("id"),
                        result.getString("imageUrl"),
                        result.getString("name"),
                        result.getString("rarity"),
                        result.getString("series"),
                        result.getString("cardSet")
                );
                pokemonCards.add(pokemonCard);
            }
            result.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return pokemonCards;
    }

    @Override
    public void update(PokemonCard pokemonCard) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getUpdateString(getTableName()));
            preparedStatement.setString(1,pokemonCard.getId());
            preparedStatement.setString(2,pokemonCard.getImageUrl());
            preparedStatement.setString(3,pokemonCard.getName());
            preparedStatement.setString(4,pokemonCard.getRarity());
            preparedStatement.setString(5,pokemonCard.getSeries());
            preparedStatement.setString(6,pokemonCard.getCardSet());
            preparedStatement.setString(7,pokemonCard.getId());

            preparedStatement.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(PokemonCard pokemonCard) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement((getDeleteString(getTableName())));
            preparedStatement.setString(1,pokemonCard.getId());

            preparedStatement.executeUpdate();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void create(PokemonCard pokemonCard) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(getInsertString(getTableName()));
            preparedStatement.setString(1,pokemonCard.getId());
            preparedStatement.setString(2,pokemonCard.getImageUrl());
            preparedStatement.setString(3,pokemonCard.getName());
            preparedStatement.setString(4,pokemonCard.getRarity());
            preparedStatement.setString(5,pokemonCard.getSeries());
            preparedStatement.setString(6,pokemonCard.getCardSet());

            preparedStatement.executeUpdate();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


    @Override
    public String getTableName() {
        return "pokemonCard";
    }

    @Override
    public String getDeleteString(String table) {
        return "DELETE FROM " + table + " WHERE id = ?;";
    }

    @Override
    public String getUpdateString(String table) {
        return "UPDATE " + table + " SET id = ?, imageUrl = ?, name = ?, rarity = ?, series = ?, cardSet = ? WHERE id = ?;";
    }

    @Override
    public String getInsertString(String table) {
        return "INSERT INTO " + table + " (id, imageUrl, name, rarity, series, cardSet) VALUES (?,?,?,?,?,?);";
    }

    @Override
    public String getSelectAllString(String table) {
        return "SELECT * FROM " + table + ";";
    }

    @Override
    public String getSelectConditionalString(String table) {
        return "SELECT * FROM " + table + " WHERE ";
    }
}


