public class ClienteMain {
    public static void main(String[] args) {
        Cliente kamilla = new Cliente();
        kamilla.cpf = "1234454523";
        kamilla.nomeCliente= "Kamilla Lima";
        kamilla.profissao = "estudante";
        Conta contaKamilla = new Conta();


        //Associando a cliente kamilla com a conta contaKamilla
        contaKamilla.titular = kamilla;

        contaKamilla.saldo = 10.00;
        contaKamilla.numero = 40343;
        System.out.println(contaKamilla.titular.nomeCliente);

        //segunda forma de fazer
        Conta contaBruna = new Conta();
        /*Aqui eu nao crio uma variavel temporária do tipo conta pra depois chamar
        * ela na classe Conta*/
        /*Objetos são sempre acessados através de referencias*/
        contaBruna.titular = new Cliente();
        contaBruna.titular.nomeCliente="Bruna";
        System.out.println(contaBruna.titular.nomeCliente);

        contaBruna.saldo = contaBruna.saldo - 3000;
        /*Aqui eu estou alterando o atributo saldo,então como o meu metodo saca nao
        * foi chamado,mesmo se for dar um valor negativo,a operação ainda irá ser realizar*/
     }
}
