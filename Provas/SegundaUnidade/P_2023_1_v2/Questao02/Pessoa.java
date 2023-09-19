package Provas.SegundaUnidade.P_2023_1_v2.Questao02;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome+", CPF: "+cpf+'.';
    }
}
