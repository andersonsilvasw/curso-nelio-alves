package exercicios.estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class es004 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do funcionário: ");
        int numero = sc.nextInt();
        System.out.println("Digite quantas horas foram trabalhadas: ");
        int horas = sc.nextInt();
        System.out.println("Digite o valor da hora trabalhada: ");
        double horaTrabalhada = sc.nextDouble();
        double salario = horas * horaTrabalhada;
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY U$ %.2f", salario);
        sc.close();
    }
}
