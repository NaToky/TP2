package tp2;

import java.util.ArrayList;

import java.util.Scanner;

public class ConfigGuide {

    Scanner entree = new Scanner(System.in);

    int ID = 0;

    boolean boucle = true;

    ArrayList<CorpsCeleste> liste = new ArrayList<>();

    protected void main() {
        recommencerProgramme();
    }

    private void recommencerProgramme() {
        boolean recommencer;
        System.out.println("BIENVENUE DANS LE GUIDE DU ROUTARD GALACTIQUE \n");
        while (recommencer = true) {
            afficherMenu();
            entrerMenu();
        }
    }

    private void afficherMenu() {
        System.out.println("Que voulez vous faire? \n");
        System.out.println("    1-  Consulter l encyclopedie");
        System.out.println("    2-  Saisir un nouveau corps celeste");
        System.out.println("    3-  Modifier un corps celeste");
        System.out.println("    4-  Statistiques");
        System.out.println("    5-  Quitter");
    }

    private void entrerMenu() {
        int menu;
        while (boucle) {
            try {
                System.out.print("Votre choix: ");
                menu = Integer.parseInt(entree.nextLine());
                System.out.println("");
                while (menu < 1 || menu > 5) {
                    System.out.println("Veuillez entrer un nombre entre 1 et 5: ");
                    menu = Integer.parseInt(entree.nextLine());
                    System.out.println("");
                }
                switch (menu) {
                    case 1:

                        break;
                    case 2:
                        afficherTypeDAstre();
                        entrerTypeDAstre();
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("Veuillez entrer un nombre entre 1 et 5: ");
            }
        }
        boucle = true;
    }

    private int getID() {
        ID++;
        return (ID);
    }

    private void afficherTypeDAstre() {
        System.out.println("Veuillez entrer le type d astre que vous voulez creer:");
        System.out.println("    1-  Planete tellurique");
        System.out.println("    2-  Planete gaseuse");
        System.out.println("    3-  Planete naine");
        System.out.println("    4-  Etoile");
        System.out.println("    5-  Satellite");
    }

    private void entrerTypeDAstre() {
        int menu;
        while (boucle) {
            try {
                System.out.print("Votre choix: ");
                menu = Integer.parseInt(entree.nextLine());
                System.out.println("");
                while (menu < 1 || menu > 5) {
                    System.out.println("Veuillez entrer un nombre entre 1 et 5: ");
                    menu = Integer.parseInt(entree.nextLine());
                    System.out.println("");
                }
                switch (menu) {
                    case 1:
                        entrerDonneesPlanetesTelluriques();
                        break;
                    case 2:
                        entrerDonneesPlanetesGazeuses();
                        break;
                    case 3:
                        entrerDonneesPlanetesNaines();
                        break;
                    case 4:
                        entrerDonneesEtoiles();
                        break;
                    case 5:
                        entrerDonneesSatellites();
                        break;
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("Veuillez entrer un nombre entre 1 et 5: ");
            }
        }
        boucle = true;
    }

    private String getNom() {
        String nom;
        nom = entree.nextLine();
        System.out.println("");
        return nom;
    }

    private double getRayon() {
        Double rayon = 0.0;
        while (boucle) {
            try {
                rayon = Double.parseDouble(entree.nextLine());
                System.out.println("");
                while (rayon <= 0) {
                    System.out.print("Veuillez entrer un nombre entier positif: ");
                    rayon = Double.parseDouble(entree.nextLine());
                    System.out.print("");
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("Veuillez entrer un nombre entier positif: ");
            }
        }
        boucle = true;
        return rayon;
    }

    private String getPlaneteLiee() {
        String planeteLiee;
        planeteLiee = entree.nextLine();
        System.out.println("");
        return planeteLiee;
    }

    private String[] getTabPlanetesLiees() {
        int nbrPlanetes = 0;
        String nomPlanetesLiees;
        while (boucle = true) {
            try {
                nbrPlanetes = Integer.parseInt(entree.nextLine());
                System.out.println("");
                while (nbrPlanetes < 0 || nbrPlanetes > 10) {
                    System.out.print("Veuillez entrer un nombre de planetes liees valide (entre 1 et 10): ");
                    nbrPlanetes = Integer.parseInt(entree.nextLine());
                    System.out.println("");
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre de planetes liees valide (entre 1 et 10): ");
            }
        }
        boucle = true;
        String[] tabPlanetes = new String[nbrPlanetes];
        for (int i = 0; i < nbrPlanetes; i++) {
            System.out.print("Veuillez entrer le nom de la planete " + (i + 1) + ": ");
            nomPlanetesLiees = entree.nextLine();
            tabPlanetes[i] = nomPlanetesLiees;

        }
        return tabPlanetes;
    }

    private String getType() {
        String type, typeMaj;
        type = entree.nextLine();
        System.out.println("");
        typeMaj = type.toUpperCase();
        while (!"ASTEROIDE".equals(typeMaj) && !"EPARS".equals(typeMaj) && !"CUBEWANO".equals(typeMaj) && !"Autre".equals(typeMaj)) {
            System.out.print("Veuillez entrer un nom de planete liee valide (ASTEROIDE, EPARS, CUBEWANO ou AUTRE)");
            type = entree.nextLine();
            System.out.println("");
            typeMaj = type.toUpperCase();
        }
        System.out.println("");
        return type;
    }

    private double getMasse() {
        double masse;
        masse = Double.parseDouble(entree.nextLine());
        System.out.println("");
        return masse;
    }

    private void entrerDonneesPlanetesTelluriques() {
        String nom;
        double rayon;
        System.out.print("Veuillez entrer le nom de la planete tellurique decouverte: ");
        nom = getNom();
        System.out.print("Veuillez entrer le rayon de la planete tellurique decouverte (en km): ");
        rayon = getRayon();
        LecEcrFichier.getListePlanetes.add(new PlaneteTellurique(getID(), nom, rayon, getVie(), getEau(), getGravite(), getAtmosphere(), getTempMax(), getTempMoy(), getTempMin(), getSatellites(), getCompatibilite());

    }

    private void entrerDonneesPlanetesGazeuses() {
        String nom;
        double rayon;
        System.out.print("Veuillez entrer le nom de la planete gazeuse decouverte: ");
        nom = getNom();
        System.out.print("Veuillez entrer le rayon de la planete gazeuse decouverte (en km): ");
        rayon = getRayon();
        System.out.print("Veuillez entrer le rayon de la planete gazeuse decouverte (en km): ");
        System.out.print("Veuillez entrer le rayon de la planete gazeuse decouverte (en km): ");
        System.out.print("Veuillez entrer le rayon de la planete gazeuse decouverte (en km): ");
    }

    private void entrerDonneesPlanetesNaines() {
        String nom, type;
        Double rayon;
        System.out.print("Veuillez entrer le nom de la planete naine decouverte: ");
        nom = getNom();
        System.out.print("Veuillez entrer le rayon de la planete Naine decouverte (en km): ");
        rayon = getRayon();
        System.out.print("Veuillez entrer le type de la planète Naine decouverte (ASTEROIDE, EPARS, CUBEWANO ou AUTRE)");
        type = getType();
        liste.add(new PlaneteNaine(getID(), nom, rayon, type));//////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("LA PLANETE NAINE A ETE CREEE");
    }

    private void entrerDonneesEtoiles() {
        String nom;
        Double rayon, masse;
        System.out.print("Veuillez entrer le nom de l etoile decouverte: ");
        nom = getNom();
        System.out.print("Veuillez entrer le rayon de l etoile decouverte (en km): ");
        rayon = getRayon();
        System.out.print("Veuillez entrer la masse de l etoile decouverte (en kg): ");
        getMasse();////faire try catch
        System.out.print("Veuillez entrer le nombre de planetes liees a cette etoile (max : 10): ");
        getTabPlanetesLiees();
    }

    private void entrerDonneesSatellites() {
        String nom, planeteLiee;
        Double rayon;
        System.out.print("Veuillez entrer le nom du satellite decouvert: ");
        nom = getNom();
        System.out.print("Veuillez entrer le rayon du satellite decouvert (en km): ");
        rayon = getRayon();
        System.out.print("Veuillez entrer la planète liée au satellite decouvert: ");
        planeteLiee = getPlaneteLiee();
        liste.add(new Satellites(getID(), nom, rayon, planeteLiee));/////////////////////////////////////////////////////////////////////////////////////////////////////// ajouter liste de lececrfichier
//        System.out.println(liste.toString());

    }

}
