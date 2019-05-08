package tp2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class LecEcrFichier {

    //Variables Globales
    public static ArrayList<CorpsCeleste> listePlanetes = new ArrayList();

    // Fonctions lecture/ecriture
    protected static void ecrireFicher(ArrayList listePlanetes) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("guide.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listePlanetes);
            oos.flush();
            oos.close();

        } catch (java.io.IOException e) {
            System.out.println("Erreur d'entrées-sorties");
        }

    }

    protected static void lectureFichier() throws ClassNotFoundException {

        try {
            FileInputStream fichier = new FileInputStream("guide.bin");
            ObjectInputStream ois = new ObjectInputStream(fichier);
            listePlanetes = (ArrayList) ois.readObject();

        } catch (java.io.IOException e) {
            System.out.println("Erreur d'entrées-sorties");

        }
    }

    //Fonctions de tri
    private static ArrayList triInsertion(ArrayList<CorpsCeleste> listePlanetes) {

        ArrayList<CorpsCeleste> listePlanetesCroissant = new ArrayList();

        for (int i = 0; i < listePlanetes.size(); i++) {
            listePlanetesCroissant.add(listePlanetes.get(i));
        }

        for (int i = 1; i < listePlanetesCroissant.size(); i++) {

            int valeur = (int) Character.toUpperCase(listePlanetesCroissant.get(i).getNom().charAt(0));
            int valeur2 = (int) Character.toUpperCase(listePlanetesCroissant.get(i - 1).getNom().charAt(0));

            System.out.println("Valeur 1: " + valeur);
            System.out.println("Valeur 2: " + valeur2);

            int position = i;

            while (position > 0 && valeur2 > valeur) {
                listePlanetesCroissant.set(position, listePlanetesCroissant.get(position - 1));
                position--;
            }

            listePlanetesCroissant.set(position, listePlanetes.get(i));
        }

        return listePlanetesCroissant;
    }

    //Affichage de la liste Croissante/Decroissante
    public static void afficherEncyclopedie(ArrayList listePlanetesCroissant) {
        listePlanetesCroissant = triInsertion(listePlanetesCroissant);
        System.out.println("***********Guide du Routard Galactique*******");
        for (int i = 0; i < listePlanetesCroissant.size(); i++) {
            System.out.println(listePlanetesCroissant.get(i).toString());
        }
        System.out.println("*********************************************");
        System.out.println("***********Guide du Routard Galactique v 2*******");
        for (int i = 0; i < listePlanetes.size(); i++) {
            System.out.println(listePlanetes.get(i).toString());
        }
        System.out.println("*********************************************");
    }

}
