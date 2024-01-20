//exo3
public class ProgPrincipal {
    public static void main(String[] args) {
        Personne p1 = new Personne("Jean", "Durand", 25);
        anniversaire(p1);
        System.out.println(p1.prenom);
        System.out.println(p1.nom);
        System.out.println(p1.age);
    }

    public static void anniversaire(Personne p) {
        p.age++;
    }
}
