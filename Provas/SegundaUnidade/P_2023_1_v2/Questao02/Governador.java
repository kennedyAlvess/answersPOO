package Provas.SegundaUnidade.P_2023_1_v2.Questao02;

public class Governador extends Politico {
    private String estado;

    public Governador(String nome, String cpf, String partido, String estado) {
        super(nome, cpf, partido);
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nGovernador do Estado: "+estado;
    }
}
