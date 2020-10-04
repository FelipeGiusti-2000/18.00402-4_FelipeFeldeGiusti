package giusti.felipe.dao;

import giusti.felipe.models.Manga;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que faz a comunicacao com o banco de dados do manga
 * @author Felipe Felde Giusti
 * @since 03/10/2020
 */
public class MangaDAO implements DAO<Manga>,DAOFields{
    private Connection connection;
    private final String myDBConnectionString = "jdbc:sqlite:p3Bi.db";

    /**
     * Inicializa a conexao com o banco de dados
     */
    public MangaDAO(){
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    /**
     * Gera uma lista de mangas a partir de uma condicao
     * @param condition String com condicao desejada, codificada em SQLite
     * @return Lista de mangas do tipo List com dados do banco de dados
     */
    @Override
    public List<Manga> get(String condition) {
        List<Manga> mangaList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getSelectConditionalString(getTableName())+condition);
            while(resultSet.next()){
                Manga manga = new Manga(
                        resultSet.getString("imageUrl"),
                        resultSet.getString("name"),
                        resultSet.getString("synopsis"),
                        resultSet.getInt("chapters"),
                        resultSet.getInt("volumes"),
                        resultSet.getString("type"),
                        resultSet.getFloat("score")
                );
                mangaList.add(manga);
            }
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mangaList;
    }
    /**
     * Retorna uma lista de mangas com todos os dados da database
     * @return Lista de mangas do tipo List com todas as informações do banco de dados
     */
    @Override
    public List<Manga> getAll() {
        List<Manga> mangaList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getSelectAllString(getTableName()));
            while(resultSet.next()){
                Manga manga = new Manga(
                        resultSet.getString("imageUrl"),
                        resultSet.getString("name"),
                        resultSet.getString("synopsis"),
                        resultSet.getInt("chapters"),
                        resultSet.getInt("volumes"),
                        resultSet.getString("type"),
                        resultSet.getFloat("score")
                );
                mangaList.add(manga);
            }
            resultSet.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mangaList;
    }
    /**
     * Deleta um manga do banco de dados
     * @param manga manga a ser deletado
     */
    @Override
    public void delete(Manga manga) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getDeleteString(getTableName()));
            preparedStatement.setString(1, manga.getName());
            preparedStatement.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * insere um manga no banco de dados
     * @param manga manga a ser inserido
     */
    @Override
    public void insert(Manga manga) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(getInsertString(getTableName()));
            preparedStatement.setString(1,manga.getImageUrl());
            preparedStatement.setString(2,manga.getName());
            preparedStatement.setString(3,manga.getSynopsis());
            preparedStatement.setInt(4,manga.getChapters());
            preparedStatement.setInt(5,manga.getVolumes());
            preparedStatement.setString(6,manga.getType());
            preparedStatement.setFloat(7,manga.getScore());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getTableName() {
        return "manga";
    }

    @Override
    public String getDeleteString(String table) {
        return "DELETE FROM "+table+" WHERE name = ?;";
    }

    @Override
    public String getInsertString(String table) {
        return "INSERT INTO " + table + " (imageUrl, name, synopsis, chapters, volumes, type, score) VALUES (?,?,?,?,?,?,?);";
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

