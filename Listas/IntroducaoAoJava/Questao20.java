package Listas.IntroducaoAoJava;

import java.util.Scanner;
public class Questao20 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe dois números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        input.close();
        System.out.println("O máximo divisor comum entre os dois números é: "+mdc(num1,num2));
    }
    public static int mdc(int firstNum, int secNum){
        if(firstNum%secNum == 0){
          return secNum;  
        }
        return mdc(firstNum,secNum%firstNum);
    }
}
