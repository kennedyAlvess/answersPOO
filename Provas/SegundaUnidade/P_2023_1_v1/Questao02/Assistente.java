package Provas.SegundaUnidade.P_2023_1_v1.Questao02;

public class Assistente extends Funcionario {
    private String matricula;

    public Assistente(String nome, double salario, String matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public String toString() {
        return "Assistente " + super.toString() + ", matricula = " + matricula;
    }
}
