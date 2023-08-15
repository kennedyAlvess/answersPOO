package CriacaoDeClasses.Questao29;

public class Main {
    public static void main(String[] args) {
        Fatura boleto1 = new Fatura(123,"SSD",1,256.89);
        Fatura boleto2 = new Fatura(111,"RAM",-2,-113);

        System.out.println("Valor total do primeiro boleto: "+boleto1.calcularTotal());
        System.out.println("Valor total do segundo boleto: "+boleto2.calcularTotal());
    }
}
