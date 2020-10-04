package giusti.felipe.dao;

import java.util.List;

public interface DAO <T> {
    List<T> get(String condition);
    List<T> getAll();
    void delete(T t);
    void insert(T t);
}