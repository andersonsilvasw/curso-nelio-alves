package exercicios.estruturaCondicional;

import java.util.Scanner;

public class ec004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Que horas o jogo começou? ");
        int horaInicial = sc.nextInt();
        System.out.println("Que horas o jogo terminou? ");
        int horaFinal = sc.nextInt();
        int duracaoJogo;

        if (horaInicial > horaFinal) {
            duracaoJogo = 24 - horaInicial + horaFinal;
        } else {
            duracaoJogo = horaFinal - horaInicial;
        }

        System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");

        sc.close();
    }
}
