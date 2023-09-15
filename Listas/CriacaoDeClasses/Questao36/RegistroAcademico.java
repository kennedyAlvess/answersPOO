package Listas.CriacaoDeClasses.Questao36;

public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private double percentualDeCobranca;
    private static int numeroDeMatriculas;
    public void inicializaRegistroAcademico(String n, int cod, double perc) {
        nome = n;
        numeroDeMatriculas++;
        matricula = String.valueOf(numeroDeMatriculas);
        codigoCurso = cod;
        percentualDeCobranca = perc;
    }
    public double calculaMensalidade() {
        return 100 * codigoCurso * percentualDeCobranca;
    }

    @Override
    public String toString() {
        return "RegistroAcademico{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", codigoCurso=" + codigoCurso +
                ", percentualDeCobranca=" + percentualDeCobranca +
                '}';
    }
}