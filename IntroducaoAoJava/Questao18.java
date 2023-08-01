package IntroducaoAoJava;

import java.util.Scanner;
public class Questao18 {
    public static void main(String[] args) {
        int base, expoente;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a base e o expoente: ");
        base = input.nextInt();
        expoente = input.nextInt();
        System.out.println("A potencia de base "+base+" e expoente "+expoente+" é igual a: "+potencia(base,expoente));
        input.close();
    }
    public static int potencia(int base, int expoente){
        return (expoente == 0)? 1 : base*potencia(base, expoente-1);
    }
}
