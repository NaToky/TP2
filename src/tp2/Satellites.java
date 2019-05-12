package tp2;

import java.io.Serializable;

public class Satellites extends CorpsCeleste implements Serializable {

    private String planeteLiee;

    public Satellites(int ID, String nom, double rayon, int nbrCC, String planetesLiees) {
        super(ID, nom, rayon, nbrCC);
        this.planeteLiee = planeteLiee;
    }

    public String getPlaneteLiee() {
        return planeteLiee;
    }

    public void setPlaneteLiee(String planeteLiee) {
        this.planeteLiee = planeteLiee;
    }
    @Override
    public String toString(){
        return "\n**************" +"\nNom: " + this.getNom() + "\nID: " + this.getID() + "\n**************";
    }
            public String getType(){
            return "Satellite";
        }
}
 