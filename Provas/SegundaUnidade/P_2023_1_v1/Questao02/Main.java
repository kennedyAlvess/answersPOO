package Provas.SegundaUnidade.P_2023_1_v1.Questao02;

public class Main {
    public static void main(String[] args) {
        Administrativo adm = new Administrativo("Joao",2000,"111111","Dia");
        Administrativo adm2 = new Administrativo("Fulano",2200,"222222","Noite",150.50);

        Tecnico tec = new Tecnico("Maria",2500.49,"333333",230);

        System.out.println("\n===== ASSISTENTES ADMINISTRATIVOS =====\n");
        System.out.println(adm + "\n" + adm.ganhoAnual());
        System.out.println(adm2 + "\n" + adm2.ganhoAnual());

        System.out.println("\n===== ASSISTENTES TECNICOS =====\n");
        System.out.println(tec.ganhoAnual());
        tec.aumentarSalario(100);
        System.out.println(tec.ganhoAnual());
        System.out.println(tec);
    }
}
