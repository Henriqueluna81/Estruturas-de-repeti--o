import java.util.Locale;
import java.util.Scanner;

public class ArmazenarNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String[] arrayDeNomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome da pessoa " + (i + 1) + ":");
            arrayDeNomes[i] = scanner.nextLine(); // Lê a linha inteira
        }

        System.out.println("\nNomes cadastrados:");
        for (String nome : arrayDeNomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}