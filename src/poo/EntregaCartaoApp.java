public class EntregaCartaoApp {
    public static void main(String[] args) {

        //dado do endereco
        Endereco endereco = new Endereco();

        //dados do cliente
        Cliente cliente = new Cliente();

        cliente.adicionarEndereco(endereco);
        System.out.println("Endereco adicionado com sucesso!");

    }
}