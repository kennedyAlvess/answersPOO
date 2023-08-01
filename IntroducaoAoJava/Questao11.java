/*Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y
e informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro.*/
package IntroducaoAoJava;
import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        double x1, y1, x2, y2;
        String resposta= "";
        Scanner input = new Scanner(System.in);

        System.out.println("Informe as cordenadas do primeiro ponto: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.println("Informe as cordenadas do segundo ponto: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        input.close();

        if(x2 > x1){
            resposta += "O segundo ponto está à direita do primeiro ponto.\n";
        } else if (x2 < x1) {
            resposta += "O segundo ponto está à esquerda do primeiro ponto.\n";
        }else {
            resposta += "Os pontos possuem coordenadas X iguais.\n";
        }

        if(y2 > y1){
            resposta += "O segundo ponto está acima do primeiro ponto.";
        } else if (y2 < y1) {
            resposta += "O segundo ponto está abaixo do primeiro ponto.";
        }else{
            resposta += "Os pontos possuem coordenadas Y iguais.";
        }

        System.out.println(resposta);
    }
}
