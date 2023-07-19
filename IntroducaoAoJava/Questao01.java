/*Escreva um programa que calcule a área de um quadrado.
O valor do lado de um quadrado deverá ser informado pelo usuário.*/

package IntroducaoAoJava;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        int lados;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor do lado de um quadrado: ");
        lados = input.nextInt();
        System.out.println("A área desse quadrado é: "+Math.pow(lados,2));
        input.close();
    }
}
