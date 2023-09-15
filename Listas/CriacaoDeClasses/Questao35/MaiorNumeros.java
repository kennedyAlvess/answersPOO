package Listas.CriacaoDeClasses.Questao35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MaiorNumeros {
    public static void maiorInt(Integer... numeros){
        ArrayList<Integer> numerosInteiros = new ArrayList<>(Arrays.asList(numeros));
        System.out.println("Maior numero: "+ Collections.max(numerosInteiros));
    }
    public static void maiorDoub(Double... numeros){
        ArrayList<Double> numerosInteiros = new ArrayList<>(Arrays.asList(numeros));
        System.out.println("Maior numero: "+ Collections.max(numerosInteiros));
    }

}
