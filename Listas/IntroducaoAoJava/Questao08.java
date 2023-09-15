/*Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em dois setores:
No setor de Eletros, que possui código 222, todas as peças que custam mais de R$ 500 vão ter 10% de desconto.
No setor de Cama, mesa e banho, que possui código 111, peças com valor acima de R$ 100 vão ter 40% de desconto,
peças que custam entre R$ 50 e R$ 100 vão ter 20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.
Escreva um programa que recebe do usuário o código do setor da loja e o valor original de um produto
e imprime na tela o nome do setor e o valor do produto com desconto.
Caso o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido.*/
package Listas.IntroducaoAoJava;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        double valor;
        int cod;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o código do setor referente a compra: ");
        cod = input.nextInt();
        System.out.println("Qual o valor do produto: ");
        valor = input.nextDouble();

        switch (cod) {
            case 222 -> {
                if (valor > 500) {
                    System.out.println(cod + " - R$ " + (valor - (valor * 0.1)) + " reais.");
                } else {
                    System.out.println(cod + " - R$ " + valor + " reais.");
                }
            }
            case 111 -> {
                if (valor > 100) {
                    System.out.println(cod + " - R$ " + (valor - (valor * 0.4)) + " reais.");
                } else if (valor < 50) {
                    System.out.println(cod + " - R$ " + (valor - (valor * 0.1)) + " reais.");
                } else {
                    System.out.println(cod + " - R$ " + (valor - (valor * 0.2)) + " reais.");
                }
            }
            default -> System.out.println("Setor invalido");
        }
        input.close();
    }
}
