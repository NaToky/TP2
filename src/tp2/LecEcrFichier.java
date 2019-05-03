package tp2;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

<<<<<<< HEAD
public class LecEcrFichier {    
    
    //Ecrire dans le ficher
    public static ArrayList<Planetes> listePlanetes = new ArrayList();
       public static ArrayList initTableau(ArrayList listePlanetes) throws FileNotFoundException, IOException{  
=======
public class LecEcrFichier {
    /*public static ArrayList<Planetes> listePlanetes = new ArrayList();
       public static ArrayList initTableau(ArrayList listePlanetes) throws FileNotFoundException, IOException{
>>>>>>> 7310130ef310f8e5ec021a99b9a45ce48dd64fa2
           
           try{
               DataOutputStream ecrire = new DataOutputStream(new FileOutputStream("guide.bin")); 
               
               
               ecrire.close();
            } catch (FileNotFoundException ex) {
            System.out.println("Fichier inexistant.");
            } catch (IOException ex) {
            System.out.println("Erreur d'accès au fichier.");
            }
        return listePlanetes;
<<<<<<< HEAD
    }
       
    //Lire dans le ficher
       public static ArrayList lecture(ArrayList listePlanetes){
           
           try {
             DataInputStream lire = new DataInputStream(new FileInputStream("Fichier.data"));
             
             
             
             
             lire.close();
            } catch (FileNotFoundException ex) {
            System.out.println("Fichier inexistant.");
            } catch (IOException ex) {
            System.out.println("Erreur d'accès au fichier.");
            }

           return listePlanetes;
       }
=======
    }*/
>>>>>>> 7310130ef310f8e5ec021a99b9a45ce48dd64fa2
}
