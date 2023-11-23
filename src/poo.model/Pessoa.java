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
        if (documento.lenght() == TAMANHO_CPF) {
            tipo = TipoPessoa.FISICA;
        } else if (documento.length() == TAMANHO_CNPJ) {
            tipo = TipoPessoa.JURIDICA;
        } else {
            throw new RuntimeException("Documento invalido para pessoa fisica ou juridica");
        }
        this.documento = documento;

        public TipoPessoa getTipo () {
            return
        }

    }