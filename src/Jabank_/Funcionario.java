package Jabank_;

public class Funcionario {
    
    private String nome;
    private String cpf;
    protected double salario;

    public double getBonificacao() {
        return this.salario * 0.5;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}