package tp2;

import java.io.Serializable;
import java.util.Arrays;

public class PlaneteGazeuse extends CorpsCeleste implements Serializable {

    private boolean atmosphere;
    private boolean vie;
    private boolean anneaux;
    private String[] satellites;

    public PlaneteGazeuse(int ID, String nom, double rayon, int nbrCC, boolean atmosphere, boolean vie, boolean anneaux, String[] satellites) {
        super(ID, nom, rayon, nbrCC);
        this.anneaux = anneaux;
        this.atmosphere = atmosphere;
        this.vie = vie;
        this.satellites = satellites;
    }
            public String toString(){
            return "**************" + "\nID: " + this.getID() + " \nNom: " + this.getNom() + " \nRayon: " 
                    + this.getRayon() + " km" + " \nVie: " + OuiNon(this.vie) + "\nAnneaux: " + OuiNon(this.anneaux) + "\nSatellites: "
                    + Arrays.toString(this.satellites) + "\n**************" ;
        }
}
