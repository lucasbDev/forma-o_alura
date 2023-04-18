package Jabank;

public class CriarConta {
    public static void main(String[] args) {
        Conta firstConta = new Conta(0001,007); //instância de conta
        firstConta.saldo = 1300;
        System.out.println(firstConta.saldo);
        
        firstConta.saldo += 100;
        System.out.println(firstConta.saldo);
    
        Conta secondConta = new Conta(0001,002);
        secondConta.saldo = 233;
        System.out.println(secondConta.saldo);
    }
}
