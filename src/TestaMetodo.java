public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 12.00;
        conta.deposita(100);
        System.out.println(conta.saldo);
        boolean conseguiuSacar = conta.sacar(300);
        /*Segurar o ctrl e passar por cima do nome do metodo,ele já me leva direto para a classe onde ele está*/
        if(conseguiuSacar){
            System.out.println("Saque realizado");
        }else{
            System.out.println("Saldo indisponível ");
        }

        Conta contaKamilla = new Conta();
        contaKamilla.saldo = 2000.00;

        Conta contaPai = new Conta();
        contaPai.saldo=12.00;

        boolean transferir = contaKamilla.transferir(200,contaPai);
        if(transferir){
            System.out.println("Transferencia realizada com sucesso");
        }
        else{
            System.out.println("Transferencia nao realizada");
        }
    }
}
