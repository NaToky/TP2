
package tp2;

import java.io.Serializable;

public class PlaneteNaine extends CorpsCeleste implements Serializable{
    private String type;
    
    public PlaneteNaine(int ID,String nom,double rayon, String type){
    super(ID,nom,rayon);
    this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    
}
