import java.util.Scanner;
public class TrianguloPascal {
    public static void main(String[] args) {
        int linhas;
        Scanner input = new Scanner(System.in);
        System.out.println("Quantas linhas o triangulo deve ter?");
        linhas = input.nextInt();
        int[][] pascal = new int [linhas][];

        for (int i = 0; i < linhas; i++) {
            int colunas = i +2;
            pascal[i] = new int[colunas];
            pascal[i][0] = 1;
            pascal[i][pascal[i].length-1] = 1;
            for (int j = 1; j < colunas - 1 ; j++) {
                pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < pascal[i].length; j++) {
                System.out.print(" "+pascal[i][j]);
            }
            System.out.println();
        }
        input.close();
    }
}
