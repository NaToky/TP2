package tp2;

import java.io.Serializable;

public class CorpsCeleste implements Serializable {
    
    private int ID = 0;
    private String nom;
    private double rayon;
    
    public CorpsCeleste(int ID,String nom,double Rayon){
        this.ID = ID;
        this.nom = nom;
        this.rayon = Rayon;
    }

    public int getID() {
        return ID;
    }

    public String getNom() {
        return nom;
    }

    public double getRayon() {
        return rayon;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setRayon(double Rayon) {
        this.rayon = Rayon;
    }

    
}
