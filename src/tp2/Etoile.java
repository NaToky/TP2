package tp2;

import java.io.Serializable;
import java.util.ArrayList;

public class Etoile extends CorpsCeleste implements Serializable {

    private int stade;

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
//           this.planetesLiees = planetesLiees;
        this.phase = phase;
    }

    private boolean toString(ArrayList listePlanetes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
