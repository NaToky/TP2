package tp2;

import java.util.ArrayList;

import java.util.Scanner;

public class ConfigGuide {
    
    Scanner entree = new Scanner(System.in);
    
    int ID = 0;
    
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
        boolean boucle = true;
        System.out.print("Votre choix: ");
        while (boucle) {
            try {
                menu = Integer.parseInt(entree.nextLine());
                System.out.println("");
                while (menu < 1 || menu > 5) {
                    System.out.print("Veuillez entrer un nombre entre 1 et 5: ");
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
                System.out.print("Veuillez entrer un nombre entre 1 et 5: ");
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
        boolean boucle = true;
        System.out.print("Votre choix: ");
        while (boucle) {
            try {
                menu = Integer.parseInt(entree.nextLine());
                System.out.println("");
                while (menu < 1 || menu > 5) {
                    System.out.print("Veuillez entrer un nombre entre 1 et 5: ");
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
                System.out.print("Veuillez entrer un nombre entre 1 et 5: ");
            }
        }
    }
    
    private String getNom() {
        String nom;
        nom = entree.nextLine();
        System.out.println("");
        return nom;
    }
    
    private double getRayon() {
        boolean boucle = true;
        Double rayon = 0.0;
        while (boucle) {
            try {
                rayon = Double.parseDouble(entree.nextLine());
                while (rayon <= 0) {
                    System.out.println("");
                    System.out.print("Veuillez entrer un nombre entier positif: ");
                    rayon = Double.parseDouble(entree.nextLine());
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre entier positif: ");
            }
        }
        System.out.println("");
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
        boolean boucle = true;
        String nomPlanetesLiees;
        while (boucle) {
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
        String[] tabPlanetes = new String[nbrPlanetes];
        for (int i = 0; i < nbrPlanetes; i++) {
            System.out.print("Veuillez entrer le nom de la planete " + (i + 1) + ": ");
            nomPlanetesLiees = entree.nextLine();
            tabPlanetes[i] = nomPlanetesLiees;
            
        }
        System.out.println("");
        return tabPlanetes;
    }
    
    private String getType() {
        String type, typeMaj;
        type = entree.nextLine();
        System.out.println("");
        typeMaj = type.toUpperCase();
        while (!"ASTEROIDE".equals(typeMaj) && !"EPARS".equals(typeMaj) && !"CUBEWANO".equals(typeMaj) && !"AUTRE".equals(typeMaj)) {
            System.out.print("Veuillez entrer un nom de planete liee valide (ASTEROIDE, EPARS, CUBEWANO ou AUTRE)");
            type = entree.nextLine();
            System.out.println("");
            typeMaj = type.toUpperCase();
        }
        return type;
    }
    
    private double getMasse() {
        double masse = 0;
        boolean boucle = true;
        while (boucle) {
            try {
                masse = Double.parseDouble(entree.nextLine());
                System.out.println("");
                while (masse <= 0) {
                    System.out.println("Veuillez entrer un nombre entier positif: ");
                    masse = Double.parseDouble(entree.nextLine());
                    System.out.println("");
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre entier positif: ");
            }
        }
        return masse;
    }
    
    private int getPhase() {
        int phase = 0;
        boolean boucle = true;
        while (boucle) {
            try {
                phase = Integer.parseInt(entree.nextLine());
                System.out.println("");
                while (phase < 1 || phase > 14) {
                    System.out.println("Veuillez entrer un nombre entier positif: ");
                    phase = Integer.parseInt(entree.nextLine());
                    System.out.println("");
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre entier positif: ");
            }
        }
        return phase;
        
    }
    
    private boolean getAtmosphere() {
        boolean atmosphere = false;
        String choix;
        char decision;
        choix = entree.nextLine();
        choix = choix.toUpperCase();
        decision = choix.charAt(0);
        System.out.println("");
        while (decision != 'O' && decision != 'N') {
            System.out.print("Veuillez entrer une reponse valide (oui/non): ");
            choix = entree.nextLine();
            choix = choix.toUpperCase();
            decision = choix.charAt(0);
            System.out.println("");
        }
        if (decision == 'O') {
            atmosphere = true;
        } else if (decision == 'N') {
            atmosphere = false;
        }
        return atmosphere;
    }
    
    private boolean getVie() {
        boolean vie = false;
        String choix;
        char decision;
        choix = entree.nextLine();
        choix = choix.toUpperCase();
        decision = choix.charAt(0);
        System.out.println("");
        while (decision != 'O' && decision != 'N') {
            System.out.print("Veuillez entrer une reponse valide (oui/non): ");
            choix = entree.nextLine();
            choix = choix.toUpperCase();
            decision = choix.charAt(0);
            System.out.println("");
        }
        if (decision == 'O') {
            vie = true;
        } else if (decision == 'N') {
            vie = false;
        }
        return vie;
    }

    private boolean getAnneaux() {
        boolean anneau = false;
        String choix;
        char decision;
        choix = entree.nextLine();
        choix = choix.toUpperCase();
        decision = choix.charAt(0);
        System.out.println("");
        while (decision != 'O' && decision != 'N') {
            System.out.print("Veuillez entrer une reponse valide (oui/non): ");
            choix = entree.nextLine();
            choix = choix.toUpperCase();
            decision = choix.charAt(0);
            System.out.println("");
        }
        if (decision == 'O') {
            anneau = true;
        } else if (decision == 'N') {
            anneau = false;
        }
        return anneau;
    }

    private void entrerDonneesPlanetesTelluriques() {
        String nom;
        double rayon;
        System.out.print("Veuillez entrer le nom de la planete tellurique decouverte: ");
        nom = getNom();
        System.out.print("Veuillez entrer le rayon de la planete tellurique decouverte (en km): ");
        rayon = getRayon();
        liste.add(new PlaneteTellurique(getID(), nom, rayon, getVie(), getEau(), getGravite(), getAtmosphere(), getTempMax(), getTempMoy(), getTempMin(), getSatellites(), getCompatibilite());
        
    }
    
    private void entrerDonneesPlanetesGazeuses() {
        String nom;
        double rayon;
        boolean atmosphere, vie, anneaux;
        System.out.print("Veuillez entrer le nom de la planete gazeuse decouverte: ");
        nom = getNom();
        System.out.print("Veuillez entrer le rayon de la planete gazeuse decouverte (en km): ");
        rayon = getRayon();
        System.out.print("L atmosphere de la planete gazeuse decouverte est-elle compatible avec celle de la terre (oui/non)? ");
        atmosphere = getAtmosphere();
        System.out.print("Y a t-il presence de vie sur la planete gazeuse decouverte (oui/non)? ");
        vie = getVie();
        System.out.print("Y a t-il presence d un anneau qui entoure la planete gazeuse decouverte (oui/non)? ");
        anneaux = getAnneaux();
        liste.add(new PlaneteGazeuse(getID(), nom, rayon, atmosphere, vie, anneaux));
        System.out.println("LA PLANETE GAZEUSE A ETE CREEE \n");
    }
    
    private void entrerDonneesPlanetesNaines() {
        String nom, type;
        Double rayon;
        System.out.print("Veuillez entrer le nom de la planete naine decouverte: ");
        nom = getNom();
        System.out.print("Veuillez entrer le rayon de la planete Naine decouverte (en km): ");
        rayon = getRayon();
        System.out.print("Veuillez entrer le type de la planète Naine decouverte (ASTEROIDE, EPARS, CUBEWANO ou AUTRE): ");
        type = getType();
        liste.add(new PlaneteNaine(getID(), nom, rayon, type));//////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("LA PLANETE NAINE A ETE CREEE \n");
    }
    
    private void entrerDonneesEtoiles() {
        String nom;
        int phase;
        String[] planetesLiees;
        Double rayon, masse;
        System.out.print("Veuillez entrer le nom de l etoile decouverte: ");
        nom = getNom();
        System.out.print("Veuillez entrer le rayon de l etoile decouverte (en km): ");
        rayon = getRayon();
        System.out.print("Veuillez entrer la phase a laquelle est rendue l etoile decouverte");
        phase = getPhase();
        System.out.print("Veuillez entrer la masse de l etoile decouverte (en kg): ");
        masse = getMasse();
        System.out.print("Veuillez entrer le nombre de planetes liees a cette etoile (max : 10): ");
        planetesLiees = getTabPlanetesLiees();
        liste.add(new Etoile(getID(), nom, rayon, phase, masse, planetesLiees));
        System.out.println("L ETOILE A ETE CREEE \n");
        
    }
    
    private void entrerDonneesSatellites() {
        String nom, planeteLiee;
        Double rayon;
        System.out.print("Veuillez entrer le nom du satellite decouvert: ");
        nom = getNom();
        System.out.print("Veuillez entrer le rayon du satellite decouvert (en km): ");
        rayon = getRayon();
        System.out.print("Veuillez entrer le nom de la planète liée au satellite decouvert: ");
        planeteLiee = getPlaneteLiee();
        liste.add(new Satellites(getID(), nom, rayon, planeteLiee));/////////////////////////////////////////////////////////////////////////////////////////////////////// ajouter liste de lececrfichier
        System.out.println("LE SATELITE A ETE CREE \n");
        
    }
    
}
