//exo7.2
import java.util.Arrays;

public class TableauMontants {
    public static void main(String[] args) {
        // a) Création et alimentation du tableau de 5 montants
        double[] montants = {45.67, 12.89, 78.45, 23.56, 56.78};

        // b) Affichage du contenu du tableau avec une boucle
        System.out.println("Contenu du tableau avant le tri :");
        for (double montant : montants) {
            System.out.println(montant);
        }

        // c) Tri du tableau dans l'ordre croissant des montants
        Arrays.sort(montants);

        // d) Affichage du contenu du tableau après le tri
        System.out.println("\nContenu du tableau après le tri :");
        System.out.println(Arrays.toString(montants));
    }
}
