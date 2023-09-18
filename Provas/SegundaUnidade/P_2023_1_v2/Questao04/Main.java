package Provas.SegundaUnidade.P_2023_1_v2.Questao04;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String entrada = "HELLO THERE";

        TreeMap<Character, Integer> ocorrencias = new TreeMap<>();

        for (int i = 0; i < entrada.length(); i++) {
            Character key = entrada.charAt(i);
            if (ocorrencias.containsKey(key)) {
                int value = ocorrencias.get(key);
                ocorrencias.put(key, ++value);
            } else {
                if (!key.equals(' ')) ocorrencias.put(key, 1);
            }
        }
        System.out.println(ocorrencias);

    }
}
