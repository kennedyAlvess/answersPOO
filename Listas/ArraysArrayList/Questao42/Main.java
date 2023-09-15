package Listas.ArraysArrayList.Questao42;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] frequenciaDeSoma = new int[11];
        int num1, num2, soma;
        Random gerador = new Random();

        for (int i = 1; i <= 36000000 ; i++) {
            num1 = gerador.nextInt(1,7);
            num2 = gerador.nextInt(1,7);
            soma = num1+num2;
            frequenciaDeSoma[soma-2] ++;
        }
        System.out.println("Frequencia de cada soma: ");
        for (int i = 0; i < 11 ; i++) {
            System.out.println(i+2+" : "+frequenciaDeSoma[i]+" vezes.");
        }
    }
}
