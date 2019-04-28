package tp2;

import java.util.Scanner;

public class ConfigGuide {

    private final CorpsCeleste corpsCeleste = new CorpsCeleste();

    boolean boucle = true;
    Scanner entree = new Scanner(System.in);

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
                    System.out.println("Veuillez entrer un nombre entre 1 et 5:");
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
                System.out.println("Veuillez entrer un nombre entre 1 et 5:");
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
        System.out.println("    5-  Lune");
    }

    private void entrerTypeDAstre() {
        int menu;
        while (boucle) {
            try {
                System.out.print("Votre choix: ");
                menu = Integer.parseInt(entree.nextLine());
                System.out.println("");
                while (menu < 1 || menu > 5) {
                    System.out.println("Veuillez entrer un nombre entre 1 et 5:");
                    menu = Integer.parseInt(entree.nextLine());
                    System.out.println("");
                }switch (menu) {
                    case 1:
                        
                        break;
                    case 2:
                        
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
                System.out.println("Veuillez entrer un nombre entre 1 et 5:");
            }
        }
        boucle = true;
    }
    
    
    
}
