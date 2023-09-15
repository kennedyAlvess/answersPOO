package Listas.ReusoDeClasses.Questao44;

public class Main {
    public static void main(String[] args) {
        EventoDelegacao eventoDelegacao = new EventoDelegacao("01/05/2023","22:00","Atividade");
        EventoHeranca eventoHeranca = new EventoHeranca("01/01/2023","11:11","Dia 1 de 2023");

        System.out.println("=== Evento delegação ===");
        System.out.println(eventoDelegacao);
        System.out.println("\n=== Evento herança ===");
        System.out.println(eventoHeranca);
    }
}
