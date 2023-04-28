package Jabank;

public class CriarConta {
    public static void main(String[] args) {
        Conta firstConta = new Conta(0001,007); //instância de conta
        firstConta.depositar(1300);
        System.out.println(firstConta.getSaldo());
        
        Conta secondConta = new Conta(0001,002);
        secondConta.depositar(233); 
        System.out.println(secondConta.getSaldo());
    }
}
