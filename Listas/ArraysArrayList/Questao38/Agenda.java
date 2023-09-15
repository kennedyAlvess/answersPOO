package Listas.ArraysArrayList.Questao38;


import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> agendaCompromisso;

    public Agenda() {
        this.agendaCompromisso = new ArrayList<>();
    }

    public void adicionarCompromisso(EntradaEmAgenda compromisso){
        agendaCompromisso.add(compromisso);
        System.out.println("Compromisso adicionado com sucesso!");
    }

    public void listaDia(String data){
        agendaCompromisso.forEach(compromisso ->
        {if(compromisso.ehNoDia(data))
            System.out.println(compromisso+"\n");});
    }
    public void imprimirAgenda(){
        agendaCompromisso.forEach(compromisso -> System.out.println(compromisso+"\n"));
    }
}
