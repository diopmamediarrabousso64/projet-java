//exo7.3
import java.util.Date;

public class Operation {
    private Date date;
    private double montant;

    // Premier constructeur avec 2 arguments
    public Operation(Date uneDate, double unMontant) {
        this.date = uneDate;
        this.montant = unMontant;
    }

    // Deuxième constructeur avec un seul argument (date prend la valeur du jour)
    public Operation(double unMontant) {
        this.date = new Date();
        this.montant = unMontant;
    }

    // Méthode toString pour afficher les détails de l'opération
    public String toString() {
        return "Date: " + date + ", Montant: " + montant;
    }
}
