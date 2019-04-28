package tp2;

import java.util.Scanner;

public class ConfigGuide {

    boolean boucle = true;
    Scanner entree = new Scanner(System.in);

    protected void main() {
        recommencerProgramme();
    }

    private void recommencerProgramme() {
        boolean recommencer = true;
        System.out.println("BIENVENUE DANS LE GUIDE DU ROUTARD GALACTIQUE \n");
        while (recommencer = true) {
            afficherMenu();
            entrerMenu();
        }
    }

    private void afficherMenu() {
        System.out.println("Que voulez vous faire? \n");
        System.out.println("1-  Consulter l encyclopedie");
        System.out.println("2-  Saisir un nouveau corps celeste");
        System.out.println("3-  Modifier un corps celeste");
        System.out.println("4-  Statistiques");
        System.out.println("5-  Quitter");
    }

    private void entrerMenu() {
        int menu;
        while (boucle = true) {
            try {
                System.out.print("Votre choix: ");
                menu = Integer.parseInt(entree.nextLine());
                while (menu < 1 || menu > 5) {
                    System.out.println("Veuillez entrer un nombre entre 1 et 5");
                    menu = Integer.parseInt(entree.nextLine());
                }
                boucle = false;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Veuillez entrer un nombre entre 1 et 5");
            }
        }
    }
}
