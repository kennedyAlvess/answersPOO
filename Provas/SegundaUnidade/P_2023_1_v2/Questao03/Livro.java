package Provas.SegundaUnidade.P_2023_1_v2.Questao03;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDeEdicao;

    public Livro(String titulo, String autor, int numeroDePaginas, int anoDeEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDeEdicao = anoDeEdicao;
    }
    public void qualTituto(){
        System.out.println(titulo);
    }
    public void qualAutor(){
        System.out.println(autor);
    }

    @Override
    public String toString() {
        return "Titulo do Livro: "+titulo+
                ", Ano de edição: "+anoDeEdicao+
                ", Escrito por "+autor+
                ", Contem "+numeroDePaginas+" paginas.";
    }

}
