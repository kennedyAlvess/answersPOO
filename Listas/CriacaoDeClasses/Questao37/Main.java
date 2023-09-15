package Listas.CriacaoDeClasses.Questao37;

public class Main {
    public static void main(String[] args) {
        Generica<Integer> obj1 = new Generica<>(1,1,2);
        Generica<Integer> obj2 = new Generica<>(2,1,2);
        Generica<Integer> obj3 = new Generica<>(1,1,1);
        Generica<Integer> obj4 = new Generica<>(1,2,3);
        Generica<Integer> obj5 = new Generica<>(1,3,3);

        System.out.println("====== TIPO INTEIRO ======");
        System.out.println(obj1.comparar());
        System.out.println(obj2.comparar());
        System.out.println(obj3.comparar());
        System.out.println(obj4.comparar());
        System.out.println(obj5.comparar());

        System.out.println("====== TIPO STRING ======");
        Generica<String> objS1 = new Generica<>("Joao","Maria","Fulano");
        Generica<String> objS2 = new Generica<>("Joao","Joao","Fulano");
        Generica<String> objS3 = new Generica<>("Joao","Maria","Joao");
        Generica<String> objS4 = new Generica<>("Joao","Maria","Maria");
        Generica<String> objS5 = new Generica<>("Maria","Maria","Maria");

        System.out.println(objS1.comparar());
        System.out.println(objS2.comparar());
        System.out.println(objS3.comparar());
        System.out.println(objS4.comparar());
        System.out.println(objS5.comparar());


    }
}
