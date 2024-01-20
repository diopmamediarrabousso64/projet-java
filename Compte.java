//exo7.1

import java.util.Random;

public class Compte {
    private int numero;
    private char typeCompte;
    private double solde;
    private int codeSecret;

    
    public Compte() {
        this.numero = 999999;
        this.typeCompte = ' ';
        this.solde = 0;
        this.setCodeSecret();
    }

    
    public void setCodeSecret() {
        Random random = new Random();
        this.codeSecret = random.nextInt(9900) + 100;  // Génère un nombre entre 100 et 9999
    }

    
    public Compte(int unNumero, char unType, double unSolde) {
        this.numero = unNumero;
        this.setType(unType);
        this.solde = unSolde;
        this.setCodeSecret();
    }

    
    public void setType(char unType) {
        if (unType == 'D' || unType == 'E') {
            this.typeCompte = unType;
        } else {
            this.typeCompte = ' ';
        }
    }

    
    public void setNumero(int unNumero) {
        this.numero = unNumero;
    }

    public int getNumero() {
        return this.numero;
    }

    
    public int getCodeSecret() {
        return this.codeSecret;
    }
}

