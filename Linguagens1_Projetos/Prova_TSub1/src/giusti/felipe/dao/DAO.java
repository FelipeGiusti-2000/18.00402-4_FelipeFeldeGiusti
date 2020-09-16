package giusti.felipe.dao;

import java.util.List;

public interface DAO <T>{
    List<T> get(String condition);
    List<T> getAll();
    void update(T t, String id);
    void delete(T t);
    void create(T t);
}
