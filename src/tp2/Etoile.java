package tp2;

import java.io.Serializable;

public class Etoile extends CorpsCeleste implements Serializable {

    private int stade;

        private int phase;

        private double masse;
        private String[] planetesLiees;

        public Etoile(int ID, String nom, double rayon, int phase, double masse, String[] planetesLiees) {
            super(ID, nom, rayon);
            this.masse = masse;
//        this.[]planetesLiees = planetesLiees[];
            this.phase = phase;
        }
    }
