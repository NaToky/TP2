package tp2;

import java.io.Serializable;
import java.util.Arrays;

public class PlaneteNaine extends CorpsCeleste implements Serializable {

    private String type;
    private String[] satellites;

    public PlaneteNaine(int ID, String nom, double rayon, int nbrCC, String type, String[] satellites) {
        super(ID, nom, rayon, nbrCC);
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String gettype() {
        return type;
    }
<<<<<<< HEAD
    
    public String toString(){
            return "**************" + "\nID: " + this.getID() + " \nNom: " + this.getNom() + " \nRayon: " 
                    + this.getRayon() + " km" + " \nType: " + this.gettype() + "\nSatellites: " + Arrays.toString(getSatellites()) +  "\n**************" ;
        }
            public String getType(){
            return "PlaneteNaine";
        }
=======

    public String toString() {
        return "**************" + "\nID: " + this.getID() + " \nNom: " + this.getNom() + " \nRayon: "
                + this.getRayon() + " km" + " \nType: " + this.gettype() + "\nSatellites: " + Arrays.toString(getSatellites()) + "\n**************";
    }

    public String getType() {
        return "PlaneteNaine";
    }
>>>>>>> 93727feeaa6c799e91575003f10fbaa508b836a0

    public String[] getSatellites() {
        return satellites;
    }
}
