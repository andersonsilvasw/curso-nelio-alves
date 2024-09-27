import java.util.Locale;
import java.util.Scanner;

public class expCondTernaria {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do produto? ");
        double preco = sc.nextDouble();

        double desconto = (preco >= 100) ? preco * 0.1 : preco * 0.05;
        double precoFinal = preco - desconto;

        System.out.println("Preço Final: R$ " + precoFinal);
    }
}
