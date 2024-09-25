import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Olá, qual o seu nome? ");
        String nome = sc.next();
        System.out.print("Olá " + nome + ", Qual a sua idade? ");
        int idade = sc.nextInt();
        System.out.print("Qual o seu sexo? (F para feminino ou M para masculino): ");
        char sexo = sc.next().charAt(0);
        System.out.print("E para finalizar, Qual o seu peso atual? ");
        double peso = sc.nextDouble();

        System.out.printf("Tudo bem %s, então só confirmando você tem %d anos, sexo: %s, " +
                "e peso de " + peso + "KG, agora que temos seus dados iremos elaborar seu plano."
                , nome, idade, sexo);
        sc.close();
    }
}
