/*Escreva um programa que receba uma temperatura em graus centígrados e a apresente em graus Fahrenheit.*/
package IntroducaoAoJava;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        double temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Temperatura em graus centígrados: ");
        temp = Double.parseDouble(input.nextLine());
        System.out.println("A temperatura em graus Fahrenheit: "+(temp*1.8+32)+" ºF");
        input.close();
    }
}
