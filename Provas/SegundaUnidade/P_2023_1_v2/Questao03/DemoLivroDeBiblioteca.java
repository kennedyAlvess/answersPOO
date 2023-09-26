package Provas.SegundaUnidade.P_2023_1_v2.Questao03;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("Clean Code","Robert Cecil Martin",215,
                2008,"Corredor 2, prateleira D","A Handbook of Agile Software Craftsmanship");

        System.out.println(livro);
        livro.dataInicioEmprestimo();
        livro.dataFinalEmprestimo();

        System.out.println("\n===== EMPRESTANDO LIVRO =====");
        livro.empresta();
        livro.dataInicioEmprestimo();
        livro.dataFinalEmprestimo();
        System.out.println("\n==== DEVOLVENDO LIVRO ====");
        livro.devolve();
        livro.dataInicioEmprestimo();
        livro.dataFinalEmprestimo();

        System.out.println("\n===== DEMAIS METODOS =====");
        livro.estaEmprestado();
        livro.qualAutor();
        livro.qualTituto();
        livro.localizacao();
        livro.descricao();
    }
}
