package IntroducaoAoJava;

import java.util.Scanner;
public class Questao22 {
    public static void main(String[] args) {
        int grauN;
        double x;
        double[] coeficientes;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o grau do polinômio (n): ");
        grauN = input.nextInt();

        coeficientes = new double[grauN + 1];

        System.out.println("Digite os coeficientes do polinômio :");
        for (int i = 0; i <= grauN; i++) {
            System.out.print("a" + i + ": ");
            coeficientes[i] = input.nextDouble();
        }

        System.out.print("Digite o valor de x: ");
        x = input.nextDouble();

        System.out.println("O valor do polinômio Pn(x) é: " + calcularPolinomio(grauN, coeficientes, x));

    }

    public static double calcularPolinomio(int n, double[] coeficientes, double x) {
        if (n == 0) {
            return coeficientes[0];
        } else {
            return x * calcularPolinomio(n - 1, coeficientes, x) + coeficientes[n];
        }
    }
}
