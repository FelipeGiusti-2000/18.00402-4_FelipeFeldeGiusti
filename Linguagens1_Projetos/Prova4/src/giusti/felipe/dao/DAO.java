package giusti.felipe.dao;

import java.util.List;
/**
 * Interface com metodos do sistema DAO a serem implementados
 * @param <T> tipo qualquer
 * @author Felipe Felde Giusti
 */
public interface DAO<T> {
    List<T> get(String condition);
    List<T> getAll();
    void delete(T t);
    void insert(T t);
}


