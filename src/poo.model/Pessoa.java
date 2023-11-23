package poo.model;

public class Pessoa {
    public enum TipoPessoa {FISICA, JURIDICA}

    public Integer codigo;
    public String documento;
    public String nome;
    public TipoPessoa tipo;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

}