package ReusoDeClasses.Questao44;

public class EventoDelegacao {
    private DataHora dataHora;
    private String evento;

    public EventoDelegacao(String data, String hora, String evento) {
        this.dataHora = new DataHora(data,hora);
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Evento: "+evento+"\nData e Hora do evento: "+dataHora.getData()+"\t"+dataHora.getHora();
    }
}
