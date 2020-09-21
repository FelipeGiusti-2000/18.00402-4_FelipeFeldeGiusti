package giusti.felipe.dao;

import java.util.List;

/**
 * Interface com métodos do sistema DAO a serem implementados
 * @param <T> tipo qualquer
 * @author Felipe Felde Giusti
 * @since 16/09/2020
 */
public interface DAO <T>{
    List<T> get(String condition);
    List<T> getAll();
    void update(T t, String id);
    void delete(T t);
    void create(T t);
}
