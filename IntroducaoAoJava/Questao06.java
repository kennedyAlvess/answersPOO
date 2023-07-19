/*Escreva um programa que recebe um valor inteiro representando um intervalo em minutos
e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e minutos.
Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.*/
package IntroducaoAoJava;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        int numMinutos, totalDias, totalHoras, totalMinutos;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor em minutos: ");
        numMinutos = input.nextInt();
        input.close();
        totalDias = numMinutos/1440;
        totalHoras = (numMinutos%1440)/60;
        totalMinutos = (numMinutos%1440)%60;
        System.out.println(numMinutos+" minutos = "+totalDias+" dias,"+totalHoras+" horas e "+totalMinutos+" minutos.");
    }
}
