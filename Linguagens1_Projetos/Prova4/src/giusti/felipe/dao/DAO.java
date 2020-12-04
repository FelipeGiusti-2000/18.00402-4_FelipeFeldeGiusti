package giusti.felipe.dao;

import giusti.felipe.models.FichaDePersonagem;

import java.util.List;
/**
 * Interface com metodos do sistema DAO a serem implementados
 * @author Felipe Felde Giusti
 */

// Nao sei por que ele não me deixa usar como Objeto / T (tipo geral)
public interface DAO<T> {
    List<T> get(String condition);
    List<T> getAll();
    void delete(T t);
    void insert(T t);
    void update(T t);
}