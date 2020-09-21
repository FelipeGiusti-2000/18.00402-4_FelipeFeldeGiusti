package giusti.felipe.dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Interface com metodos do sistema DAO a serem implementados
 * @param <T> tipo qualquer
 * @author Felipe Felde Giusti
 * @since 16/09/2020
 */
public interface DAO <T>{
    List<T> get(String condition);
    List<T> getAll();
    void update(T t, String id) throws SQLException;
    void delete(T t);
    void create(T t) throws SQLException;
}
