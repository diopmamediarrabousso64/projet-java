//exo5
class Personne {
    String nom;
    int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
}


class Etudiant extends Personne {
    int anneeDEtude;

    public Etudiant(String nom, int age, int anneeDEtude) {
        super(nom, age);
        this.anneeDEtude = anneeDEtude;
    }
}


class Travailleur extends Personne {
    double salaire;

    public Travailleur(String nom, int age, double salaire) {
        super(nom, age);
        this.salaire = salaire;
    }
}


class EtudiantTravailleur extends Etudiant {
    public EtudiantTravailleur(String nom, int age, int anneeDEtude, double salaire) {
        super(nom, age, anneeDEtude);
        this.salaire = salaire;
    }
}


class EtudiantSportif extends Etudiant {
    String sportPratique;

    public EtudiantSportif(String nom, int age, int anneeDEtude, String sportPratique) {
        super(nom, age, anneeDEtude);
        this.sportPratique = sportPratique;
    }
}

class Enseignant extends Travailleur {
    String emploiDuTemps;

    public Enseignant(String nom, int age, double salaire, String emploiDuTemps) {
        super(nom, age, salaire);
        this.emploiDuTemps = emploiDuTemps;
    }
}


public class Main {
    public static double sommeSalaires(Personne[] personnes) {
        double totalSalaire = 0;
        for (Personne personne : personnes) {
            if (personne instanceof Travailleur) {
                totalSalaire += ((Travailleur) personne).salaire;
            }
        }
        return totalSalaire;
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        Personne[] personnes = {
            new Etudiant("Étudiant1", 20, 2),
            new Travailleur("Travailleur1", 30, 50000),
            new EtudiantTravailleur("ÉtudiantTravailleur1", 25, 3, 60000),
            new EtudiantSportif("ÉtudiantSportif1", 22, 4, "Football"),
            new Enseignant("Enseignant1", 40, 80000, "Lundi - Vendredi")
        };

        double totalSalaire = sommeSalaires(personnes);
        System.out.println("Somme des salaires : " + totalSalaire);
    }
}
