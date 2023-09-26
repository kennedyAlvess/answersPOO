package Provas.SegundaUnidade.P_2023_1_v2.Questao03;

import java.time.LocalDate;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
    private boolean status;
    private LocalDate inicioEmprestimo;
    private LocalDate fimEmprestimo;
    private String local;
    private String sobre;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDeEdicao, String local, String sobre) {
        super(titulo, autor, numeroDePaginas, anoDeEdicao);
        this.status = false;
        this.local = local;
        this.sobre = sobre;
        this.inicioEmprestimo = null;
        this.fimEmprestimo = null;
    }

    public boolean estaEmprestado() {
        return status;
    }
    public void empresta() {
        this.status = true;
        this.inicioEmprestimo = LocalDate.now();
        this.fimEmprestimo = this.inicioEmprestimo.plusDays(maximoDeDiasParaEmprestimo);
    }
    public void devolve() {
        this.status = false;
        this.inicioEmprestimo = null;
        this.fimEmprestimo = null;
    }
    public void localizacao() {
        System.out.println(local);
    }
    public void descricao() {
        System.out.println(sobre);
    }
    public void dataInicioEmprestimo(){
        System.out.println("Data inicio do emprestimo: "+((inicioEmprestimo!=null)? this.inicioEmprestimo : "Livro não emprestado"));
    }
    public void dataFinalEmprestimo(){
        System.out.println("Data Final do emprestimo: "+((fimEmprestimo!=null)? this.fimEmprestimo : "Livro não emprestado"));
    }
    @Override
    public String toString() {
        return super.toString()+
                "\nStatus do livro: "+((!status)?"Disponivel":"Emprestado")+
                "\nLocalização: "+local+
                "\nDescrição: "+sobre;
    }
}
