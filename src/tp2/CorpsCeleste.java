package tp2;

import java.io.Serializable;

public class CorpsCeleste implements Serializable {

    private int ID, nbrCC =0;
    private String nom;
    private double rayon;

    public CorpsCeleste() {
        ID = 0;
        nom = "Aucun";
        rayon = 0;
    }

    public CorpsCeleste(int ID, String nom, double Rayon, int nbrCC) {
        this.ID = ID;
        this.nom = nom;
        this.rayon = Rayon;
        this.nbrCC = nbrCC;
    }

    public int getID() {
        return ID;
    }

    public int getNbrCC() {
        return nbrCC;
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

    public String OuiNon(boolean Fr) {
        if (Fr) {
            return "oui";
        } else {
            return "non";
        }
    }

    public String getType() {
        return null;
    }

    public int getPhase() {
        return 0;
    }

    public double getMasse() {
        return 0;
    }

    public String[] getPlanetesLiees() {
        return null;
    }

    public boolean isAtmosphere() {
        return false;
    }

    public boolean isVie() {
        return false;
    }

    public boolean isAnneaux() {
        return false;
    }

    public String[] getSatellites() {
        return null;
    }

    public boolean isEau() {
        return false;
    }

    public double getGravite() {
        return 0;
    }

    public double getTempMin() {
        return 0;
    }

    public double getTempMax() {
        return 0;
    }

    public double getTempMoy() {
        return 0;
    }

    public double getCompatibilite() {
        return 0;
    }

    public String getPlaneteLiee() {
        return null;
    }
    public int getNbrSatellites(){
        return 0;
    }

}
