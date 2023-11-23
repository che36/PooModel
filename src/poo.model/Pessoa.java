package poo.model;

public class Pessoa {
    public enum TipoPessoa {FISICA, JURIDICA}

    public Integer codigo;
    public String documento;
    public String nome;
    public TipoPessoa tipo;
}