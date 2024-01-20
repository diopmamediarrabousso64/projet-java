//exo7
import java.util.Scanner;

public class TableauOperations {
    public static void main(String[] args) {
        // b) Création d'un tableau de 50 objets de classe "Operation"
        Operation[] operations = new Operation[50];

        // Menu
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nMenu :");
            System.out.println("0. Quitter");
            System.out.println("1. Voir les opérations");
            System.out.println("2. Ajouter une opération");
            System.out.print("Choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    // d) Option 1 : Afficher les opérations
                    System.out.println("\nOpérations :");
                    for (Operation operation : operations) {
                        if (operation != null) {
                            System.out.println(operation.toString());
                        }
                    }
                    break;

                case 2:
                    // e) Option 2 : Ajouter une opération
                    System.out.print("Entrez le montant de l'opération : ");
                    double montant = scanner.nextDouble();
                    Operation nouvelleOperation = new Operation(montant);

                    // Trouver la première case null dans le tableau et y stocker l'opération
                    for (int i = 0; i < operations.length; i++) {
                        if (operations[i] == null) {
                            operations[i] = nouvelleOperation;
                            break;
                        }
                    }
                    System.out.println("Opération ajoutée avec succès!");
                    break;

                default:
                    break;
            }

        } while (choix != 0);
    }
}
