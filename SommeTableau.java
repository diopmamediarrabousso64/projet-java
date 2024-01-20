//exo2.2
public class SommeTableau{
    public static int somme(int[] tab) {
        int somme = 0;
        for (int valeur : tab) {
            somme += valeur;
        }
        return somme;
    }
}
