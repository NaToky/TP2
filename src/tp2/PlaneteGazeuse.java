package tp2;

import java.io.Serializable;

public class PlaneteGazeuse extends CorpsCeleste implements Serializable {

    private boolean atmosphere;
    private boolean vie;
    private boolean anneaux;

    public PlaneteGazeuse(int ID, String nom, double rayon, int nbrCC, boolean atmosphere, boolean vie, boolean anneaux) {
        super(ID, nom, rayon, nbrCC);
        this.anneaux = anneaux;
        this.atmosphere = atmosphere;
        this.vie = vie;
    }
}
