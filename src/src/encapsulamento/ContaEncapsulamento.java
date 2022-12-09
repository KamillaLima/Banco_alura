package src.encapsulamento;

public class ContaEncapsulamento {
    private ClienteEncapsulamento cliente;
    private int numeroConta;
    private double saldo;

    private static int totalClientes;
    //Deixando como statico ele se torna o atributo da classe



    public ContaEncapsulamento(ClienteEncapsulamento cliente, int numeroConta, double saldo) {
        System.out.println("Total de contas " + totalClientes);
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        totalClientes++;
        
    }
    //o set numeroConta pode acabar ficando sem sentido,porque eu quero q a conta nasça com X numero e morra com ele

    public ClienteEncapsulamento getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEncapsulamento cliente) {
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
