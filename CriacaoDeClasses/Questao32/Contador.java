package CriacaoDeClasses.Questao32;

public class Contador {
    private int contadorEventos;

    public Contador() {
        this.contadorEventos = 0;
    }
    public void zerarContador(){
        contadorEventos = 0;
        System.out.println("Contador zerado!");
    }
    public void incrementarContador(){
        contadorEventos ++;
        System.out.println("Contador incrementado.");
    }
    public int getContadorEventos() {
        return contadorEventos;
    }
}
