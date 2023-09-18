package Provas.SegundaUnidade.P_2023_1_v1.Questao02;

import java.text.DecimalFormat;

public class Tecnico extends Assistente{
    private double bonus;

    public Tecnico(String nome, double salario, String matricula, double bonus) {
        super(nome, salario, matricula);
        this.bonus = bonus;
    }
    public String ganhoAnual() {
        return super.ganhoAnual();
    }
    @Override
    public String toString() {
        return super.toString() + " - Tecnico [ bonus = " + bonus + "]";
    }
}
