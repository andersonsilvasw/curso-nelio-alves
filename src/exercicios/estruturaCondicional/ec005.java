package exercicios.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ec005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dódigo do item: ");
        int codigo = sc.nextInt();
        System.out.println("E qual a quantidade do item? ");
        int quantidade = sc.nextInt();
        double valorTotal;

        if (codigo == 1) {
            valorTotal = 4.00 * quantidade;
            System.out.printf("Total: R$ %.2f", valorTotal);
        } else if (codigo == 2) {
            valorTotal = 4.50 * quantidade;
            System.out.printf("Total: R$ %.2f", valorTotal);
        } else if (codigo == 3) {
            valorTotal = 5.00 * quantidade;
            System.out.printf("Total: R$ %.2f", valorTotal);
        } else if (codigo == 4) {
            valorTotal = 2.00 * quantidade;
            System.out.printf("Total: R$ %.2f", valorTotal);
        } else if (codigo == 5) {
            valorTotal = 1.50 * quantidade;
            System.out.printf("Total: R$ %.2f", valorTotal);
        } else {
            System.out.println("O código digitado não existe, revise e tente novamente!");
        }
        sc.close();
    }
}
