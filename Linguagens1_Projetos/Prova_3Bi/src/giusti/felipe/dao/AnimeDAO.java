package giusti.felipe.dao;

import giusti.felipe.models.Anime;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimeDAO implements DAO<Anime>, DAOFields{
    private Connection connection;
    private final String myDBConnectionString = "jdbc:sqlite:p3Bi.db";

    AnimeDAO(){
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Anime> get(String condition) {
        List<Anime> animeList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getSelectConditionalString(getTableName())+condition);
            while(resultSet.next()){
                Anime anime = new Anime(
                        resultSet.getString("imageUrl"),
                        resultSet.getString("name"),
                        resultSet.getString("synopsis"),
                        resultSet.getInt("episodes"),
                        resultSet.getFloat("score")
                );
                animeList.add(anime);
            }
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return animeList;
    }

    @Override
    public List<Anime> getAll() {
        List<Anime> animeList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getSelectAllString(getTableName()));
            while(resultSet.next()){
                Anime anime = new Anime(
                        resultSet.getString("imageUrl"),
                        resultSet.getString("name"),
                        resultSet.getString("synopsis"),
                        resultSet.getInt("episodes"),
                        resultSet.getFloat("score")
                );
                animeList.add(anime);
            }
            resultSet.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return animeList;
    }

    @Override
    public void delete(Anime anime) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getDeleteString(getTableName()));
            preparedStatement.setString(1, anime.getName());
            preparedStatement.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void insert(Anime anime) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(getInsertString(getTableName()));
            preparedStatement.setString(1,anime.getImageUrl());
            preparedStatement.setString(2,anime.getName());
            preparedStatement.setString(3,anime.getSynopsis());
            preparedStatement.setInt(4,anime.getEpisodes());
            preparedStatement.setFloat(5,anime.getScore());

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getTableName() {
        return "anime";
    }

    @Override
    public String getDeleteString(String table) {
        return "DELETE FROM "+table+" WHERE name = ?;";
    }

    @Override
    public String getInsertString(String table) {
        return "INSERT INTO " + table + " (imageUrl, name, synopsis, episodes, score) VALUES (?,?,?,?,?);";
    }

    @Override
    public String getSelectAllString(String table) {
        return "SELECT * FROM " + table;
    }

    @Override
    public String getSelectConditionalString(String table) {
        return "SELECT * FROM "+table+" WHERE ";
    }
}
