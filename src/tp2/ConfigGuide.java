package tp2;

import java.util.ArrayList;
import java.util.Scanner;

public class ConfigGuide {

    Scanner entree = new Scanner(System.in);
    private String[] planetesLiees;
    private int iD = 0, nbrCC = 0, nbrLunes = 0;
    private boolean atmosphere = false, eau = false, recommencer = true;
    private double rayon = 0.00, gravite = 0.00, tempMax = 0.00, tempMin = 0.00, tempMoy = 0.00, pourcentageRayon = 0.00, pourcentageAtmosphere = 0.00, pourcentageGravite = 0.00, pourcentageEau = 0.00, pourcentageTempMin = 0.00, pourcentageTempMax = 0.00, pourcentageTempMoy = 0.00;

    protected void main() {
        recommencerProgramme();
    }

    private void recommencerProgramme() {
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

    /**
     * @param menu: options du menu
     * @param boucle: recommencer la boucle tant qu il y a une erreur dans le
     * programme
     * @throws IOException*
     */
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
                        afficherLecture();
                        break;
                    case 2:
                        afficherTypeDAstre();
                        entrerTypeDAstre();
                        break;
                    case 3:
                        afficherModif();
                        menuModifier();
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

    /**
     * @param ID: identifiant de chaque objet
     * @param iDmax: permet d augmenter le ID lorsqu un nouvel objet est cree
     * @return la valeur de l ID
     * @throws IOException*
     */
    private int getID() {
        int iDmax = 0;
        if (LecEcrFichier.listePlanetes.isEmpty()) {
            iD = 0;
        } else {
            for (int i = 0; i < LecEcrFichier.listePlanetes.size(); i++) {
                if (LecEcrFichier.listePlanetes.get(i).getID() >= iDmax) {
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

    /**
     * @param menu: options du menu
     * @param boucle: recommencer la boucle tant qu il y a une erreur dans le
     * programme
     */
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
                        afficherNbrPlanetes();
                        System.out.println("");
                        break;
                    case 3:
                        afficherNbrLunes();
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

    private void afficherNbrPlanetes() {
        for (int i = 0; i < LecEcrFichier.listePlanetes.size(); i++) {
            if ("Etoile".equals(LecEcrFichier.listePlanetes.get(i).getType())) {
            }
        }
    }

    private void afficherNbrLunes() {

    }

    private void afficherTypeDAstre() {
        System.out.println("Veuillez entrer le type d astre que vous voulez creer:");
        System.out.println("    1-  Planete tellurique");
        System.out.println("    2-  Planete gaseuse");
        System.out.println("    3-  Planete naine");
        System.out.println("    4-  Etoile");
        System.out.println("    5-  Satellite");
    }

    /**
     * @param menu: options du menu
     * @param boucle: recommencer la boucle tant qu il y a une erreur dans le
     * programme
     * @param nbrCC: compteur de corps celestes
     */
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

    /**
     * @param nom: nom d un nouveau corps celeste
     * @return le nom du corps celeste
     */
    private String getNom() {
        String nom;
        nom = entree.nextLine();
        System.out.println("");
        return nom;
    }

    private String getNomMod() {
        String nom;
        System.out.println("Entrer le nouveau Nom: ");
        nom = entree.nextLine();
        System.out.println("");
        return nom;
    }

    /**
     * @param boucle: recommencer la boucle tant qu il y a une erreur dans le
     * programme
     * @param rayon: rayon des corps celestes affectes
     * @return la valeur du rayon
     */
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

    private double getRayonMod() {
        boolean boucle = true;
        while (boucle) {
            try {
                System.out.println("Entrer le nouveau Rayon: ");
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

    /**
     * @param compatibilite: pourcentage de compatibilite maximal debutant a 100
     * @return le pourcentage de compatibilite reel final
     */
    private double getCompatibilite() {
        double compatibilite = 100;
        compatibilite = compatibilite - soustraireRayon() - soustraireAtmosphere() - soustraireGravite() - soustraireEau() - soustraireTempMin() - soustraireTempMax() - soustraireTempMoy();
        return compatibilite;
    }

    /**
     * @param rapport: rapport entre le rayon de la planete tellurique creee et
     * celui de la terre
     * @param rayonTerre: rayon de la terre
     * @param pourcentageRayon: pourcentage deduit du pourcentage total de
     * compatibilite pour le rayon de la planete tellurique
     * @return la valeur du pourcentage deduit par le rayon
     */
    private double soustraireRayon() {
        double rapport;
        final double rayonTerre = 6378.14;
        rapport = rayon / rayonTerre;
        pourcentageRayon = Math.abs((1 - rapport) * 10);
        return pourcentageRayon;
    }

    /**
     * @param atmosphere: determine si l atmosphere de la planete tellurique est
     * compatible avec celle de la terre
     * @param pourcentageAtmosphere: pourcentage deduit du pourcentage total de
     * compatibilite de l atmosphere de la planete tellurique et de la terre
     * @return la valeur du pourcentage deduit par l atmosphere
     */
    private double soustraireAtmosphere() {
        if (atmosphere == true) {
            pourcentageAtmosphere = 0;
        } else if (atmosphere) {
            pourcentageAtmosphere = 10;
        }
        return pourcentageAtmosphere;
    }

    /**
     * @param rapport: rapport entre la gravite de la planete tellurique creee
     * et celle de la terre
     * @param graviteTerre: gravite de la terre
     * @param gravite: gravite de la planete tellurique
     * @param pourcentageGravite: pourcentage deduit du pourcentage total de
     * compatibilite de la gravite de la planete tellurique et de la terre
     * @return la valeur du pourcentage deduit par la gravite
     */
    private double soustraireGravite() {
        double rapport;
        final double graviteTerre = 1.00;
        rapport = gravite / graviteTerre;
        pourcentageGravite = Math.abs((1 - rapport) * 5);
        return pourcentageGravite;
    }

    /**
     * @param eau: determine s il y a presence d eau sur la planete
     * @param pourcentageEau: pourcentage deduit du pourcentage total de
     * compatibilite de l eau de la planete tellurique et de la terre
     * @return la valeur du pourcentage deduit par la presence ou non d eau
     */
    private double soustraireEau() {
        if (eau == true) {
            pourcentageEau = 0;
        } else if (!eau) {
            pourcentageEau = 10;
        }
        return pourcentageEau;
    }

    /**
     * @param rapport: rapport entre la temperature minimale de la planete
     * tellurique creee et celle de la terre
     * @param tempMinK: temperature minimale de la planete tellurique en Kelvin
     * @param tempMin: temperature minimale de la planete tellurique en Celsius
     * @param tempMinTerreK: temperature minimale de la terre en Kelvin
     * @param pourcentageTempMin: pourcentage deduit du pourcentage total de
     * compatibilite de la temperature minimum de la planete tellurique et de la
     * terre
     * @return la valeur du pourcentage deduit par la temperature minimum
     */
    private double soustraireTempMin() {
        double rapport, tempMinK = tempMin + 273.15;
        final double tempMinTerreK = 179.95;
        rapport = Math.abs(tempMinK - tempMinTerreK);
        pourcentageTempMin = rapport / 10;
        return pourcentageTempMin;
    }

    /**
     * @param rapport: rapport entre la temperature maximale de la planete
     * tellurique creee et celle de la terre
     * @param tempMaxK: temperature maximale de la planete tellurique en Kelvin
     * @param tempMax: temperature maximale de la planete tellurique en Celsius
     * @param tempMaxTerreK: temperature maximale de la terre en Kelvin
     * @param pourcentageTempMax: pourcentage deduit du pourcentage total de
     * compatibilite de la temperature maximum de la planete tellurique et de la
     * terre
     * @return la valeur du pourcentage deduit par la temperature maximum
     */
    private double soustraireTempMax() {
        double rapport, tempMaxK = tempMax + 273.15;
        final double tempMaxTerreK = 329.85;
        rapport = Math.abs(tempMaxK - tempMaxTerreK);
        pourcentageTempMax = rapport / 10;
        return pourcentageTempMax;
    }

    /**
     * @param rapport: rapport entre la temperature moyenne de la planete
     * tellurique creee et celle de la terre
     * @param tempMoyK: temperature moyenne de la planete tellurique en Kelvin
     * @param tempMoy: temperature moyenne de la planete tellurique en Celsius
     * @param tempMoyTerreK: temperature moyenne de la terre en Kelvin
     * @param pourcentageTempMax: pourcentage deduit du pourcentage total de
     * compatibilite de la temperature moyenne de la planete tellurique et de la
     * terre
     * @return la valeur du pourcentage deduit par la temperature moyenne
     */
    private double soustraireTempMoy() {
        double rapport, tempMoyK = tempMoy + 273.15;
        final double tempMoyTerreK = 288.15;
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
        boolean boucle = true;
        while (boucle) {
            try {
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
                }
                if (decision == 'N') {
                    atmosphere = false;
                }
                boucle = false;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("");
                System.out.print("Veuillez entrer une reponse valide (oui/non): ");
            }
        }
        return atmosphere;
    }

    private boolean getVie() {
        boolean vie = false;
        String choix;
        char decision;
        boolean boucle = true;
        while (boucle) {
            try {
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
                boucle = false;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("");
                System.out.print("Veuillez entrer une reponse valide (oui/non): ");
            }
        }
        return vie;
    }

    private boolean getAnneaux() {
        boolean anneaux = false;
        String choix;
        char decision;
        boolean boucle = true;
        while (boucle) {
            try {
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
                boucle = false;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("");
                System.out.print("Veuillez entrer une reponse valide (oui/non): ");
            }
        }
        return anneaux;
    }

    private boolean getEau() {
        String choix;
        char decision;
        boolean boucle = true;
        while (boucle) {
            try {
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
                boucle = false;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("");
                System.out.print("Veuillez entrer une reponse valide (oui/non): ");
            }
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
        System.out.print("Veuillez entrer le facteur de gravite sur la planete tellurique decouverte: ");
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
        System.out.println("Compatibilite pour les terriens: " + String.format("%.2f", compatibilite) + "% \n");

        LecEcrFichier.listePlanetes.add(new PlaneteTellurique(getID(), nom, rayon, nbrCC, atmosphere, vie, eau, gravite, tempMin, tempMoy, tempMax, satellites, compatibilite));
        System.out.println("LA PLANETE TELLURIQUE A ETE CREEE \n");
    }

    private void entrerDonneesPlanetesGazeuses() {
        String nom;
        String[] satellites;
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
        System.out.print("Veuillez entrer le nombre de satellites gravitant autour de la planete gazeuses decouverte (max: 10): ");
        satellites = getSatellites();
        LecEcrFichier.listePlanetes.add(new PlaneteGazeuse(getID(), nom, rayon, nbrCC, atmosphere, vie, anneaux, satellites));
        System.out.println("LA PLANETE GAZEUSE A ETE CREEE \n");
    }

    private void entrerDonneesPlanetesNaines() {
        String nom, type;
        String[] satellites;
        System.out.print("Veuillez entrer le nom de la planete naine decouverte: ");
        nom = getNom();
        System.out.print("Veuillez entrer le rayon de la planete Naine decouverte (en km): ");
        rayon = getRayon();
        System.out.print("Veuillez entrer le type de la planète Naine decouverte (ASTEROIDE, EPARS, CUBEWANO ou AUTRE): ");
        type = getType();
        System.out.print("Veuillez entrer le nombre de satellites gravitant autour de la planete naine decouverte (max: 10): ");
        satellites = getSatellites();
        LecEcrFichier.listePlanetes.add(new PlaneteNaine(getID(), nom, rayon, nbrCC, type, satellites));//////////////////////////////////////////////////////////////////////////////////////////////////////////
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
        nbrCC--;
        int choixID;
        int supp = 0;
        boolean boucle = true;
        while (boucle) {
            try {
                choixID = Integer.parseInt(entree.nextLine());
                int i = 0;
                while (i != listePlanetes.size()) {
                    if (listePlanetes.get(i).getID() == choixID) {
                        LecEcrFichier.listePlanetes.remove(i);
                        supp++;
                    } else {
                        i++;
                    }
                }
                if (supp == 0) {
                    System.out.println("Aucun object trouve avec l'ID de: " + choixID);
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre reel (ID de la planete)");
            }
        }

    }

    private void afficherParID(ArrayList<CorpsCeleste> listePlanetes) {
        System.out.println(listePlanetes.size());
        for (int i = 0; i < listePlanetes.size(); i++) {
            System.out.println(listePlanetes.get(i).toString());
        }
    }

    private int choixType() {
        int choix = 0;
        boolean boucle = true;
        while (boucle) {
            try {
                System.out.println("Liste de types de Corps Celestes");
                System.out.println("\n1- Planète tellurique \n2- Planète gazeuse \n3- Planète naine \n4- Étoile \n5- Satellite ");
                System.out.println("Entrer le type a afficher (1-5): ");
                choix = Integer.parseInt(entree.nextLine());
                while (choix < 1 || choix > 5) {
                    System.out.print("Veuillez entrer un nombre entre 1 et 5: ");
                    choix = Integer.parseInt(entree.nextLine());
                    System.out.println("");
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre entre 1-5");
            }

        }
        
        return choix;
    }


    private void afficherParType(int choix) {
        int o = 0;
        switch (choix) {
            case 1:
                for (int i = 0; i < LecEcrFichier.listePlanetes.size(); i++) {
                    if ("PlaneteTellurique".equals(LecEcrFichier.listePlanetes.get(i).getType())) {
                        System.out.println(LecEcrFichier.listePlanetes.get(i).toString());
                        o++;
                    }
                    if (o == 0) {
                        System.out.println("Il n'y a pas de corps celeste de se type");
                    }
                }
                break;
            case 2:
                for (int i = 0; i < LecEcrFichier.listePlanetes.size(); i++) {
                    if ("PlaneteGazeuse".equals(LecEcrFichier.listePlanetes.get(i).getType())) {
                        System.out.println(LecEcrFichier.listePlanetes.get(i).toString());
                        o++;
                    }
                    if (o == 0) {
                        System.out.println("Il n'y a pas de corps celeste de se type");
                    }
                } 
                break;
            case 3:
                for (int i = 0; i < LecEcrFichier.listePlanetes.size(); i++) {
                    if ("PlanaiteNaine".equals(LecEcrFichier.listePlanetes.get(i).getType())) {
                        if ("PlaneteNaine".equals(LecEcrFichier.listePlanetes.get(i).getType())) {
                            System.out.println(LecEcrFichier.listePlanetes.get(i).toString());
                            o++;
                        }
                        if (o == 0) {
                            System.out.println("Il n'y a pas de corps celeste de se type");
                        }
                    }
                }  
                break;
            case 4:
                for (int i = 0; i < LecEcrFichier.listePlanetes.size(); i++) {
                    if ("Etoile".equals(LecEcrFichier.listePlanetes.get(i).getType())) {
                        System.out.println(LecEcrFichier.listePlanetes.get(i).toString());
                        o++;
                    }
                    if (o == 0) {
                        System.out.println("Il n'y a pas de corps celeste de se type");
                    }
                }  
                break;
            case 5:
                for (int i = 0; i < LecEcrFichier.listePlanetes.size(); i++) {
                    if ("Satellite".equals(LecEcrFichier.listePlanetes.get(i).getType())) {
                        System.out.println(LecEcrFichier.listePlanetes.get(i).toString());
                        if ("Satellite".equals(LecEcrFichier.listePlanetes.get(i).getType())) {
                            System.out.println(LecEcrFichier.listePlanetes.get(i).toString());
                            o++;
                        }
                        if (o == 0) {
                            System.out.println("Il n'y a pas de corps celeste de se type");
                        }
                    }
                }  
                break;
        }
      
    }

    private void modifierCorps() {
        int choixID;
        boolean boucle = true;
        System.out.println("Entrer le ID de la planete a modifier: ");
        while (boucle) {
            try {
                choixID = Integer.parseInt(entree.nextLine());
                for (int i = 0; i < LecEcrFichier.listePlanetes.size(); i++) {

                    if (LecEcrFichier.listePlanetes.get(i).getID() == choixID && LecEcrFichier.listePlanetes.get(i).getType().equals("Etoile")) {
                        int ID = LecEcrFichier.listePlanetes.get(choixID).getID();
                        int nbrCC = LecEcrFichier.listePlanetes.get(choixID).getNbrCC();
                        int phase = LecEcrFichier.listePlanetes.get(choixID).getPhase();
                        double masse = LecEcrFichier.listePlanetes.get(choixID).getMasse();
                        String[] planetesLiees = LecEcrFichier.listePlanetes.get(choixID).getPlanetesLiees();
                        LecEcrFichier.listePlanetes.set(choixID, new Etoile(ID, getNomMod(), getRayonMod(), nbrCC, phase, masse, planetesLiees));
                    } else if (LecEcrFichier.listePlanetes.get(i).getID() == choixID && LecEcrFichier.listePlanetes.get(i).getType().equals("PlaneteGazeuse")) {
                        int ID = LecEcrFichier.listePlanetes.get(choixID).getID();
                        int nbrCC = LecEcrFichier.listePlanetes.get(choixID).getNbrCC();
                        boolean atmosphere = LecEcrFichier.listePlanetes.get(choixID).isAtmosphere();
                        boolean vie = LecEcrFichier.listePlanetes.get(choixID).isVie();
                        boolean anneaux = LecEcrFichier.listePlanetes.get(choixID).isAnneaux();
                        String[] satellites = LecEcrFichier.listePlanetes.get(choixID).getSatellites();
                        LecEcrFichier.listePlanetes.set(choixID, new PlaneteGazeuse(ID, getNomMod(), getRayonMod(), nbrCC, atmosphere, vie, anneaux, satellites));
                    } else if (LecEcrFichier.listePlanetes.get(i).getID() == choixID && LecEcrFichier.listePlanetes.get(i).getType().equals("PlaneteNaine")) {
                        int ID = LecEcrFichier.listePlanetes.get(choixID).getID();
                        int nbrCC = LecEcrFichier.listePlanetes.get(choixID).getNbrCC();
                        String[] satellites = LecEcrFichier.listePlanetes.get(choixID).getSatellites();
                        String type = LecEcrFichier.listePlanetes.get(choixID).getType();
                        LecEcrFichier.listePlanetes.set(choixID, new PlaneteNaine(ID, getNomMod(), getRayonMod(), nbrCC, type, satellites));
                    } else if (LecEcrFichier.listePlanetes.get(i).getID() == choixID && LecEcrFichier.listePlanetes.get(i).getType().equals("PlaneteTellurique")) {
                        int ID = LecEcrFichier.listePlanetes.get(choixID).getID();
                        int nbrCC = LecEcrFichier.listePlanetes.get(choixID).getNbrCC();
                        boolean atmosphere = LecEcrFichier.listePlanetes.get(choixID).isAtmosphere();
                        boolean vie = LecEcrFichier.listePlanetes.get(choixID).isVie();
                        String[] satellites = LecEcrFichier.listePlanetes.get(choixID).getSatellites();
                        boolean eau = LecEcrFichier.listePlanetes.get(choixID).isEau();
                        double gravite = LecEcrFichier.listePlanetes.get(choixID).getGravite();
                        double tempMin = LecEcrFichier.listePlanetes.get(choixID).getTempMin();
                        double tempMax = LecEcrFichier.listePlanetes.get(choixID).getTempMax();
                        double tempMoy = LecEcrFichier.listePlanetes.get(choixID).getTempMoy();
                        double compatibilite = LecEcrFichier.listePlanetes.get(choixID).getCompatibilite();
                        LecEcrFichier.listePlanetes.set(choixID, new PlaneteTellurique(ID, getNomMod(), getRayonMod(), nbrCC, atmosphere, vie, eau, gravite, tempMin, tempMoy, tempMax, satellites, compatibilite));
                    } else if (LecEcrFichier.listePlanetes.get(i).getID() == choixID && LecEcrFichier.listePlanetes.get(i).getType().equals("Satellite")) {
                        int ID = LecEcrFichier.listePlanetes.get(choixID).getID();
                        int nbrCC = LecEcrFichier.listePlanetes.get(choixID).getNbrCC();
                        String planeteLiee = LecEcrFichier.listePlanetes.get(choixID).getPlaneteLiee();
                        LecEcrFichier.listePlanetes.set(choixID, new Satellites(ID, getNomMod(), getRayonMod(), nbrCC, planeteLiee));
                    } else {
                        System.out.println("Pas de planetes avec le ID: " + choixID);
                    }
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre reel (ID de la planete)");
            }
        }
    }

    private void menuModifier() {
        boolean boucle = true;
        int menu;
        while (boucle) {
            try {
                menu = Integer.parseInt(entree.nextLine());
                System.out.println("");
                while (menu < 1 || menu > 2) {
                    System.out.print("Veuillez entrer un nombre entre 1 et 2: ");
                    menu = Integer.parseInt(entree.nextLine());
                    System.out.println("");
                }
                switch (menu) {
                    case 1:
                        
                        afficherParType(choixType());
                        supprimerPlanetes(LecEcrFichier.listePlanetes);
                        
                        break;
                    case 2:
                        choixType();
                        modifierCorps();
                        break;
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre entre 1 et 3: ");
            }
        }
    }

    private void afficherModif() {
        System.out.println("Veuillez choisir l'une des 2 options suivantes:");
        System.out.println("    1- Supprimer un corps celeste ");
        System.out.println("    2- Modifier un corps celeste ");
        System.out.print("Choix: ");
    }
    
    private void afficherLecture(){
        boolean boucle = true;
        int menu;
        while (boucle) {
            try {
                System.out.println("1- Afficher Encyclopedie \n2- Afficher par Etoile");
                System.out.print("Veuillez entrer un nombre entre 1 et 2: ");
                menu = Integer.parseInt(entree.nextLine());
                System.out.println("");
                while (menu < 1 || menu > 2) {
                    menu = Integer.parseInt(entree.nextLine());
                    System.out.println("");
                }
                switch (menu) {
                    case 1:
                        LecEcrFichier.afficherEncyclopedie();
                        break;
                    case 2:
                        LecEcrFichier.afficherParEtoile();
                        break;
                }
                boucle = false;
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.print("Veuillez entrer un nombre entre 1 et 3: ");
            }
        }
    }
            

}
