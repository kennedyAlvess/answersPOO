package ArraysArrayList.Questao39;

import java.util.Scanner;

public class Matriz {
    private float[][] matriz;

    public Matriz() {
        this.matriz = new float [2][2];
        preencherMatriz();
    }
    private void preencherMatriz(){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("["+i+"] "+"["+j+"]: ");
                matriz[i][j] = input.nextFloat();
            }
        }
        input.close();
    }

    public float calcularDeterminante(){
        return (matriz[0][0]*matriz[1][1]) - (matriz[0][1]*matriz[1][0]);
    }

    public void imprimirMatriz(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j]+" ");
            }
        }
    }
}
