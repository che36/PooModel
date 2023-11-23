package poo.model;

public class Pessoa {
    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

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
        if (documento.lenght())
            this.documento = documento;
    }

}