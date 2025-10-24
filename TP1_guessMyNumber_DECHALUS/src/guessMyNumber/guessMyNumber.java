/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessMyNumber;

import java.util.Random;
import java.util.Scanner;

/**24/10/2025
 *trouver le nombre
 * @author chalu
 */
public class guessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        // --- 4. MENU DES DIFFICULTÉS ---
        System.out.println("Choisissez un niveau de difficulte :");
        System.out.println("1) Facile (0 a 100, tentatives illimitees)");
        System.out.println("2) Normal (0 a 500, tentatives illimitees)");
        System.out.println("3) Difficile (0 a 1000, 10 tentatives)");
        System.out.println("4) Mode cauchemar (0 a 100, indications parfois fausses)");

        int choix = sc.nextInt();
        int max = 100;      // intervalle par défaut
        int tentativesMax = Integer.MAX_VALUE; // illimité par défaut
        boolean cauchemar = false;

        switch (choix) {
            case 1:
                max = 100;
                break;
            case 2:
                max = 500;
                break;
            case 3:
                max = 1000;
                tentativesMax = 10;
                break;
            case 4:
                max = 100;
                cauchemar = true;
                break;
            default:
                System.out.println("Choix invalide, on joue en mode facile.");
        }

        // --- 1 & 2. GÉNÉRATION DU NOMBRE ---
        int secret = generateurAleat.nextInt(max + 1);
        int tentative;
        int compteur = 0;

        System.out.println("J'ai choisi un nombre entre 0 et " + max + ". A vous de jouer !");

        // --- 2 & 3. BOUCLE DU JEU ---
        do {
            System.out.print("Entrez un nombre : ");
            tentative = sc.nextInt();
            compteur++;

            // Mode cauchemar : 30% de chance d'inverser l'indice
            boolean mentir = cauchemar && generateurAleat.nextInt(100) < 30;

            if (tentative < secret) {
                if (mentir) System.out.println("Trop grand !");
                else System.out.println("Trop petit !");
            } 
            else if (tentative > secret) {
                if (mentir) System.out.println("Trop petit !");
                else System.out.println("Trop grand !");
            }

            // Arrêt si trop de tentatives en mode difficile
            if (compteur >= tentativesMax && tentative != secret) {
                System.out.println("Vous avez atteint le nombre maximum de tentatives !");
                System.out.println("Le nombre secret etait : " + secret);
                System.out.println("Perdu !");
                sc.close();
                return;
            }

        } while (tentative != secret);

        // --- FIN DU JEU ---
        System.out.println("Gagne ! Le nombre etait bien : " + secret);
        System.out.println("Vous avez trouve en " + compteur + " coups.");
        
        sc.close();
    }
}
