package Provas.SegundaUnidade.P_2023_1_v1.Questao01;

public class Main {
    public static void main(String[] args) {
        EntradaEmAgenda entradaUm = new EntradaEmAgenda("12/12/2012","12:12","Evento UM");
        EntradaEmAgenda entradaDois = new EntradaEmAgenda("01/06/2023","20:00","Evento DOIS");
        EntradaEmAgenda entradaTres = new EntradaEmAgenda("12/12/2012","07:15","Evento TRÊS");

        Agenda minhaAgenda = new Agenda();
        minhaAgenda.adicionarCompromisso(entradaUm);
        minhaAgenda.adicionarCompromisso(entradaDois);
        minhaAgenda.adicionarCompromisso(entradaTres);

        System.out.println("\n============== IMPRIMINDO AGENDA ==================\n");

        minhaAgenda.imprimirAgenda();

        System.out.println("\n=============== LISTANDO EVENTO NO DIA ESPECÍFICO ================\n");

        minhaAgenda.listaDia("12/12/2012");

    }
}
