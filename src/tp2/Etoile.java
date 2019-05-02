package tp2;

import java.io.Serializable;

public class Etoile extends CorpsCeleste implements Serializable{
    
    private int stade;
    private double masse;
    private String planetesLiees;
    
    public Etoile(int ID,String nom,double Rayon,int stade,double masse,String planetesLiees){
        super(ID,nom,Rayon);
        this.masse = masse;
        this.planetesLiees = planetesLiees;
        this.stade = stade;
    }
}
