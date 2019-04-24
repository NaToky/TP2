package tp2;

public class PlaneteGazeuse extends CorpsCeleste {
    
    private boolean atmosphere;
    private boolean vie;
    private boolean anneaux;
    
    public PlaneteGazeuse(int ID,String nom,double Rayon,boolean atmosphere,boolean vie,boolean anneaux){
        super(ID,nom,Rayon);
        this.anneaux = anneaux;
        this.atmosphere = atmosphere;
        this.vie = vie;
    }
}
