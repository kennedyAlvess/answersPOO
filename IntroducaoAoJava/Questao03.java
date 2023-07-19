/*Escreva um programa que receba um ângulo em graus e o converta para sua representação em radianos.
Divulgue também seno, cosseno, tangente, cossecante, secante e cotangente do ângulo.
 */
package IntroducaoAoJava;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        int angulo;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um ângulo em graus: ");
        angulo = input.nextInt();
        double toRadiano = Math.toRadians(angulo);
        double seno = Math.sin(angulo);
        double cos= Math.cos(angulo);
        double tg = Math.tan(angulo);
        double cossec = 1/seno;
        double sec = 1/cos;
        double cotg = 1/tg;

        System.out.println("Ângulo em radianos: "+toRadiano+
                "\nSeno: "+seno+
                "\nCosseno: "+cos+
                "\nTangente: "+tg+
                "\nCossecante: "+cossec+
                "\nSecante: "+sec+
                "\nCotangente: "+cotg);
        input.close();
    }
}
