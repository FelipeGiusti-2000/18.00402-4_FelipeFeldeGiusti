package giusti.felipe.dao;

import giusti.felipe.models.PokemonCard;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PokemonCardDAO implements DAO<PokemonCard> {
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
            ResultSet result = statement.executeQuery("SELECT * FROM pokemonCard WHERE " + condition);
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
        return null;
    }

    @Override
    public void update(PokemonCard pokemonCard) {

    }

    @Override
    public void delete(PokemonCard pokemonCard) {

    }

    @Override
    public void create(PokemonCard pokemonCard) {

    }
}


