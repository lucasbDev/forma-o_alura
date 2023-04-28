package Jabank;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular; /* instância dinâmica */
    private static int total; /* instância estática */

    public Conta(int agencia,int numero) {
        total++;
        System.out.println("total de contas: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Conta: " + this.numero + "criada!");
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }    
    }

    public boolean transferir(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }
    
    public int getAgencia() {
        return this.agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
