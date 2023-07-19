/*Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena, Dezena e Unidade) e,
utilizando operadores aritméticos, armazene cada dígito em uma variável de tipo inteiro.
Por fim, reescreva o número no formato UCD. Exemplo: 123 deve ser reescrito como 312.
 */
package IntroducaoAoJava;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        int numCDU;
        int centena, dezena, unidade;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Informe um número de 3 dígitos: ");
            numCDU = input.nextInt();
            if (numCDU < 100 || numCDU > 999) {
                System.out.println("Número invalido.");
            }
        } while(numCDU < 100 || numCDU > 999);

        centena = numCDU/100;
        dezena = (numCDU%100)/10;
        unidade = (numCDU%100)%10;

        System.out.println("Número no formato UCD: "+unidade+centena+dezena);

        input.close();
    }
}

