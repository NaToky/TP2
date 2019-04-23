package tp2;

public class Planetes {
    
    private double rayon;
    private boolean vie;
    private boolean eau;
    private double gravite;
    private boolean atmosphere;
    private double TempMax;
    private double TempMoy;
    private double TempMin;
    private String Satellites;
    
    
    public Planetes(double rayon,boolean vie,boolean eau,double gravite,boolean atmosphere,double TempMax,double TempMoy,double TempMin,String Satellites){
        this.rayon = rayon;
        this.vie = vie;
        this.eau = eau;
        this.gravite = gravite;
        this.atmosphere = atmosphere;
        this.TempMax = TempMax;
        this.TempMoy = TempMoy;
        this.TempMin = TempMin;
        this.Satellites = Satellites;
    }
}
