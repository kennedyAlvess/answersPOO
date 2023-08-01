package IntroducaoAoJava;

public class Questao16 {
    public static void main(String[] args) {
        int centena, dezena, unidade;
        System.out.println("Todos os números de 3 algarismos cuja soma dos cubos de seus algarismos são iguais ao próprio número: ");
        for (int i = 100; i < 1000 ; i++) {
            centena = i/100;
            dezena = i%100/10;
            unidade = i%100%10;
            if (Math.pow(centena,3) + Math.pow(dezena,3) + Math.pow(unidade,3) == i){
                System.out.println(i);
            }
        }
    }
}
