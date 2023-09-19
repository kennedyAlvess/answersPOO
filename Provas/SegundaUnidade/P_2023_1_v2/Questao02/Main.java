package Provas.SegundaUnidade.P_2023_1_v2.Questao02;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria","123.321.231-00");
        Politico politico = new Politico("Joao","123.456.789-10","BBB");
        Prefeito prefeito = new Prefeito("Fulano","098.765.432-11","AAA","Taipei");
        Governador governador = new Governador("Beltrano","111.222.333-44","CCC","Paraíba");

        System.out.println("=== CLASSE PESSOA ===");
        System.out.println(pessoa);
        System.out.println("\n=== CLASSE POLITICO ===\n");
        System.out.println(politico);
        System.out.println("\n=== CLASSE PREFEITO ===\n");
        System.out.println(prefeito);
        System.out.println("\n=== CLASSE GOVERNADOR ===\n");
        System.out.println(governador);
    }
}
