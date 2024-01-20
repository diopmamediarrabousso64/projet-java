//exo8
import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez un entier : ");
        String inputString = scanner.nextLine();

        if (isInteger(inputString)) {
            int intValue = Integer.parseInt(inputString);
            System.out.println("\nNombre : " + intValue);
            System.out.println("L'utilisateur a saisi le nombre " + intValue);
        } else {
            System.out.println("\nVotre chaîne de caractères ne correspond pas à un entier!");
        }
    }

    // Méthode pour vérifier si une chaîne représente un entier
    private static boolean isInteger(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
