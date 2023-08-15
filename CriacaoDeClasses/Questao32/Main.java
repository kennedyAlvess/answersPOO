package CriacaoDeClasses.Questao32;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();

        contador.incrementarContador();
        contador.incrementarContador();
        System.out.println("Valor do contador atual: "+contador.getContadorEventos());
        contador.zerarContador();
        System.out.println("Valor do contador atual: "+contador.getContadorEventos());

    }

}
