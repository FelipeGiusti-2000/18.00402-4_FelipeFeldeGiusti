package com.company;

public class Mission {
    private String descricao;
    private String objetivo;
    private String local;
    private String categoria;

    public Mission(String descricao, String objetivo, String local, String categoria){
        this.descricao = descricao;
        this.objetivo = objetivo;
        this.local = local;
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getLocal() {
        return local;
    }
    public String getCategoria(){
        return categoria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
