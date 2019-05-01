package tp2;

public class Etoile extends CorpsCeleste {

    private int phase;
    private double masse;
    private String [] planetesLiees;

    public Etoile(int ID, String nom, double Rayon, int phase, double masse, String[] planetesLiees) {
        super(ID, nom, Rayon);
        this.masse = masse;
//        this.[]planetesLiees = planetesLiees[];
        this.phase = phase;
    }
}
