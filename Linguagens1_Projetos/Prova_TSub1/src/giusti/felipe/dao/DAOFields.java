package giusti.felipe.dao;

/**
 * Interface com metodos que retornam strings de comandos usados no banco de dados
 * @author Felipe Felde Giusti
 * @since 16/09/2020
 */
public interface DAOFields {
    /**
     * @return String com o nome da tabela usada em dada classe
     */
    String getTableName();

    /**
     * @param table tabela a ser deletada
     * @return String com o comando para deletar
     */
    String getDeleteString(String table);

    /**
     * @param table tabela a ser atualizada
     * @return String com comando para atualizar
     */
    String getUpdateString(String table);

    /**
     * @param table tabela em que sera inserido o desejado
     * @return String com codigo de inserção
     */
    String getInsertString(String table);

    /**
     * @param table tabela usado no SELECT
     * @return String com codigo para selecionar tabela desejada
     */
    String getSelectAllString(String table);

    /**
     * @param table tabela usado no SELECT
     * @return String com codigo para selecionar tabela desejada
     */
    String getSelectConditionalString(String table);
}
