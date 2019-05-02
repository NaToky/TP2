package tp2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class LecEcrFichier {

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

}
