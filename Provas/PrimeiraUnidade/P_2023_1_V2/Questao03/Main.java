package Provas.PrimeiraUnidade.P_2023_1_V2.Questao03;

public class Main {
    public static void main(String[] args) {
        Generica<Integer> obj1 = new Generica<>(1,2,2);
        Generica<Integer> obj2 = new Generica<>(1,2,2);
        Generica<Integer> obj3 = new Generica<>(2,2,2);
        Generica<Integer> obj4 = new Generica<>(3,2,1);
        Generica<Integer> obj5 = new Generica<>(3,3,1);

        System.out.println("===== TIPO INTEIRO =====");
        System.out.println("Atributos iguais: "+obj1.comparar());
        System.out.println("Atributos iguais: "+obj2.comparar());
        System.out.println("Atributos iguais: "+obj3.comparar());
        System.out.println("Atributos iguais: "+obj4.comparar());
        System.out.println("Atributos iguais: "+obj5.comparar());


        System.out.println("===== TIPO STRING =====");
        Generica<String> objS1 = new Generica<>("João","Maria","Fulano");
        Generica<String> objS2 = new Generica<>("João","João","Fulano");
        Generica<String> objS3 = new Generica<>("João","Maria","João");
        Generica<String> objS4 = new Generica<>("João","Maria","Maria");
        Generica<String> objS5 = new Generica<>("Fulano","Fulano","Fulano");

        System.out.println("Atributos iguais : "+objS1.comparar());
        System.out.println("Atributos iguais : "+objS2.comparar());
        System.out.println("Atributos iguais : "+objS3.comparar());
        System.out.println("Atributos iguais : "+objS4.comparar());
        System.out.println("Atributos iguais : "+objS5.comparar());


    }
}
