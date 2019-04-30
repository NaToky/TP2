package tp2;

import java.util.ArrayList;
import java.util.Scanner;

public class ConfigGuide {

    Scanner entree = new Scanner(System.in);

    private final CorpsCeleste corpsCeleste = new CorpsCeleste();

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
                        assignerID();
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

    private void assignerID() {
        corpsCeleste.setID(corpsCeleste.getID() + 1);
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

    private String entrerNomCC() {
        String nom;
        nom = entree.nextLine();
        System.out.println("");
        return nom;
    }

    private double entrerRayonCC() {
        Double rayon = 0.0;
        while (boucle) {
            try {
                rayon = Double.parseDouble(entree.nextLine());
                System.out.println("");
                boucle = false;
                while (rayon <= 0) {
                    System.out.println("Veuillez entrer un nombre entier positif: ");
                    rayon = Double.parseDouble(entree.nextLine());
                    System.out.println("");
                }
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("Veuillez entrer un nombre entier positif: ");
            }
        }
        boucle = true;
        return rayon;
    }
    
    private String entrerPlaneteLiee(){
        String planeteLiee;
        planeteLiee = entree.nextLine();
        System.out.println("");
        return planeteLiee;
    }
    private void entrerDonneesPlanetesTelluriques() {
        CorpsCeleste planeteTellurique = new PlaneteTellurique();
        liste.add(planeteTellurique);
        System.out.print("Veuillez entrer le nom de la planeteTellurique decouverte: ");
        planeteTellurique.setNom(entrerNomCC());
        System.out.print("Veuillez entrer le rayon de la planeteTellurique decouverte (en km): ");
        planeteTellurique.setRayon(entrerRayonCC());

    }

    private void entrerDonneesPlanetesGazeuses() {
        CorpsCeleste planeteGazeuse = new PlaneteGazeuse();
        liste.add(planeteGazeuse);
        System.out.print("Veuillez entrer le nom de la planeteGazeuse decouverte: ");
        planeteGazeuse.setNom(entrerNomCC());
        System.out.print("Veuillez entrer le rayon de la planeteGazeuse decouverte (en km): ");
        planeteGazeuse.setRayon(entrerRayonCC());
    }

    private void entrerDonneesPlanetesNaines() {
        CorpsCeleste planeteNaine1 = new PlaneteNaine();
        PlaneteNaine planeteNaine2 = new PlaneteNaine();
        liste.add(planeteNaine1);
        System.out.print("Veuillez entrer le nom de la planeteNaine decouverte: ");
        planeteNaine1.setNom(entrerNomCC());
        System.out.print("Veuillez entrer le rayon de la planeteNaine decouverte (en km): ");
        planeteNaine1.setRayon(entrerRayonCC());
    }

    private void entrerDonneesEtoiles() {
        CorpsCeleste etoile = new Etoile();
        liste.add(etoile);
        System.out.print("Veuillez entrer le nom de l etoile decouverte: ");
        etoile.setNom(entrerNomCC());
        System.out.print("Veuillez entrer le rayon de l etoile decouverte (en km): ");
        etoile.setRayon(entrerRayonCC());
    }

    private void entrerDonneesSatellites() {
        CorpsCeleste satellite1 = new Satellites();
        Satellites satellite2 = new Satellites();
        liste.add(satellite1);
        System.out.print("Veuillez entrer le nom du satellite decouvert: ");
        satellite1.setNom(entrerNomCC());
        System.out.print("Veuillez entrer le rayon du satellite decouvert (en km): ");
        satellite1.setRayon(entrerRayonCC());
        System.out.print("Veuillez entrer la planète liée au satellite decouvert: ");
        satellite2.setPlaneteLiee(entrerPlaneteLiee());
    }

}
