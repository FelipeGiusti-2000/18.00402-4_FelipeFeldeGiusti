package giusti.felipe.dao;

public interface DAOFields {
    String getTableName();
    String getDeleteString(String table);
    String getInsertString(String table);
    String getSelectAllString(String table);
    String getSelectConditionalString(String table);
}