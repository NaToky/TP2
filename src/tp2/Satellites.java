package tp2;

public class Satellites extends CorpsCeleste {

    private String planeteLiee;

    public Satellites(int ID, String nom, double Rayon, String planetesLiees) {
        super(ID, nom, Rayon);
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
        return "Nom: " + this.getNom() + "ID: " + this.getID();
    }
}
