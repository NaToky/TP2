package tp2;
<<<<<<< HEAD
=======

>>>>>>> 4c41b2ad11100287348a5944d213821a635fa957
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
<<<<<<< HEAD
import java.io.IOException;
=======
>>>>>>> 4c41b2ad11100287348a5944d213821a635fa957
import java.util.ArrayList;

<<<<<<< HEAD
public class LecEcrFichier {    
    
    //Ecrire dans le ficher
    public static ArrayList<Planetes> listePlanetes = new ArrayList();
       public static ArrayList initTableau(ArrayList listePlanetes) throws FileNotFoundException, IOException{  
=======
public class LecEcrFichier {
<<<<<<< HEAD
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
=======

    //Variables Globales
    public static ArrayList<CorpsCeleste> listePlanetes = new ArrayList();

    // Fonctions lecture/ecriture
    protected static void ecrireFicher(ArrayList listePlanetes) {
        try {
            DataOutputStream ecrire = new DataOutputStream(new FileOutputStream("guide.bin"));
                
        } catch (FileNotFoundException ex) {
            System.out.println("Fichier inexistant.");
        }

    }

    protected void lectureFicher(ArrayList listePlanetes) {

        try {
            DataInputStream lire;
            lire = new DataInputStream(new FileInputStream("guide.bin"));

        } catch (FileNotFoundException ex) {
            System.out.println("Fichier inexistant.");
        }
    }

    //Fonctions de tri
    private ArrayList triInsertion(ArrayList<CorpsCeleste> listePlanetes) {

        ArrayList listePlanetesCroissant = new ArrayList();
        for (int i = 1; i < listePlanetes.size(); i++) {
            int valeur = (int) Character.toUpperCase(listePlanetes.get(i).getNom().charAt(0));
            int valeur2 = (int) Character.toUpperCase(listePlanetes.get(i - 1).getNom().charAt(0));
            int position = i;

            while (position > 0 && valeur2 > valeur) {
                listePlanetes.add(position, listePlanetes.get(position - 1));
                listePlanetes.remove(position+1);
                position--;
            }

            listePlanetes.add(position, listePlanetes.get(i)); 
        }
        for (int i = 0; i < listePlanetes.size(); i++) {
            listePlanetesCroissant.add(listePlanetes.get(i));
        }
        return listePlanetesCroissant;

    }
    
    //Affichage de la liste Croissante/Decroissante
    
    private void afficherEncyclopedie(ArrayList listePlanetesCroissant){
        for (int i = 0; i < listePlanetesCroissant.size(); i++) {
            System.out.println(listePlanetesCroissant.get(i).toString());
        }
    }

>>>>>>> 4c41b2ad11100287348a5944d213821a635fa957
}
