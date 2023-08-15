package CriacaoDeClasses.Questao30;
public class Aluno {
    private String matricula;
    private String nome;
    private double primeiraNota;
    private double segundaNota;
    private double trabalhoNota;

    public Aluno(String aluno, String nome, double primeiraNota, double segundaNota, double trabalhoNota) {
        this.matricula = aluno;
        this.nome = nome;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
        this.trabalhoNota = trabalhoNota;
    }
    public double media(){
        double nota1 = this.primeiraNota*2.5;
        double nota2 = this.segundaNota*2.5;
        double nota3 = this.trabalhoNota*2;
        return (nota1+nota2+nota3)/7;
    }
    public double provaFinal(){
        double mediaParcial = media();
        if(mediaParcial < 3 ){
            return 1;
        } else if (mediaParcial >= 7) {
            return 0;
        } else{
            return (50-(mediaParcial*6))/4;
        }
    }

    public String getNome() {
        return nome;
    }

}

