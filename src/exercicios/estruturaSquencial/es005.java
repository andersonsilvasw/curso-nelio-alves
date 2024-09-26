package exercicios.estruturaSquencial;

import java.util.Locale;
import java.util.Scanner;

public class es005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o código da peça 1? ");
        int codigo1 = sc.nextInt();
        System.out.println("Qual a quantidade da peça 1? ");
        int quantidadeDaPeca1 = sc.nextInt();
        System.out.println("Qual o valor unitário da peça 1? ");
        double valorUnitario1 = sc.nextDouble();

        System.out.println("Qual o código da peça 2? ");
        int codigo2 = sc.nextInt();
        System.out.println("Qual a quantidade da peça 2? ");
        int quantidadeDaPeca2 = sc.nextInt();
        System.out.println("Qual o valor unitário da peça 2? ");
        double valorUnitario2 = sc.nextDouble();

        double valorTotal = quantidadeDaPeca1 * valorUnitario1 + quantidadeDaPeca2 * valorUnitario2;
        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);

        sc.close();
    }
}
