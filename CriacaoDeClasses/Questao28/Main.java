package CriacaoDeClasses.Questao28;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time("Corinthians","São Paulo");

        time1.jogar(2,1);
        time1.jogar(2,3);
        time1.jogar(2,2);

        System.out.println("Total de vitorias do time: "+time1.getVitorias());
        System.out.println("Total de pontos do time: "+time1.getPontos());

    }
}
