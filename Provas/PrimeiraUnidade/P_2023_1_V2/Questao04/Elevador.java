package Provas.PrimeiraUnidade.P_2023_1_V2.Questao04;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeMax;
    private int totalPessoas;

    public Elevador(int totalAndares, int capacidadeMax) {
        this.totalAndares = totalAndares;
        this.capacidadeMax = capacidadeMax;
        this.andarAtual = 0;
        this.totalPessoas = 0;
    }

    public void entra(){
        if(totalPessoas == capacidadeMax ){
            System.out.println("Elevador lotado.");
        }else {
            System.out.println("Pessoa entrando no elevador...");
            totalPessoas++;
            System.out.println("Total de pessoas no elevador atualmente: "+totalPessoas);
        }
    }
    public void sai(){
        if(totalPessoas == 0){
            System.out.println("Elevador vazio.");
        }else {
            System.out.println("Pessoa saindo do elevador...");
            totalPessoas--;
            System.out.println("Total de pessoas no elevador atualmente: "+totalPessoas);
        }
    }

    public void sobe(){
        if(andarAtual == totalAndares){
            System.out.println("Elevador na cobertura!");
        }else {
            System.out.println("Elevador subindo...");
            andarAtual++;
            System.out.println("Andar atual do elevador: "+andarAtual);
        }
    }
    public void desce(){
        if(andarAtual == 0){
            System.out.println("Elevador no terreo!");
        }else {
            System.out.println("Elevador descendo...");
            andarAtual--;
            System.out.println("Andar atual do elevador: "+andarAtual);
        }
    }
}
