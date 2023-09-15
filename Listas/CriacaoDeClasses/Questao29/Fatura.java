package Listas.CriacaoDeClasses.Questao29;

public class Fatura {
    private int numeroIdentificador;
    private String descricaoDoProduto;
    private int quantidadeComprada;
    private double valorUnitario;

    public Fatura(int numeroIdentificador, String descricaoDoProduto, int quantidadeComprada, double valorUnitario) {
        if (quantidadeComprada < 0) this.quantidadeComprada = 0 ; else {this.quantidadeComprada = quantidadeComprada;}
        if (valorUnitario < 0) this.valorUnitario = 0 ; else {this.valorUnitario = valorUnitario;}
        this.numeroIdentificador = numeroIdentificador;
        this.descricaoDoProduto = descricaoDoProduto;
    }

    public double calcularTotal(){
        return quantidadeComprada*valorUnitario;
    }

}
