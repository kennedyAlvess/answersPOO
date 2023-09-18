package Provas.SegundaUnidade.P_2023_1_v1.Questao02;

import java.text.DecimalFormat;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public void aumentarSalario(double aumento) {
        salario += aumento;
        System.out.println("Salario atual: " + salario);
    }
    public String ganhoAnual() {
        DecimalFormat format = new DecimalFormat("##.00");
        double decimo = (salario*12)/12;
        return "Valor recebido em 12 meses + 13º: " + format.format((salario * 12)+decimo);
    }
    @Override
    public String toString() {
        return nome + ", salario = " + salario;
    }
    public double getSalario() {
        return salario;
    }
}
