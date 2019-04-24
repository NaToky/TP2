package tp2;

public class Planetes extends CorpsCeleste{
    private boolean vie;
    private boolean eau;
    private double gravite;
    private boolean atmosphere;
    private double TempMax;
    private double TempMoy;
    private double TempMin;
    private String Satellites;
    private double Compatibilite;
    
    public Planetes(int ID,String nom,double Rayon,boolean vie,boolean eau,double gravite,boolean atmosphere,double TempMax,double TempMoy,double TempMin,String Satellites,double Compatibilite){
        super(ID,nom,Rayon);
        this.vie = vie;
        this.eau = eau;
        this.gravite = gravite;
        this.atmosphere = atmosphere;
        this.TempMax = TempMax;
        this.TempMoy = TempMoy;
        this.TempMin = TempMin;
        this.Satellites = Satellites;
        this.Compatibilite = Compatibilite;
    }
}
