package ReusoDeClasses.Questao45;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LivroBiblioteca extends Livro{
    private boolean situacao;
    private LocalDate dataRetirada;
    private LocalDate dataEntrega;
    private String genero;

    public LivroBiblioteca(String autor, String titulo, int quantidadePaginas, String genero) {
        super(autor, titulo, quantidadePaginas);
        this.situacao = true;
        this.genero = genero;
    }

    public void renovarEmprestimo(){
        dataEntrega = dataEntrega.plusDays(7);
        System.out.println("Emprestimo do livro "+super.getTitulo()+" foi renovado."
        +"\nNova data de entrega: "+dataEntrega.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    public void realizarEmprestimo(){
        this.dataRetirada = LocalDate.now();
        this.dataEntrega = this.dataRetirada.plusDays(14);
        this.situacao = false;
    }
    public void isSituacao() {
        if(situacao) System.out.println("Disponivel");
        else System.out.println("Emprestado");
    }

    public String getDataRetirada() {
        return this.dataRetirada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getDataEntrega() {
        return this.dataEntrega.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        if(this.situacao){
            return super.toString()+
                    "\nSituação: Disponivel"+
                    "\nGenero: "+genero;
        }else{
            return super.toString()+
                    "\nSituação: Emprestado"+
                    "\nGenero: "+genero
                    +"\nData que foi realizado o emprestimo: "+dataRetirada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                    +"\nData para devolução: "+dataEntrega.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }
    }
}
