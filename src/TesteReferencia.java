public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 10.00;
        System.out.println(primeiraConta.saldo);
        /*Aqui é copiado o caminho para o objeto que a primeiraConta está "tomando conta" */
        Conta segundaConta = primeiraConta;
        /*São duas flechas(primeiraConta e segundaConta) para o mesmo objeto*/
        System.out.println(segundaConta.saldo);
        segundaConta.saldo+=12.00;
        //Qualquer uma das flechas que eu chamar e quiser alterar o saldo,por exemplo,ele irá alterar o objeto,pq ambas
        //as flechas estão apontando para o mesmo objeto
        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);
    }
}
