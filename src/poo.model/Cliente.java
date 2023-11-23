package poo.model;

public class Cliente extends Pessoa {

    public List<Endereco> enderecos;
    public String numCartao;

    public void adicionarEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new NullPointerException("Endereço nao pode ser nulo");
        }
        if (endereco.cep == null) {
            thow new NullPointerException("Cep nao pode ser nulo");
        }
        getEnderecos().add(endereco);
    }

    private List<Endereco> getEnderecos() {
        if (enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }

}