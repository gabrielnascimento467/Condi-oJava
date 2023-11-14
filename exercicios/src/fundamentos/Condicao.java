package fundamentos;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Testando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Está sol?");
        String estaSol = scanner.nextLine();

        System.out.println("Tem dinheiro?");
        String temDinheiro = scanner.nextLine();

        List<String> respostasPositivas = Arrays.asList("sim", "si", "s", "yes", "y");
        // List<String> respostasNegativas = Arrays.asList("não", "nao", "no", "n");

        boolean estaSolCondition = respostasPositivas.contains(estaSol.toLowerCase());
        boolean temDinheiroCondition = respostasPositivas.contains(temDinheiro.toLowerCase());

        if (estaSolCondition && temDinheiroCondition) {
            System.out.println("Vamos ao shopping.");
        } else {
            System.out.println("Ficaremos em casa.");
        }

        scanner.close();
    }
}
