package Provas.PrimeiraUnidade.P_2023_1_V1.Questao04;

public class NumeroComplexo {
    private double numeroReal;
    private double numeroImaginario;

    public NumeroComplexo(double numeroReal, double numeroImaginario) {
        this.numeroReal = numeroReal;
        this.numeroImaginario = numeroImaginario;
    }
    public NumeroComplexo(double numeroReal) {
        this.numeroReal = numeroReal;
        this.numeroImaginario = 0;
    }
    public NumeroComplexo() {
        this.numeroReal = 0;
        this.numeroImaginario = 0;
    }
    @Override
    public String toString() {
        return (this.numeroImaginario < 0)? "Número complexo: "+this.numeroReal+this.numeroImaginario+'i' :
                "Número complexo: "+this.numeroReal+'+'+this.numeroImaginario+'i';
    }
}

