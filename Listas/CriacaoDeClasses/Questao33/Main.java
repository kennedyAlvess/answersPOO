package Listas.CriacaoDeClasses.Questao33;

public class Main {
    public static void main(String[] args) {
        Lampada lam1 = new Lampada();
        lam1.mostraEstado();
        lam1.acende();
        lam1.apaga();
        lam1.acende();
        lam1.mostraEstado();
        System.out.println(lam1.estaLigada());
        System.out.println("A lampada foi acesa "+lam1.getContadorAcessa()+" vezes.");
    }
}
