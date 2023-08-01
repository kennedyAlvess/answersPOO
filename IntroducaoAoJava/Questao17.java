package IntroducaoAoJava;

public class Questao17 {
    public static void main(String[] args) {
        int cont = 0, cidadeA = 7000, cidadeB = 20000;

        do{
            cidadeA += cidadeA*0.035;
            cidadeB += cidadeB*0.01;
            cont ++;
        }while (cidadeA < cidadeB);

        System.out.println("A quantidade de anos necessario para que a população da cidade A seja iguál ou maior que da cidade B é: "
                +cont+" anos.");



    }
}
