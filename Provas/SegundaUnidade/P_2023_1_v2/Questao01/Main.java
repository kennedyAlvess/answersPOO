package Provas.SegundaUnidade.P_2023_1_v2.Questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        int id, idade;
        String nome,telefone;

        while (true){
            try{
                System.out.print("Informe o ID do cliente : ");
                id = Integer.parseInt(input.nextLine());
                if(id < 0) break;
                System.out.print("Informe o nome do cliente: ");
                nome = input.nextLine();
                System.out.print("Informe a idade do cliente: ");
                idade = Integer.parseInt(input.nextLine());
                System.out.print("Informe o telefone do cliente com DD: ");
                telefone = formatarTelefone(String.format(input.nextLine()));
                clientes.add(new Cliente(id,nome,idade,telefone));
            }catch (Exception ex ){
                System.out.println("Erro ao tentar ler dados do cliente, verifique se o numero do telefone contem DD");
            }
        }

        clientes.forEach((elemento) -> System.out.println(elemento));

        input.close();
    }

    private static String formatarTelefone(String numero){
        return String.format("(%s)%s-%s",
                numero.substring(0,2),
                numero.substring(2,7),
                numero.substring(7,11));
    }
}
