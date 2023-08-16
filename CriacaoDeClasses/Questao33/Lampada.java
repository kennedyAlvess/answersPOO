package CriacaoDeClasses.Questao33;

import CriacaoDeClasses.Questao32.Contador;

public class Lampada {
    private boolean estadoDaLampada;
    private Contador contadorAcessa;
    public Lampada() {
        this.estadoDaLampada = false;
        this.contadorAcessa = new Contador();
    }
    public void acende(){
        estadoDaLampada = true;
        contadorAcessa.incrementarContador();
    }
    public void apaga(){
        estadoDaLampada = false;
    }
    public void mostraEstado(){
        if(estadoDaLampada) System.out.println("Lampada acesa!");
        else System.out.println("Lampada apagada!");
    }
    public boolean estaLigada(){
        return estadoDaLampada;
    }
    public int getContadorAcessa() {
        return contadorAcessa.getContadorEventos();
    }
}
