package IntroducaoAoJava;

public class Questao15 {
    public static void main(String[] args) {
        int numero = 1, TotalDeNumerosPerfeitos = 0;
        System.out.println("Os 4 primeiros números perfeitos são: ");
        do{
            if(somaDosDivisores(numero) == numero){
                System.out.println(numero);
                TotalDeNumerosPerfeitos ++;
            }
            numero ++;
        }while (TotalDeNumerosPerfeitos != 4);
    }
    public static int somaDosDivisores(int numero){
        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if(numero%i == 0){
                soma += i;
            }
        }
        return soma;
    }
}
