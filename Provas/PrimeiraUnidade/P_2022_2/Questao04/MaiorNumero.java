package Provas.PrimeiraUnidade.P_2022_2.Questao04;

public class MaiorNumero {
    public static void maiorDouble(double... numeros){
        double maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println("Maior entre os "+numeros.length+" números: "+maior);
    }
    public static void maiorInteiro(int... numeros){
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println("Maior entre os "+numeros.length+" numeros: "+maior);
    }
}
