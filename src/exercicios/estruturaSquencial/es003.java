package exercicios.estruturaSquencial;

import java.util.Scanner;

public class es003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int A = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int B = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int C = sc.nextInt();
        System.out.println("Digite o quarto valor: ");
        int D = sc.nextInt();
        int diferenca = A * B - C * D;
        System.out.println("DIFERENÇA = " + diferenca);
    }
}
