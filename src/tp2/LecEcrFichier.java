package tp2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class LecEcrFichier {

    //Variables Globales
    public static ArrayList<CorpsCeleste> listePlanetes = new ArrayList();
    public static ArrayList<CorpsCeleste> listePlanetesCroissant = new ArrayList();
    public static ArrayList<CorpsCeleste> listePlanetesDecroissant = new ArrayList();

    public static ArrayList<CorpsCeleste> getListePlanetes() {
        return listePlanetes;
    }

    public static ArrayList<CorpsCeleste> getListePlanetesCroissant() {
        return listePlanetesCroissant;
    }

    public static ArrayList<CorpsCeleste> getListePlanetesDecroissant() {
        return listePlanetesDecroissant;
    }

    // Fonctions lecture/ecriture
    protected static void ecrireFicher(ArrayList listePlanetes) {
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

    protected static void lectureFichier() {

        try {
            FileInputStream fichier = new FileInputStream("guide.bin");
            ObjectInputStream ois = new ObjectInputStream(fichier);
            listePlanetes = (ArrayList) ois.readObject();

        } catch (java.io.IOException e) {
            System.out.println("Erreur d'entrées-sorties");

        } catch (ClassNotFoundException cnfe) {
            System.out.println("Classe non trouve");
        }
    }

    //Fonctions de tri
    private static ArrayList triInsertion() {
<<<<<<< HEAD
        
           listePlanetesCroissant.clear();
           
        for (int i = 0; i < listePlanetes.size(); i++) {
            listePlanetesCroissant.add(listePlanetes.get(i));
        }
=======
        System.out.println("Grandeur liste simple: " + listePlanetes.size());

        listePlanetesCroissant.clear();

        for (int i = 0; i < listePlanetes.size(); i++) {
            listePlanetesCroissant.add(listePlanetes.get(i));
        }
        System.out.println("Grandeur: " + listePlanetesCroissant.size());
>>>>>>> 93727feeaa6c799e91575003f10fbaa508b836a0
        for (int i = 1; i < listePlanetesCroissant.size(); i++) {
            CorpsCeleste obj = listePlanetesCroissant.get(i);
            int valeur = (int) Character.toUpperCase(listePlanetesCroissant.get(i).getNom().charAt(0));
            int position = i;
            while (position > 0 && (int) Character.toUpperCase(listePlanetesCroissant.get(position - 1).getNom().charAt(0)) > valeur) {
                listePlanetesCroissant.set(position, listePlanetesCroissant.get(position - 1));
                position--;
            }
            listePlanetesCroissant.set(position, obj);
        }

        return listePlanetesCroissant;
    }

    private static ArrayList triInverse() {
        listePlanetesDecroissant.clear();
        for (int i = listePlanetesCroissant.size() - 1; i >= 0; i--) {
            if (listePlanetesCroissant.isEmpty()) {
                return null;
            } else {
                listePlanetesDecroissant.add(listePlanetesCroissant.get(i));
            }
        }
        return listePlanetesDecroissant;
    }

    //Affichage de la liste Croissante/Decroissante
    public static void afficherEncyclopedie() {

        listePlanetesCroissant = triInsertion();
        listePlanetesDecroissant = triInverse();

        System.out.println("***********Guide du Routard Galactique (Croissant)*******");
        for (int i = 0; i < listePlanetesCroissant.size(); i++) {
            if (listePlanetesCroissant.isEmpty()) {
                System.out.println("La liste est vide");
            } else {
                System.out.println(listePlanetesCroissant.get(i).toString());
            }

        }
        System.out.println("*********************************************************");
        System.out.println("***********Guide du Routard Galactique (Decroissant)*******");
        for (int i = 0; i < listePlanetes.size(); i++) {
            if (listePlanetesCroissant.isEmpty()) {
                System.out.println("La liste est vide");
            } else {
                System.out.println(listePlanetesDecroissant.get(i).toString());
            }
        }
        System.out.println("*********************************************");
<<<<<<< HEAD
 }
    public static void afficherParEtoile(){
        
        for (int i = 0; i < listePlanetes.size(); i++) {
            if(LecEcrFichier.listePlanetes.get(i).getType().equals("Etoile")){
                System.out.println(listePlanetes.get(i).toString());
            }
        }
        
        int choix = 0;
        int i = 0;
        int aucun = 0;
        boolean boucle = true;
        while (boucle) {
            try {
                System.out.println("Veillez entrer le ID de l'Etoile: ");
                Scanner entree = new Scanner(System.in);
                choix = Integer.parseInt(entree.nextLine());
                System.out.println("Corps Celestes liees a l'etoile: ");
                while (i != listePlanetes.size()) {
                    
                    if (listePlanetes.get(i).getID() == choix && "Etoile".equals(LecEcrFichier.listePlanetes.get(i).getType())) {
                        String[] planeteLiee = listePlanetes.get(i).getPlanetesLiees();
                        for (int j = 0; j < planeteLiee.length; j++) {
                            for (int k = 0; k < listePlanetes.size(); k++) {
                                if(listePlanetes.get(k).getNom().equals(planeteLiee[j])){
                                    System.out.println(listePlanetes.get(k).toString());              
                                }     
                            }
                        }
                        
                       for (int j = 0; j < listePlanetes.size(); j++) {
                           for (int k = 0; k < planeteLiee.length; k++) {
                               if(listePlanetes.get(j).getNom().equals(planeteLiee[k])){
                                   String[] satellites = listePlanetes.get(j).getSatellites();
                            for (int l = 0; l < satellites.length; l++) {
                            for (int p = 0; p < listePlanetes.size(); p++) {
                                if(listePlanetes.get(p).getNom().equals(satellites[l])){
                                    System.out.println(listePlanetes.get(p).toString());              
                                }     
                            }
                        }
                               }
                           }
                          
                       }
                        aucun++;
                    }
                    i++;
                }
                if (aucun == 0) {
                    System.out.println("Aucun object (Etoile) trouve avec l'ID de: " + choix);
                }
 
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre entre 1-5");
            }

        }
    }
    
=======
    }
>>>>>>> 93727feeaa6c799e91575003f10fbaa508b836a0

}
