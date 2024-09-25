import java.util.Scanner;

public class entradasDeDados02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        String s1, s2, s3;

        numero = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("OS DADOS DIGITADOS FORAM:");
        System.out.println(numero);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
    }
}
