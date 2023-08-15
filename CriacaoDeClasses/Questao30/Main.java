package CriacaoDeClasses.Questao30;

import java.text.DecimalFormat;
import java.text.Format;

public class Main {
    public static void main(String[] args) {
        final Format formatar = new DecimalFormat(".##");

        Aluno aluno1 = new Aluno("2019101213","Kennedy",3,3,3);

        System.out.println("Media parcial do aluno "+aluno1.getNome()+" : "
                +formatar.format(aluno1.media()));

        if(aluno1.provaFinal() == 0){
            System.out.println("Aluno passou por média");
        } else if (aluno1.provaFinal() == 1) {
            System.out.println("Aluno reprovou direto");
        } else {
            System.out.println("Aluno vai para final precisando de: "
                    +formatar.format(aluno1.provaFinal()));
        }
    }
}
