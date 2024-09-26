package exercicios.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ec007 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número com uma casa decimal: ");
        double eixoX = sc.nextDouble();
        System.out.println("Digite outro número com uma casa decimal: ");
        double eixoY = sc.nextDouble();

        if (eixoX == 0.0 && eixoY == 0.0) {
            System.out.println("Origem");
        } else if (eixoX > 0.0 && eixoY > 0.0) {
            System.out.println("Q1");
        } else if (eixoX < 0.0 && eixoY > 0.0) {
            System.out.println("Q2");
        } else if (eixoX < 0.0 && eixoY < 0.0) {
            System.out.println("Q3");
        } else if (eixoX > 0.0 && eixoY < 0.0) {
            System.out.println("Q4");
        } else if (eixoX == 0.0 && eixoY != 0.0) {
            System.out.println("Eixo X");
        } else {
            System.out.println("Eixo Y");
        }
        sc.close();
    }
}
