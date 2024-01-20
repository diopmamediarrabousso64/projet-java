//exo3
class Personnne {
    String prenom;
    String nom;
    private int age;
    static int nbPersonnes = 0;

    public Personne(String p, String n, int a) {
        prenom = p;
        nom = n;
        age = a;
        nbPersonnes++;
    }

    @Override
    public String toString() {
        return (prenom + " " + nom + " a " + age + " ans");
    }
}

public class ProgPrincipal {
    public static void main(String[] args) {
        Personne p1 = new Personne("Jean", "Durand", 25);
        System.out.println(p1);
    }
}
//affichage
Jean Durand a 25 ans
