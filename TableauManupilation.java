//exo2.1
public class TableauManipulation {
    public static int[] creerTableau(int n) {
        int[] tableau = new int[n];
        for (int i = 0; i < n; i++) {
            tableau[i] = i + 1;
        }
        return tableau;
    }
}
