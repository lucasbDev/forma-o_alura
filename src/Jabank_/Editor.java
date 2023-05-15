package Jabank_;

public class Editor extends Funcionario {
    
    public double getBonificacao() {
        System.out.println("Editor on!");
        return super.getBonificacao() + 150;
    }
}
