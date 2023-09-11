package ReusoDeClasses.Questao44;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DataHora {
    private LocalDate data;
    private LocalTime hora;

    public DataHora(String data, String hora){
        this.data = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.hora = LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm"));
    }
    public LocalDate getData() {
        return data;
    }
    public LocalTime getHora() {
        return hora;
    }

}
