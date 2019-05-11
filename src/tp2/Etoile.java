package tp2;

import java.io.Serializable;
import java.util.Arrays;

public class Etoile extends CorpsCeleste implements Serializable {

    private int phase;

    private double masse;
    private String[] planetesLiees;

    public Etoile() {
        phase = 0;
        masse = 0.0;
    }

    public Etoile(int ID, String nom, double rayon, int nbrCC, int phase, double masse, String[] planetesLiees) {
        super(ID, nom, rayon, nbrCC);
        this.masse = masse;
        this.planetesLiees = planetesLiees;
        this.phase = phase;
        }
    
        @Override
        public String toString(){
            return "**************" + "\nID: " + this.getID() + " \nNom: " + this.getNom() + " \nRayon: " 
                    + this.getRayon() + " km" + " \nMasse: " + this.masse + " kg" +
                    " \nPhase: " + this.phase + "\nPlanetes liee: " + Arrays.toString(this.planetesLiees) + "\n**************" ;
        }
        @Override
        public String getType(){
            return "Etoile";
        }
        


    }
