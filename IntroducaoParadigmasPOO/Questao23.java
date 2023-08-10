package IntroducaoParadigmasPOO;

public class Questao23 {
    private double valor;
    private double potencia;
    private String tipo;
    private String marca;

    public Questao23(double valor, double potencia, String tipo, String marca) {
        this.valor = valor;
        this.potencia = potencia;
        this.tipo = tipo;
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Info. Lampada:\n" +
                "valor = " + valor +
                " R$ Reais\nPotência = " + potencia +
                "\nTipo = " + tipo +
                "\nMarca='" + marca ;
    }
}
