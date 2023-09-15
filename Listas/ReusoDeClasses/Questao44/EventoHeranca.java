package Listas.ReusoDeClasses.Questao44;

public class EventoHeranca extends DataHora{
    private String evento;

    public EventoHeranca(String data, String hora, String evento) {
        super(data, hora);
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Evento: "+evento+"\nData e Hora: "+super.getData()+"\t"+super.getHora();
    }
}
