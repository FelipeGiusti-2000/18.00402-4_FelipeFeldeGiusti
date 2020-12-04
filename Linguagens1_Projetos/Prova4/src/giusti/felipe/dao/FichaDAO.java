package giusti.felipe.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class FichaDAO implements DAO, DAOFields{
    private Connection connection;
    private final String myDBConnectionString = "";
    public FichaDAO(){
        try{
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List get(String condition) {
        return null;
    }

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public void insert(Object o) {

    }

    @Override
    public void update(Object o) {

    }

    @Override
    public String getTableName() {
        return null;
    }

    @Override
    public String getDeleteString(String table) {
        return null;
    }

    @Override
    public String getInsertString(String table) {
        return null;
    }

    @Override
    public String getSelectAllString(String table) {
        return null;
    }

    @Override
    public String getSelectConditionalString(String table) {
        return null;
    }

    @Override
    public String getUpdateString(String table) {
        return null;
    }
}
