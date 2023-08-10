package CriacaoDeClasses.Questao28;

public class Time {

    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int pontos;
    private String regiao;

    public Time(String nome, String regiao) {
        this.nome = nome;
        this.regiao = regiao;
        this.pontos = 0;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
    }


    public void jogar(int golsEsteTime, int golsTime2) {
        if(golsEsteTime > golsTime2){
            System.out.println("== Vitória do time ==");
            this.vitorias++;
            this.pontos += 3;
        } else if (golsEsteTime == golsTime2) {
            System.out.println("== Empate do time ==");
            this.empates++;
            this.pontos += 1;
        }else{
            System.out.println("== Derrota do time ==");
            this.derrotas++;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public int getPontos() {
        return pontos;
    }

    public String getRegiao() {
        return regiao;
    }
}
