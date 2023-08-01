package IntroducaoAoJava;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        int dia;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o dia a ser verificada: ");
        dia = input.nextInt();
        input.close();

        switch (dia){
            case 1,8,15,22:
                System.out.println("Domingo");
                break;
            case 2,9,16,23:
                System.out.println("Segunda-Feira");
                break;
            case 3,10,17,24:
                System.out.println("Terça-Feira");
            case 4,11,18,25:
                System.out.println("Quarta-Feira");
                break;
            case 5,12,19,26:
                System.out.println("Quinta-Feira");
                break;
            case 6,13,20,27:
                System.out.println("Sexta-Feira");
                break;
            case 7,14,21,28:
                System.out.println("Sabado");
                break;
            default: System.out.println("Valor Invalido");
        }
    }
}