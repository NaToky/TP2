package tp2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ConfigGuide {

    Scanner entree = new Scanner(System.in);
    private ArrayList<CorpsCeleste> listeEtoiles = new ArrayList();
    private String[] planetesLiees;
    private int iD = 0, nbrCC = 0, nbrLunes = 0;
    private boolean atmosphere = false, eau = false, recommencer = true;
    private double rayon = 0.00, gravite = 0.00, tempMax = 0.00, tempMin = 0.00, tempMoy = 0.00, pourcentageRayon = 0.00, pourcentageAtmosphere = 0.00, pourcentageGravite = 0.00, pourcentageEau = 0.00, pourcentageTempMin = 0.00, pourcentageTempMax = 0.00, pourcentageTempMoy = 0.00;

    protected void main() throws IOException {
        recommencerProgramme();
    }

    private void recommencerProgramme() throws IOException {
        System.out.println("BIENVENUE DANS LE GUIDE DU ROUTARD GALACTIQUE \n");
        while (recommencer) {
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

    private void entrerMenu() throws IOException {
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
                        LecEcrFichier.afficherEncyclopedie(LecEcrFichier.listePlanetes);
                        break;
                    case 2:
                        afficherTypeDAstre();
                        entrerTypeDAstre();
                        break;
                    case 3:
                        supprimerPlanetes(LecEcrFichier.listePlanetes);
                        break;
                    case 4:
                        afficherStatistiques();
                        entrerStatistiques();
                        break;
                    case 5:
                        LecEcrFichier.ecrireFicher(LecEcrFichier.listePlanetes);
                        recommencer = false;
                        break;
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre entre 1 et 5: ");
            }
        }
    }

    private int getID() {
        if(LecEcrFichier.listePlanetes.isEmpty()){
            iD = 0;
        }else {
            int iDmax = 0;
            for (int i = 0; i < LecEcrFichier.listePlanetes.size(); i++) {
                if(LecEcrFichier.listePlanetes.get(i).getID() >= iDmax){
                    iDmax = LecEcrFichier.listePlanetes.get(i).getID() + 1; 
                }
            }
            iD = iDmax;
        }
        return (iD);
    }

    private void afficherStatistiques() {
        System.out.println("Veuillez choisir l'une des 3 options suivantes:");
        System.out.println("    1- Afficher le nombre de corps celeste crées. ");
        System.out.println("    2- afficher le nombre de planètes associées a chaque etoile. ");
        System.out.println("    3- afficher le nombre de lunes associées a chaque planète. ");
        System.out.print("Choix: ");
    }

    private void entrerStatistiques() {
        boolean boucle = true;
        int menu;
        while (boucle) {
            try {
                menu = Integer.parseInt(entree.nextLine());
                System.out.println("");
                while (menu < 1 || menu > 3) {
                    System.out.print("Veuillez entrer un nombre entre 1 et 3: ");
                    menu = Integer.parseInt(entree.nextLine());
                    System.out.println("");
                }
                switch (menu) {
                    case 1:
                        System.out.println("Le nombre de corps celestes crees est de " + nbrCC);
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println();
                        break;
                    case 3:
                        System.out.println(nbrLunes);
                        System.out.println("");
                        break;
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre entre 1 et 3: ");
            }
        }

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
        nbrCC += 1;
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
        while (boucle) {
            try {
                rayon = Double.parseDouble(entree.nextLine());
                while (rayon <= 0) {
                    System.out.println("");
                    System.out.print("Veuillez entrer un nombre reel positif: ");
                    rayon = Double.parseDouble(entree.nextLine());
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre reel positif: ");
            }
        }
        System.out.println("");
        return rayon;
    }

    private double getCompatibilite() {
        double compatibilite = 100;
        compatibilite = compatibilite - soustraireRayon() - soustraireAtmosphere() - soustraireGravite() - soustraireEau() - soustraireTempMin() - soustraireTempMax() - soustraireTempMoy();
        return compatibilite;
    }

    private double soustraireRayon() {
        double rapport;
        final double rayonTerre = 6371;
        rapport = rayon / rayonTerre;
        pourcentageRayon = Math.abs((1 - rapport) * 10);
        return pourcentageRayon;
    }

    private double soustraireAtmosphere() {
        if (atmosphere = true) {
            pourcentageAtmosphere = 0;
        } else if (!atmosphere) {
            pourcentageAtmosphere = 10;
        }
        return pourcentageAtmosphere;
    }

    private double soustraireGravite() {
        double rapport;
        final double csteGravTerre = 9.81;
        rapport = gravite / csteGravTerre;
        pourcentageGravite = Math.abs((1 - rapport) * 5);
        return pourcentageGravite;
    }

    private double soustraireEau() {
        if (eau = true) {
            pourcentageEau = 0;
        } else if (!eau) {
            pourcentageEau = 10;
        }
        return pourcentageEau;
    }

    private double soustraireTempMin() {
        double rapport, tempMinK = tempMin + 273.15;
        final double tempMinTerreK = 179.95;
        rapport = Math.abs(tempMinK - tempMinTerreK);
        pourcentageTempMin = rapport / 10;
        return pourcentageTempMin;
    }

    private double soustraireTempMax() {
        double rapport, tempMaxK = tempMax + 273.15;
        final double tempMaxTerreK = 329.85;
        rapport = Math.abs(tempMaxK - tempMaxTerreK);
        pourcentageTempMax = rapport / 10;
        return pourcentageTempMax;
    }

    private double soustraireTempMoy() {
        double rapport, tempMoyK = tempMoy + 273.15;
        final double tempMoyTerreK = 287.99;
        rapport = Math.abs(tempMoyK - tempMoyTerreK);
        pourcentageTempMoy = rapport / 10;
        return pourcentageTempMoy;
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
                    System.out.print("Veuillez entrer un nombre de planetes liees valide (entre 0 et 10): ");
                    nbrPlanetes = Integer.parseInt(entree.nextLine());
                    System.out.println("");
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre de planetes liees valide (entre 0 et 10): ");
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

    private String[] getSatellites() {
        int nbrSatellites = 0;
        boolean boucle = true;
        String nomSatellites;
        while (boucle) {
            try {
                nbrSatellites = Integer.parseInt(entree.nextLine());
                System.out.println("");
                while (nbrSatellites < 0 || nbrSatellites > 10) {
                    System.out.print("Veuillez entrer un nombre de satellites valide (entre 0 et 10): ");
                    nbrSatellites = Integer.parseInt(entree.nextLine());
                    System.out.println("");
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre de satellites valide (entre 0 et 10): ");
            }
        }
        String[] tabSatellites = new String[nbrSatellites];
        for (int i = 0; i < nbrSatellites; i++) {
            System.out.print("Veuillez entrer le nom du satellite " + (i + 1) + ": ");
            nomSatellites = entree.nextLine();
            tabSatellites[i] = nomSatellites;

        }
        System.out.println("");
        return tabSatellites;
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
        double masse = 0.00;
        boolean boucle = true;
        while (boucle) {
            try {
                masse = Double.parseDouble(entree.nextLine());
                System.out.println("");
                while (masse <= 0) {
                    System.out.print("Veuillez entrer un nombre reel positif: ");
                    masse = Double.parseDouble(entree.nextLine());
                    System.out.println("");
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre reel positif: ");
            }
        }
        return masse;
    }

    private double getGravite() {
        boolean boucle = true;
        while (boucle) {
            try {
                gravite = Double.parseDouble(entree.nextLine());
                System.out.println("");
                while (gravite <= 0) {
                    System.out.print("Veuillez entrer un nombre reel positif: ");
                    gravite = Double.parseDouble(entree.nextLine());
                    System.out.println("");
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre reel positif: ");
            }
        }
        return gravite;
    }

    private double getTempMin() {
        boolean boucle = true;
        while (boucle) {
            try {
                tempMin = Double.parseDouble(entree.nextLine());
                System.out.println("");
                while (tempMin <= -273.15) {
                    System.out.print("Veuillez entrer un nombre reel plus grand que -273.15: ");
                    tempMin = Double.parseDouble(entree.nextLine());
                    System.out.println("");
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre reel plus grand que -273.15: ");
            }
        }
        return tempMin;
    }

    private double getTempMax() {
        boolean boucle = true;
        while (boucle) {
            try {
                tempMax = Double.parseDouble(entree.nextLine());
                System.out.println("");
                while (tempMax < tempMin) {
                    System.out.print("Veuillez entrer un nombre reel plus grand que " + tempMin + " (valeur min): ");
                    tempMax = Double.parseDouble(entree.nextLine());
                    System.out.println("");
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre reel plus grand que " + tempMin + ": ");
            }
        }
        return tempMax;
    }

    private double getTempMoy() {
        boolean boucle = true;
        while (boucle) {
            try {
                tempMoy = Double.parseDouble(entree.nextLine());
                System.out.println("");
                while (tempMoy < tempMin || tempMoy > tempMax) {
                    System.out.print("Veuillez entrer un nombre reel inclu entre " + tempMin + " (valeur min) et " + tempMax + " (valeur max): ");
                    tempMoy = Double.parseDouble(entree.nextLine());
                    System.out.println("");
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre reel inclu entre " + tempMin + " et " + tempMax + ": ");
            }
        }
        return tempMoy;
    }

    private int getPhase() {
        int phase = 0;
        boolean boucle = true;
        while (boucle) {
            try {
                phase = Integer.parseInt(entree.nextLine());
                System.out.println("");
                while (phase < 1 || phase > 14) {
                    System.out.print("Veuillez entrer un nombre entre 1 et 14: ");
                    phase = Integer.parseInt(entree.nextLine());
                    System.out.println("");
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre entre 1 et 14: ");
            }
        }
        return phase;

    }

    private boolean getAtmosphere() {
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
        boolean anneaux = false;
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
            anneaux = true;
        } else if (decision == 'N') {
            anneaux = false;
        }
        return anneaux;
    }

    private boolean getEau() {
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
            eau = true;
        } else if (decision == 'N') {
            eau = false;
        }
        return eau;
    }

    private void entrerDonneesPlanetesTelluriques() {
        String nom;
        String[] satellites;
        boolean vie;
        double compatibilite;
        System.out.print("Veuillez entrer le nom de la planete tellurique decouverte: ");
        nom = getNom();
        System.out.print("Veuillez entrer le rayon de la planete tellurique decouverte (en km): ");
        rayon = getRayon();
        System.out.print("L atmosphere de la planete tellurique decouverte est-elle compatible avec celle de la terre (oui/non)? ");
        atmosphere = getAtmosphere();
        System.out.print("Y a t-il presence de vie sur la planete tellurique decouverte (oui/non)? ");
        vie = getVie();
        System.out.print("Y a t-il presence d eau sur la planete tellurique decouverte (oui/non)? ");
        eau = getEau();
        System.out.print("Veuillez entrer la constante gravitationnelle de la planete tellurique decouverte: ");
        gravite = getGravite();
        System.out.print("Veuillez entrer la temperature minimum observable sur la planete tellurique decouverte: ");
        tempMin = getTempMin();
        System.out.print("Veuillez entrer la temperature maximum observable sur la planete tellurique decouverte: ");
        tempMax = getTempMax();
        System.out.print("Veuillez entrer la temperature moyenne observable sur la planete tellurique decouverte: ");
        tempMoy = getTempMoy();
        System.out.print("Veuillez entrer le nombre de satellites gravitant autour de la planete tellurique decouverte (max: 10): ");
        satellites = getSatellites();
        compatibilite = getCompatibilite();
        System.out.println("Compatibilite pour les terriens: " + compatibilite + "% \n");

        LecEcrFichier.listePlanetes.add(new PlaneteTellurique(getID(), nom, rayon, nbrCC, atmosphere, vie, eau, gravite, tempMin, tempMoy, tempMax, satellites, compatibilite));
    }

    private void entrerDonneesPlanetesGazeuses() {
        String nom;
        boolean vie, anneaux;
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
        LecEcrFichier.listePlanetes.add(new PlaneteGazeuse(getID(), nom, rayon, nbrCC, atmosphere, vie, anneaux));
        System.out.println("LA PLANETE GAZEUSE A ETE CREEE \n");
    }

    private void entrerDonneesPlanetesNaines() {
        String nom, type;
        System.out.print("Veuillez entrer le nom de la planete naine decouverte: ");
        nom = getNom();
        System.out.print("Veuillez entrer le rayon de la planete Naine decouverte (en km): ");
        rayon = getRayon();
        System.out.print("Veuillez entrer le type de la planète Naine decouverte (ASTEROIDE, EPARS, CUBEWANO ou AUTRE): ");
        type = getType();
        LecEcrFichier.listePlanetes.add(new PlaneteNaine(getID(), nom, rayon, nbrCC, type));//////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("LA PLANETE NAINE A ETE CREEE \n");
    }

    private void entrerDonneesEtoiles() {
        String nom;
        int phase;
        double masse;
        System.out.print("Veuillez entrer le nom de l etoile decouverte: ");
        nom = getNom();
        System.out.print("Veuillez entrer le rayon de l etoile decouverte (en km): ");
        rayon = getRayon();
        System.out.print("Veuillez entrer la phase a laquelle est rendue l etoile decouverte: ");
        phase = getPhase();
        System.out.print("Veuillez entrer la masse de l etoile decouverte (en kg): ");
        masse = getMasse();
        System.out.print("Veuillez entrer le nombre de planetes liees a cette etoile decouverte (max : 10): ");
        planetesLiees = getTabPlanetesLiees();
        LecEcrFichier.listePlanetes.add(new Etoile(getID(), nom, rayon, nbrCC, phase, masse, planetesLiees));
        System.out.println("L ETOILE A ETE CREEE \n");

    }

    private void entrerDonneesSatellites() {
        String nom, planeteLiee;
        nbrLunes++;
        System.out.print("Veuillez entrer le nom du satellite decouvert: ");
        nom = getNom();
        System.out.print("Veuillez entrer le rayon du satellite decouvert (en km): ");
        rayon = getRayon();
        System.out.print("Veuillez entrer le nom de la planète liée au satellite decouvert: ");
        planeteLiee = getPlaneteLiee();
        LecEcrFichier.listePlanetes.add(new Satellites(getID(), nom, rayon, nbrCC, planeteLiee));/////////////////////////////////////////////////////////////////////////////////////////////////////// ajouter liste de lececrfichier
        System.out.println("LE SATELITE A ETE CREE \n");

    }

    private void supprimerPlanetes(ArrayList<CorpsCeleste> listePlanetes) {
        System.out.println("Entrer le ID de la planete a supprimer: ");
        int choixID;
        boolean boucle = true;
        while (boucle) {
            try {
                choixID = Integer.parseInt(entree.nextLine());
                int i = 0;
                while (i != listePlanetes.size()) {
                    if(listePlanetes.get(i).getID() == choixID){
                        listePlanetes.remove(i);
                    }else {
                        i++;
                    }
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre reel (ID de la planete)");
            }
        }

    }

}
