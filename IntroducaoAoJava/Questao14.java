package IntroducaoAoJava;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número maior que 0: ");
        n = input.nextInt();
        System.out.println("Série de Fibonacci até o número "+n+".");
        input.close();

        for (int i = 1; i <= n ; i++) {
            System.out.println(fib(i));
        }
    }
    public static int fib(int numero){
        return (numero >= 2) ? fib(numero - 1) + fib(numero - 2) : numero;
    }
}

