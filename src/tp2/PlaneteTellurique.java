package tp2;

import java.io.Serializable;
import java.util.Arrays;

public class PlaneteTellurique extends CorpsCeleste implements Serializable {

    private boolean atmosphere;
    private boolean vie;
    private boolean eau;
    private double gravite;
    private double TempMin;
    private double TempMax;
    private double TempMoy;
    private String[] Satellites;
    private double Compatibilite;

    public PlaneteTellurique(int iD, String nom, double rayon, int nbrCC, boolean atmosphere, boolean vie, boolean eau, double gravite, double TempMin, double TempMax, double TempMoy, String[] Satellites, double Compatibilite) {
        super(iD, nom, rayon, nbrCC);
        this.atmosphere = atmosphere;
        this.vie = vie;
        this.eau = eau;
        this.gravite = gravite;
        this.TempMin = TempMin;
        this.TempMax = TempMax;
        this.TempMoy = TempMoy;
        this.Satellites = Satellites;
        this.Compatibilite = Compatibilite;
    }
    public String toString(){
        return "**************" + "\nID: " + this.getID() + " \nNom: " + this.getNom() + " \nRayon: " 
          + this.getRayon() + " km" + " \nAtmosphere: " + OuiNon(this.atmosphere) + "\nSatellites: " + "\nVie: " + OuiNon(this.vie) + "\nEau: "
                + OuiNon(this.eau) + "\nGravite: " + this.gravite + "\nTemperature Minimale: " + this.TempMin +"\nTemperature Maximale: " + this.TempMax +
                "\nTemperature Moyenne: " + this.TempMoy + "\nSatellites" + Arrays.toString(getSatellites()) + "\nCompatibilite: " + this.Compatibilite + "%" + "\n**************" ;
        }
            public String getType(){
            return "PlaneteTellurique";
        }

    public boolean isAtmosphere() {
        return atmosphere;
    }

    public boolean isVie() {
        return vie;
    }

    public boolean isEau() {
        return eau;
    }

    public double getGravite() {
        return gravite;
    }

    public double getTempMin() {
        return TempMin;
    }

    public double getTempMax() {
        return TempMax;
    }

    public double getTempMoy() {
        return TempMoy;
    }

    public String[] getSatellites() {
        return Satellites;
    }

    public double getCompatibilite() {
        return Compatibilite;
    }
}
