/*Escreva um programa que lê três números e determina qual número é o menor.*/
package IntroducaoAoJava;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        double num, menor = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o "+(i+1)+" º número:");
            num = input.nextDouble();
            if (i == 0){
                menor = num;
            }else if( num < menor){
                menor = num;
            }
        }
        System.out.println("O menor número é: "+menor);

        input.close();
    }
}
