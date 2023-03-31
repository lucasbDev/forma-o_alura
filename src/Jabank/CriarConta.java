package Jabank;

public class CriarConta {
    public static void main(String[] args) {
        Conta firstConta = new Conta(); //instância de conta
        firstConta.saldo = 1300;
        System.out.println(firstConta.saldo);
        
        firstConta.saldo += 100;
        System.out.println(firstConta.saldo);
    
        Conta secondConta = new Conta();
        secondConta.saldo = 233;
        System.out.println(secondConta.saldo);
    }
}
