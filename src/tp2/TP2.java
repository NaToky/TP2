package tp2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TP2 {

    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        LecEcrFichier.ecrireFicher(LecEcrFichier.listePlanetes);
        ConfigGuide configGuide = new ConfigGuide();
        configGuide.main();
    }
       
}
