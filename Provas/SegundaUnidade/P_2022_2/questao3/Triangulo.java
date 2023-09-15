package Provas.SegundaUnidade.P_2022_2.questao3;

public class Triangulo extends FiguraGeometrica {
    private String tipo;

    public Triangulo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void desenha() {
        System.out.println("Desenhando um triangulo "+this.tipo);
    }
}
