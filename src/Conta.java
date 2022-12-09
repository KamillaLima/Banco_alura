public class Conta {
    public Cliente titular = new Cliente();//ja cria um objeto cliente no momento em que a classe conta é instanciada
   //Atributo privado nao pode ser nem lido e nem modificado
    public Integer agencia;
    public Integer numero=1212;
    /*Todas as contas terão como numero 1212*/
    public Double saldo;

    public void deposita(double valor) {
         this.saldo += valor;
         /*This é referencia para o objeto em especifico que foi criado (é opcional ser colocado),porque já é feito no
          * automático*/
     }

     public boolean sacar(double valor) {
         if (this.saldo >= valor) {
             this.saldo -= valor;
             return true;
         } else {
             return false;
         }
     }
     public boolean transferir(double valorTransferir,Conta contaRecebe){
             if(this.saldo >= valorTransferir){
                 sacar(valorTransferir);
                 contaRecebe.deposita(valorTransferir);
                 return true;
             }
             else{
                 return false;
             }
         }

     }