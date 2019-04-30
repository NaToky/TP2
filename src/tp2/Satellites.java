package tp2;

public class Satellites extends CorpsCeleste {
    
    private String planetesLiees;
    public Satellites(int ID,String nom,double Rayon,String planetesLiees){
        super(ID,nom,Rayon);
        this.planetesLiees = planetesLiees;
    }
}
 