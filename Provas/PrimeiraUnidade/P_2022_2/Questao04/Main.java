package Provas.PrimeiraUnidade.P_2022_2.Questao04;

import Listas.CriacaoDeClasses.Questao35.MaiorNumero;

public class Main {
    public static void main(String[] args) {
        MaiorNumero.maiorInteiro(1,2);
        MaiorNumero.maiorInteiro(1,2,2);
        MaiorNumero.maiorInteiro(1,2,3,5);
        MaiorNumero.maiorInteiro(1,2,1,6,7);

        System.out.println("====================");

        MaiorNumero.maiorDouble(7.2,2.5);
        MaiorNumero.maiorDouble(7.2,2.5,10.0);
        MaiorNumero.maiorDouble(7.2,2.5,9.9,5.9);
        MaiorNumero.maiorDouble(7.2,2.5,1.4,1.5,20.0);

    }
}
