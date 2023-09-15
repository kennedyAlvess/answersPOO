package Listas.CriacaoDeClasses.Questao36;

public class Main {
    public static void main(String[] args) {
        RegistroAcademico registro1 = new RegistroAcademico();
        RegistroAcademico registro2 = new RegistroAcademico();
        RegistroAcademico registro3 = new RegistroAcademico();

        registro1.inicializaRegistroAcademico("Maria",111,0.50);
        registro2.inicializaRegistroAcademico("Joao",222,0.60);
        registro3.inicializaRegistroAcademico("Chico",333,0.70);

        System.out.println(registro1);
        System.out.println(registro2);
        System.out.println(registro3);
    }
}
