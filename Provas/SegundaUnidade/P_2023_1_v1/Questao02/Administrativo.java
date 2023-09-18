package Provas.SegundaUnidade.P_2023_1_v1.Questao02;

import java.text.DecimalFormat;

public class Administrativo extends Assistente{
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, String matricula, String turno) {
        super(nome, salario, matricula);
        this.turno = turno;
    }
    public Administrativo(String nome, double salario, String matricula, String turno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }
    @Override
    public String ganhoAnual() {
        DecimalFormat format = new DecimalFormat("##.00");
        double decimo = ((super.getSalario()-adicionalNoturno)*12)/12;
        return "Valor recebido em 12 meses + 13º: " + format.format((super.getSalario()*12)+decimo);
    }
    @Override
    public String toString() {
        return super.toString() + " - Administrativo [ turno = " + turno + ", adicional Noturno = " + (adicionalNoturno > 0 ? adicionalNoturno : 0) + "]";
    }
}
