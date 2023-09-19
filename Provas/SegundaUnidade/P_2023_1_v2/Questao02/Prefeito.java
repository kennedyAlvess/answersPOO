package Provas.SegundaUnidade.P_2023_1_v2.Questao02;

public class Prefeito extends Politico{
    private String cidade;

    public Prefeito(String nome, String cpf, String partido, String cidade) {
        super(nome, cpf, partido);
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nPrefeito da Cidade: "+cidade;
    }
}
