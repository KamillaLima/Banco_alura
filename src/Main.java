public class Main {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        /*O new é onde instanciamos uma classe/
        /*Nem sempre será Conta nomeDaVariavel = new Conta() , dependendo do polimorfismo a variavel pode ter outro tipo */
        primeiraConta.saldo = 1000.00;
        System.out.println(primeiraConta.saldo);
        /*Nesse caso eu consigo adicionar sem problemas porque o atributo saldo está salvo como público na classe*/
        /*Identação no Intellij : Ctrl+Alt+L*/

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        /*O objeto conta foi criado e a referencia para ele é a variavel segundaConta,que tem o tipo Conta*/
        segundaConta.saldo = 120.00;
        System.out.println(segundaConta.saldo);
        System.out.println(segundaConta.titular);
        System.out.println(segundaConta.agencia);
        System.out.println(segundaConta.numero);
        /*Quando instanciamos uma classe,ela vem como zero ou nula*/
    }
}