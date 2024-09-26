package exercicios.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ec008 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o salário da pessoa com duas casas decimais: ");
        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 80.0;
        } else {
            imposto = (salario - 4500.0) * 0.28 + 350.0;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f", imposto);
        }
        sc.close();
    }
}
