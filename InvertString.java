import java.util.Scanner;
//exo9
public class InvertString {
    public static void main(String[] args) {
        // Créer un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer une chaîne de caractères
        System.out.print("Entrez une chaîne de caractères: ");
        String inputString = scanner.nextLine();

        // Utiliser un objet StringBuilder pour inverser la chaîne
        StringBuilder reversedString = new StringBuilder(inputString);
        reversedString.reverse();

        // Afficher le résultat
        System.out.println("L'inversion de cette chaîne donne: " + reversedString);

        // Fermer le scanner
        scanner.close();
    }
}
