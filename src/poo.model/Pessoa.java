package poo.model;

public class Pessoa {
    public enum TipoPessoa {FISICA, JURIDICA}

    public Integer codigo;
    private String documento;
    public String nome;
    public TipoPessoa tipo;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {

        if (documento == null || documento.isEmpty()) {
            throw new RuntimeException("Documento nao pode ser nulo nem vazio");
        }
        this.documento = documento;
    }

}