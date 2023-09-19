package Provas.SegundaUnidade.P_2023_1_v2.Questao02;

public class Politico extends Pessoa{
    private String partido;

    public Politico(String nome, String cpf, String partido) {
        super(nome, cpf);
        this.partido = partido;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nFaz parte do partido: " + partido;
    }
}
