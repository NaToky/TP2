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

    public static ArrayList<CorpsCeleste> getListePlanetes() {
        return listePlanetes;
    }

    public static ArrayList<CorpsCeleste> getListePlanetesCroissant() {
        return listePlanetesCroissant;
    }

    public static ArrayList<CorpsCeleste> getListePlanetesDecroissant() {
        return listePlanetesDecroissant;
    }

    public static ArrayList<CorpsCeleste> listePlanetesCroissant = new ArrayList();
    public static ArrayList<CorpsCeleste> listePlanetesDecroissant = new ArrayList();

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
    private static ArrayList triInsertion() {
        System.out.println("Grandeur liste simple: " + listePlanetes.size());
        
           listePlanetesCroissant.clear();
           
        for (int i = 0; i < listePlanetes.size(); i++) {
            listePlanetesCroissant.add(listePlanetes.get(i));
        }
            System.out.println("Grandeur: " + listePlanetesCroissant.size());
        for (int i = 1; i < listePlanetesCroissant.size(); i++) {
            CorpsCeleste obj = listePlanetesCroissant.get(i);
            int valeur = (int) Character.toUpperCase(listePlanetesCroissant.get(i).getNom().charAt(0));
            System.out.println("Index: " + i);
            int position = i;
            System.out.println("valeur: " + valeur);
            while (position > 0 && (int) Character.toUpperCase(listePlanetesCroissant.get(position - 1).getNom().charAt(0)) > valeur) {
                System.out.println("Le numero " + (int) Character.toUpperCase(listePlanetesCroissant.get(position - 1).getNom().charAt(0)) + " est plus grand que " + valeur);
                listePlanetesCroissant.set(position, listePlanetesCroissant.get(position - 1));
                position--;
            }
            System.out.println("Je vais mettre la valeur " + valeur + " dans la position " + position);
            listePlanetesCroissant.set(position, obj);
        }

        return listePlanetesCroissant;
    }


    private static ArrayList triInverse() {
        listePlanetesDecroissant.clear();
        for (int i = listePlanetesCroissant.size()-1; i >= 0; i--) {
            if(listePlanetesCroissant.isEmpty()){
                return null;
            }else{
            listePlanetesDecroissant.add(listePlanetesCroissant.get(i));
            }
        }
        return listePlanetesDecroissant;
    }

    //Affichage de la liste Croissante/Decroissante
    public static void afficherEncyclopedie() {
        
        listePlanetesCroissant = triInsertion();
        listePlanetesDecroissant = triInverse();
        
        System.out.println("***********Guide du Routard Galactique (Simple)*******");
        for (int i = 0; i < listePlanetes.size(); i++) {
            if(listePlanetes.isEmpty()){
                System.out.println("La liste est vide");
            }else {
            System.out.println(listePlanetes.get(i).toString());
            }
            
        }
        
        System.out.println("***********Guide du Routard Galactique (Croissant)*******");
        for (int i = 0; i < listePlanetesCroissant.size(); i++) {
            if(listePlanetesCroissant.isEmpty()){
                System.out.println("La liste est vide");
            }else {
            System.out.println(listePlanetesCroissant.get(i).toString());
            }
            
        }
        System.out.println("*********************************************");
        System.out.println("***********Guide du Routard Galactique (Decroissant)*******");
        for (int i = 0; i < listePlanetes.size(); i++) {
            if(listePlanetesCroissant.isEmpty()){
                System.out.println("La liste est vide");
            }else {
            System.out.println(listePlanetesDecroissant.get(i).toString());
            }
        }
        System.out.println("*********************************************");
 }

}
