package IntroducaoAoJava;

public class Questao13 {
    public static void main(String[] args) {
        int[][] megaSena = new int[6][10];
        int cont = 0;

        for (int linha = 0; linha < megaSena.length ; linha++) {
            for (int coluna = 0; coluna < megaSena[linha].length; coluna++) {
                cont += 1;
                megaSena[linha][coluna] = cont;
            }
        }

        for (int[] ints : megaSena) {
            for (int anInt : ints) {
                if (anInt < 10) {
                    System.out.print("[0" + anInt + "]\t");
                } else {
                    System.out.print("[" + anInt + "]\t");
                }
            }
            System.out.println();
        }

    }
}
