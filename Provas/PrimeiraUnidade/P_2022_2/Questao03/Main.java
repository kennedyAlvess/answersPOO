package Provas.PrimeiraUnidade.P_2022_2.Questao03;

import Listas.CriacaoDeClasses.Questao31.Elevador;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(3,3);

        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();

        System.out.println();

        elevador.sai();
        elevador.sai();
        elevador.sai();
        elevador.sai();

        System.out.println();

        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();

        System.out.println();

        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.desce();
    }
}
