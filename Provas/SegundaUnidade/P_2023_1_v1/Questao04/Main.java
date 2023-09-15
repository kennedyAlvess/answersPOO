package Provas.SegundaUnidade.P_2023_1_v1.Questao04;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a string contendo apenas ( e ) : ");
        String parenteses = input.nextLine();
        input.close();

        if (checkBalance(parenteses)){
            System.out.println("Balanceada.");
        }else{
            System.out.println("Não balanceada.");
        }
    }
    public static boolean checkBalance(String entrada){
        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < entrada.length(); i++) {
            char aux = entrada.charAt(i);
            if ( aux == '('){
                pilha.push(aux);
            } else if (aux == ')') {
                if (pilha.isEmpty()) return false;
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }
}
