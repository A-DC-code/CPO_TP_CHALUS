/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_dechalus;

import java.util.Random;
import java.util.Scanner;

/**24/10/2025
 *l'objectif est de déterminer si la fonction ramdom est vraiment aléatoire
 * @author chalu
 */
public class TP1_stats_DECHALUS {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        int[] tableau = new int[6];

        System.out.print("Combien de lancers voulez-vous effectuer ? ");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int valeur = generateurAleat.nextInt(6); 
            tableau[valeur]++; 
        }

        System.out.println("\nResultats (nombre d'apparitions) :");
        for (int i = 0; i < 6; i++) {
            System.out.println("Face " + (i + 1) + " : " + tableau[i]);
        }

        System.out.println("\nResultats (pourcentages) :");
        for (int i = 0; i < 6; i++) {
            double pourcentage = (tableau[i] * 100.0) / m;
            System.out.println("Face " + (i + 1) + " : " + pourcentage + " %");
        }

        sc.close();
    }
}
