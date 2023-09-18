package Provas.SegundaUnidade.P_2023_1_v1.Questao01;

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
        return dataComparar.equals(this.data);
    }
    @Override
    public String toString() {
        return "Data: "+data+'\n'
                +"Horario: "+hora+'\n'
                +"Assunto: "+assunto;
    }
}