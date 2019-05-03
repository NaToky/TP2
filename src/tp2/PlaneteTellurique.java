package tp2;

import java.io.Serializable;

public class PlaneteTellurique extends CorpsCeleste implements Serializable {

    private boolean atmosphere;
    private boolean vie;
    private boolean eau;
    private double gravite;
    private double TempMin;
    private double TempMax;
    private double TempMoy;
    private String Satellites;
    private double Compatibilite;

    public PlaneteTellurique(int ID, String nom, double rayon, boolean atmosphere, boolean vie, boolean eau, double gravite, double TempMin, double TempMax, double TempMoy, String[] Satellites, double Compatibilite) {
        super(ID, nom, rayon);
        this.atmosphere = atmosphere;
        this.vie = vie;
        this.eau = eau;
        this.gravite = gravite;
        this.TempMin = TempMin;
        this.TempMax = TempMax;
        this.TempMoy = TempMoy;
//        this.Satellites = Satellites;
        this.Compatibilite = Compatibilite;
    }
}