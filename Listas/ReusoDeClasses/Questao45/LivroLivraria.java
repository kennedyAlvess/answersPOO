package Listas.ReusoDeClasses.Questao45;

public class LivroLivraria extends Livro {
    private double preco;
    private String estado;

    public LivroLivraria(String autor, String titulo, int quantidadePaginas, double preco, String estado) {
        super(autor, titulo, quantidadePaginas);
        this.preco = preco;
        this.estado = estado;
    }
    @Override
    public String toString() {
        return super.toString()
                +"\nQuanto custa: R$ "+preco
                +"\nEstado do livro: "+estado;
    }
}
