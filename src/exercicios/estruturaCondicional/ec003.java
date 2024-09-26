package exercicios.estruturaCondicional;

import java.util.Scanner;

public class ec003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int numero2 = sc.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("São Múltiplos");
        } else {
            System.out.println("Não são Múltiplos");
        }

        sc.close();
    }
}
