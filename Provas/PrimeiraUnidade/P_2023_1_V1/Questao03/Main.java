package Provas.PrimeiraUnidade.P_2023_1_V1.Questao03;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("111111","Joao",7,7,7);
        Aluno aluno2 = new Aluno("222222","Maria",5,5,5);

        if(aluno1.provaFinal() != 0){
            System.out.println("Quanto o aluno "+aluno1.getNome()+", matricula: "+aluno1.getMatricula()+" precisa para prova final: "+aluno1.provaFinal());
            aluno1.provaFinal();
        }
        if (aluno2.provaFinal() != 0){
            System.out.println("Quanto o aluno "+aluno2.getNome()+", matricula: "+aluno2.getMatricula()+" precisa para prova final: "+aluno2.provaFinal());

        }

    }
}
