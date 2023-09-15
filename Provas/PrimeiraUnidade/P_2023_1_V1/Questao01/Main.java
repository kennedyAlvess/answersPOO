package Provas.PrimeiraUnidade.P_2023_1_V1.Questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o código do setor: ");
        int cod = input.nextInt();
        System.out.println("Informe o valor do produto: ");
        double valor = input.nextDouble();

        input.close();

        switch (cod){
            case 111 ->{
                if( valor > 100) System.out.println("Setor "+cod+"\nValor com desconto: R$ "+(valor-(valor*0.4)));
                else if ( valor < 50) System.out.println("Setor "+cod+"\nValor com desconto: R$ "+(valor-(valor*0.1)));
                else System.out.println("Setor "+cod+"\nValor com desconto: R$ "+(valor-(valor*0.2)));
            }
            case 222 ->{
                if( valor > 500) System.out.println("Setor "+cod+"\nValor com desconto: R$ "+(valor-(valor*0.1)));
                else System.out.println("Produto não tem desconto aplicavel.\nValor do produto: R$ "+valor);
            }
            default -> System.out.println("Setor Invalido.");
        }

    }
}
