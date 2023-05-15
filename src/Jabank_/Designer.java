package Jabank_;

public class Designer  extends Funcionario{

    public double getBonificacao() {
        System.out.println("Designer on!");
        return super.getBonificacao() + 200;
    }
}
