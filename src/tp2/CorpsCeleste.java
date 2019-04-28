package tp2;

public class CorpsCeleste {
    
    private int ID = 0;
    private String nom;
    private double Rayon;
//    
//    public CorpsCeleste(int ID,String nom,double Rayon){
//        this.ID = ID;
//        this.nom = nom;
//        this.Rayon = Rayon;
//    }

    public int getID() {
        return ID;
    }

    public String getNom() {
        return nom;
    }

    public double getRayon() {
        return Rayon;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setRayon(double Rayon) {
        this.Rayon = Rayon;
    }

    
}
