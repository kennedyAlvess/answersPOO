package Provas.PrimeiraUnidade.P_2022_2.Questao01;


public class Questao1 {
    public static void main(String[] args) {

        System.out.println("=== Números de 3 digitos cuja soma de seus algarismos são iguais ao próprio número ===.");
        for (int i = 100; i < 999; i++) {
            if (Math.pow(i / 100, 3) + Math.pow((i % 100) / 10, 3) + Math.pow(((i % 100) % 10) / 1, 3) == i) {
                System.out.println(i);
            }
        }

    }


}

