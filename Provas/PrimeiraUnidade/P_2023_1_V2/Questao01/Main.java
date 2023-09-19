package Provas.PrimeiraUnidade.P_2023_1_V2.Questao01;

public class Main {
    public static void main(String[] args) {
        int numerosPerfeitos = 0;

        System.out.println("Os 4 primeiros números perfeitos: ");
        for (int i = 1; numerosPerfeitos < 4 ; i++) {
            if (somarDivisores(i)){
                System.out.println(i);
                ++numerosPerfeitos;
            }
        }
    }
    public static boolean somarDivisores(int numero){
        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if(numero%i == 0) soma += i;
        }
        return (soma==numero);
    }
}
