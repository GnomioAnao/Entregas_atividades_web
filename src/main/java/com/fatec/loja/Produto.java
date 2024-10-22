package com.fatec.loja;

public class Produto {
    private int codigo;
    private String nome; 
    private String descritivo;
    private double valor;
    private int quantidade;
    private String keywords;

    public Produto(){}

    public Produto(int codigo, String nome, String descritivo, double valor, int quantidade, String keywords) {
        this.codigo = codigo;
        this.nome = nome;
        this.descritivo = descritivo;
        this.valor = valor;
        this.quantidade = quantidade;
        this.keywords = keywords;
    }

    public int getNumber() {
        return codigo;
    }
    public void setNumber(int number) {
        this.codigo = number;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    
}
