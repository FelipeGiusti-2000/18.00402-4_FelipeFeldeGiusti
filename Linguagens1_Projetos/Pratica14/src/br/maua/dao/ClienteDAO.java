package br.maua.dao;

import br.maua.models.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ClienteDAO implements DAO<Cliente>, DAOFields {
    private Connection connection;
    private final String myDBConnectionString = "jdbc:sqlite:dados_tuned.db";
    private final String MY_TABLE = "clientes";
    public ClienteDAO() {
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    @Override
    public List<Cliente> get(String condition) {
        return null;
    }
    @Override
    public List<Cliente> getAll() {
        return null;
    }
    @Override
    public void update(Cliente cliente) {
    }
    @Override
    public void delete(Cliente cliente) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM clientes WHERE id = ?");
            preparedStatement.setString(1, cliente.getId());
            preparedStatement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void create(Cliente cliente) {
    }
}