package tp2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LecEcrFichier {
    public static ArrayList<Planetes> listePlanetes = new ArrayList();
       public static ArrayList initTableau(ArrayList listePlanetes) throws FileNotFoundException, IOException{
           
        
        BufferedReader lecture = new BufferedReader(new FileReader ("420-202-RE - H19 - Annexe - Planètes et lunes.xlsx"));
        
        String ligne = null;
        for(int i = 0;(ligne = lecture.readLine()) != null;i++){
            for(int j = 0;lecture.readLine() != null;j++){
                System.out.println(ligne);
            }
        }
         for(int i = 0;i < listePlanetes.size();i++){
            
       
            }
        
        lecture.close();
     
        return listePlanetes;
    }
}
