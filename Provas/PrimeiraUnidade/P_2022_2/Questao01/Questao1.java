package Provas.PrimeiraUnidade.P_2022_2.Questao01;


public class Questao1 {
    public static void main(String[] args) {

        System.out.println("=== Números de 3 algarismos cuja soma dos cubos de seus algarismos é igual ao próprio número.  ===.");
        for (int i = 100; i < 999; i++) {
            if (somarAlgarismos(i) == i){
                System.out.println(i);
            }
        }

    }
    public static int somarAlgarismos(int num){
        int cuboPrimeiroAlgarismo = (int) Math.pow(num/100,3);
        int cuboSegundoAlgarismo = (int) Math.pow((num%100)/10,3);
        int cuboTerceiroAlgarismo = (int) Math.pow((num%100)%10, 3);

        return cuboPrimeiroAlgarismo + cuboSegundoAlgarismo + cuboTerceiroAlgarismo;
    }
}

