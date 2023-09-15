package Listas.ArraysArrayList.Questao38;

public class EntradaEmAgenda {
    private String data;
    private String hora;
    private String assunto;

    public EntradaEmAgenda(String data, String hora, String assunto) {
        this.data = data;
        this.hora = hora;
        this.assunto = assunto;
    }

    public boolean ehNoDia(String dataComparar){
        if (dataComparar.equals(this.data)) return true;
        return false;
    }
    @Override
    public String toString() {
        return "Data: "+data+'\n'
                +"Horario: "+hora+'\n'
                +"Assunto: "+assunto;
    }
}