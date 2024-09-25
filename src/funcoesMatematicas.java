public class funcoesMatematicas {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double a, b, c;

        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);
        System.out.printf("Raiz quadrada de %.1f = %.8f\n", x, a);
        System.out.printf("Raiz quadrada de %.1f = %.1f\n", y, b);
        System.out.printf("Raiz quadrada de 25 = %.1f\n", c);

        a = Math.pow(x, y);
        b = Math.pow(x, 2.0);
        c = Math.pow(5.0, 2.0);
        System.out.printf("%.1f elevado a %.2f = %.1f\n", x, y, a);
        System.out.printf("%.1f elevado ao quadrado = %.1f\n", x, b);
        System.out.printf("5 elevado ao quadrado = %.1f\n", c);

        a = Math.abs(y);
        b = Math.abs(z);
        System.out.println("O valor absoluto de " + y + " = " + a);
        System.out.println("O valor absoluto de " + z + " = " + b);
    }
}
