package ReusoDeClasses.Questao45;

public class Livro {
    private String autor;
    private String titulo;
    private int quantidadePaginas;

    public Livro(String autor, String titulo, int quantidadePaginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    @Override
    public String toString() {
        return "Livro: "+titulo+" ("+quantidadePaginas+" páginas)"+
                "\nAutor: "+autor ;
    }
}
