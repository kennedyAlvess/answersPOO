package IntroducaoAoJava;

import java.util.Scanner;
public class Questao19 {
    public static void main(String[] args) {
        int num;
        String tabulacao = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o número para calcular seu fatorial: ");
        num = input.nextInt();
        input.close();
        for (int i = 0; i <= num; i++) {
            System.out.println(tabulacao+i+"! = "+fat(i));
            tabulacao += "\t\t";
        }
    }
    
    public static int fat(int numero){
        if (numero < 2) {
            return 1;
        }else {
            return numero*fat(numero-1);
        }
    }
}
