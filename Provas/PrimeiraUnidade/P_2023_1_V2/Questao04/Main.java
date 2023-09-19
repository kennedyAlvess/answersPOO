package Provas.PrimeiraUnidade.P_2023_1_V2.Questao04;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(4,4);

        System.out.println("=== TESTANDO METODO ENTRA ===\n");
        for (int i = 0; i < 5; i++) {
            elevador.entra();
        }
        System.out.println("\n=== TESTANDO METODO SAI ===\n");
        for (int i = 0; i < 5; i++) {
            elevador.sai();
        }
        System.out.println("\n=== TESTANDO METODO SOBE ===\n");
        for (int i = 0; i < 5; i++) {
            elevador.sobe();
        }
        System.out.println("\n=== TESTANDO METODO DESCE ===\n");
        for (int i = 0; i < 5; i++) {
            elevador.desce();
        }
    }
}
