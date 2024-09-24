import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int x = 32;
        double y = 10.35789;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.print("Olá Mundo!");
        System.out.println(" Cheguei!");
        //println é uma quebra de linha
        System.out.println(x);
        System.out.printf("%.2f\n", y);
        //printf p/ formatar, p/ quebrar linha \n ou %n
        System.out.printf("%.4f%n", y);
        Locale.setDefault(Locale.US);
        //Configuração a locallidade, p/ usar o ponto como separação de número decimal
        System.out.printf("%.4f%n", y);
        System.out.println("RESULTADO = " + y + " METROS");
        System.out.printf("RESULTADO = %.2f metros\n", y);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
        // Marcadores de variáveis %d, %f, %s e %n
    }
}