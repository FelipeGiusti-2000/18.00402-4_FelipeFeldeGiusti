package giusti.felipe.dao;

/**
 * Interface com metodos que retornam strings de comandos usados no banco de dados
 * @author Felipe Felde Giusti
 */
public interface DAOFields {
    /**
     * @return String com nome da tabela usada
     */
    String getTableName();

    /**
     * String em codigo SQLite para deletar
     * @param table tabela onde sera deletada
     * @return string com o comando para deletar
     */
    String getDeleteString(String table);

    /**
     * String com codigo SQLite para inserir na tabela
     * @param table tabela a inserir
     * @return String com comando para inserir
     */
    String getInsertString(String table);

    /**
     * String com codigo em SQLite para selecionar tudo
     * @param table tabela a ser selecionada
     * @return string com codigo em SQLite
     */
    String getSelectAllString(String table);

    /**
     * String com codigo em SQLite para selecionar com condicao
     * @param table tabela a ser selecionada
     * @return string com codigo em SQLite
     */
    String getSelectConditionalString(String table);
}
