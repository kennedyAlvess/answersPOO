/*Escreva um programa que calcule a soma e a média aritmética de 3 números.
Os 3 valores reais serão informados pelo usuário.*/
package Listas.IntroducaoAoJava;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        double num, somaTotal = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Informe o "+(i+1)+"º número: ");
            num = input.nextDouble();
            somaTotal += num;
        }
        input.close();
        System.out.println("A soma dos números é: "+somaTotal+", e sua média é: "+somaTotal/3);
    }
}
