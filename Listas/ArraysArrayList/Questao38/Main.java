package Listas.ArraysArrayList.Questao38;

public class Main {
    public static void main(String[] args) {
        EntradaEmAgenda entradaUm = new EntradaEmAgenda("12/12/2012","12:12","Evento 1");
        EntradaEmAgenda entradaDois = new EntradaEmAgenda("01/06/2023","20:00","Evento 2");
        EntradaEmAgenda entradaTres = new EntradaEmAgenda("12/12/2012","07:15","Evento 3");

        Agenda minhaAgenda = new Agenda();
        minhaAgenda.adicionarCompromisso(entradaUm);
        minhaAgenda.adicionarCompromisso(entradaDois);
        minhaAgenda.adicionarCompromisso(entradaTres);

        minhaAgenda.imprimirAgenda();
        System.out.println("\n=============================================\n");

        minhaAgenda.listaDia("12/12/2012");

    }
}
