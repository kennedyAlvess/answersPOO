/*Escreva um programa que lê um número que representa o valor da carta, de um (ás) a treze (rei),
e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 = espadas).
O programa deve imprimir o nome da carta por extenso.
 */
package Listas.IntroducaoAoJava;

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        int cartaValor, naipe;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor da carta: ");
        cartaValor = input.nextInt();
        System.out.println("Informe o naipe da carta: ");
        naipe = input.nextInt();

        switch (naipe){
            case 1 -> {
                imprimir(cartaValor);
                System.out.println(" Ouro");
            }
            case 2 -> {
                imprimir(cartaValor);
                System.out.println(" Paus");
            }
            case 3 -> {
                imprimir(cartaValor);
                System.out.println(" Copas");
            }
            case 4 -> {
                imprimir(cartaValor);
                System.out.println(" Espadas");
            }
            default -> System.out.println("Valor invalido");
        }
        input.close();
    }

    public static void imprimir(int cartaValor){
        switch (cartaValor){
            case 1 -> System.out.print("Ás de");
            case 2 -> System.out.print("Dois de");
            case 3 -> System.out.print("Três de");
            case 4 -> System.out.print("Quatro de");
            case 5 -> System.out.print("Cinco de");
            case 6 -> System.out.print("Seis de");
            case 7 -> System.out.print("Sete de");
            case 8 -> System.out.print("Oito de");
            case 9 -> System.out.print("Nove de");
            case 10 -> System.out.print("Dez de");
            case 11 -> System.out.print("Valete de");
            case 12 -> System.out.print("Dama de");
            case 13 -> System.out.print("Reis de");
        }
    }
}
