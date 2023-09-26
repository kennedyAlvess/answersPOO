package Provas.SegundaUnidade.P_2023_1_v2.Questao03;

public interface ItemDeBiblioteca {
    int maximoDeDiasParaEmprestimo = 14;

    boolean estaEmprestado();
    void empresta();
    void devolve();
    void localizacao();
    void descricao();

}
