package exercicios.estruturaRepititivaFor;

import java.util.Scanner;

public class erf006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int divisor;

        for (int i=n; i>0; i--) {
            divisor = n / i;
            if (n % i == 0) {
                System.out.println(divisor);
            }
        }
        sc.close();
    }
}
