package giusti.felipe.dao;

import giusti.felipe.models.Anime;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que faz a comunicacao com o banco de dados do anime
 * @author Felipe Felde Giusti
 * @since 03/10/2020
 */
public class AnimeDAO implements DAO<Anime>, DAOFields{
    private Connection connection;
    private final String myDBConnectionString = "jdbc:sqlite:p3Bi.db";

    /**
     * Inicializa a conexao com o banco de dados
     */
    public AnimeDAO(){
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * Gera uma lista de animes a partir de uma condicao
     * @param condition String com condicao desejada, codificada em SQLite
     * @return Lista de animes do tipo List com dados do banco de dados
     */
    @Override
    public List<Anime> get(String condition) {
        List<Anime> animeList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getSelectConditionalString(getTableName()) + condition);
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
            System.out.println("Erro ao pegar da database");
            e.printStackTrace();
        }
        return animeList;
    }

    /**
     * Retorna uma lista de animes com todos os dados da database
     * @return Lista de animes do tipo List com todas as informações do banco de dados
     */
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

    /**
     * Deleta um anime do banco de dados
     * @param anime anime a ser deletada
     */
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

    /**
     * insere um anime no banco de dados
     * @param anime anime a ser inserido
     */
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

            preparedStatement.executeUpdate();

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
