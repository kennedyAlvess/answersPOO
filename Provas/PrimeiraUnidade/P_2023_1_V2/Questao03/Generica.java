package Provas.PrimeiraUnidade.P_2023_1_V2.Questao03;

public class Generica <T> {
    private T atributo1;
    private T atributo2;
    private T atributo3;

    public Generica(T atributo1, T atributo2, T atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    public int comparar(){
        if(atributo1.equals(atributo2) && atributo1.equals(atributo3) && atributo2.equals(atributo3)){
            return 3;
        }else if(atributo1.equals(atributo2) || atributo1.equals(atributo3) || atributo2.equals(atributo3)) {
            return 2;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Generica{" +
                "atributo1=" + atributo1 +
                ", atributo2=" + atributo2 +
                ", atributo3=" + atributo3 +
                '}';
    }
}
