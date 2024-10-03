package exercicios.estruturaRepititivaFor;

import java.util.Scanner;

public class erf007 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            int linha = i;
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%d %d %d\n", linha, quadrado, cubo);
        }
        sc.close();
    }
}
