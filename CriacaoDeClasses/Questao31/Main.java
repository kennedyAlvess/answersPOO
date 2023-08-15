package CriacaoDeClasses.Questao31;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(3,3);

        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();

        System.out.println();

        elevador.sai();
        elevador.sai();
        elevador.sai();
        elevador.sai();

        System.out.println();

        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();

        System.out.println();

        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.desce();
    }
}
