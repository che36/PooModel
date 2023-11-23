public class EntregaCartaoApp {
    public static void main(String[] args) {

        //dado do endereco
        Endereco endereco = new Endereco();
        endereco.cep = "0000000";
        //dados do cliente
        Cliente cliente = new Cliente();

        try {
            cliente.adicionarEndereco(endereco);
            System.out.println("Endereco adicionado com sucesso!");
        } catch (Exception e) {
            System.err.println("Houve um erro ao adicionar endereco: " + e.getMessage());
        }
    }
}