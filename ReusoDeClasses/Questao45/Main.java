package ReusoDeClasses.Questao45;

public class Main {
    public static void main(String[] args) {
        LivroBiblioteca livroBiblioteca = new LivroBiblioteca("Kennedy","Livro Teste",120,"Comedia");
        LivroLivraria livroLivraria = new LivroLivraria("Kenedy","Livro teste2",100,159.89,"Semi Novo");

        System.out.println("=== LIVRO LIVRARIA ===");
        System.out.println(livroLivraria);

        System.out.println("\n=== LIVRO BIBLIOTECA ===");
        System.out.println(livroBiblioteca);

        System.out.println("\n=== REALIZANDO EMPRESTIMO ===");
        livroBiblioteca.realizarEmprestimo();
        System.out.println(livroBiblioteca);

        System.out.println("\n=== RENOVANDO EMPRESTIMO ===");
        System.out.println("Data de devolução antes da renovação: "+livroBiblioteca.getDataEntrega());
        livroBiblioteca.renovarEmprestimo();

    }
}
