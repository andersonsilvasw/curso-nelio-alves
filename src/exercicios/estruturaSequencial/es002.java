package exercicios.estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class es002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo: ");
        double raio = sc.nextDouble();
        double areaCirculo = 3.14159 * Math.pow(raio, 2);
        System.out.printf("A = %.4f", areaCirculo);
        sc.close();
    }
}
