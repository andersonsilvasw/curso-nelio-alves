package exercicios.estruturaSquencial;

import java.util.Scanner;

public class es001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        System.out.println("SOMA: " + soma);
    }
}
