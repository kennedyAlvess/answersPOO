package ArraysArrayList.Questao41;

public class Main {
    public static void main(String[] args) {
        System.out.println(produto(1,2));
        System.out.println(produto(1,2,3));
        System.out.println(produto(1,2,3,4));
        System.out.println(produto(1,2,3,4,5));
    }

    public static int produto(int... numeros) {
        int resultado = 1;
        for (int num : numeros) {
            resultado *= num;
        }
        return resultado;
    }
}
