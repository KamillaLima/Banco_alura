package src.encapsulamento;

public class MainEncapsulamento {
    public static void main(String[] args) {
        ClienteEncapsulamento cliente = new ClienteEncapsulamento();
        cliente.setProfissao("programador");
        cliente.setNome("Fernando");
        ContaEncapsulamento conta = new ContaEncapsulamento(cliente,45677,34.33);
        System.out.println(conta.getNumeroConta());
        System.out.println(conta.getCliente().getNome());
        //retornando o cliente da conta e alterando a sua profissao


    }
}
