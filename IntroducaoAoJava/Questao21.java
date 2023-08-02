package IntroducaoAoJava;

import java.util.Scanner;
public class Questao21 {
    public static void main(String[] args) {
        int numCheck;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numCheck = input.nextInt();
        if(ehPrimo(numCheck)){
            System.out.println("O número informado é primo.");
        }else {
            System.out.println("O número informado não é primo.");
        }
        input.close();
    }
    public static boolean ehPrimo(int numero){
        return verificarPrimo(numero,2);
    }
    public static boolean verificarPrimo(int numero,int divisor){
        if(divisor == numero ){
            return true;
        } else if (numero%divisor == 0) {
            return false;
        }else {
           return verificarPrimo(numero,divisor+1);
        }
    }
}
