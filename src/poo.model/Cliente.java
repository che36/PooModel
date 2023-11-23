package poo.model;

public class Cliente {

    public Integer codigo;
    public String nome;
    public String cpf;

    public List<Endereco> enderecos;

    public void adicionarEndereco(Endereco endereco) {

    }

    private List<Endereco> getEnderecos() {
        if (enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }

}