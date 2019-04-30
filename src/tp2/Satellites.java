package tp2;

public class Satellites extends CorpsCeleste {

    private String planeteLies;

    public Satellites(int ID, String nom, double Rayon, String planetesLiees) {
        super(ID, nom, Rayon);
        this.planeteLies = planeteLies;
    }

    public String getPlaneteLiee() {
        return planeteLies;
    }

    public void setPlaneteLiee(String planeteLiee) {
        this.planeteLies = planeteLiee;
    }
    @Override
    public String toString(){
        return "Nom: " + this.getNom() + "ID: " + this.getID();
    }
}
