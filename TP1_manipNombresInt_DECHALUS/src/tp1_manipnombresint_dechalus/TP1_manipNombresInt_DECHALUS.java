/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_dechalus;

import java.util.Scanner;


/**22/10/2025
 *effectuer les opérations élémentaires entre deux nombres
 * @author chalu
 */
public class TP1_manipNombresInt_DECHALUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier entier : ");
        int a = sc.nextInt();

        System.out.print("Entrez le deuxieme entier : ");
        int b = sc.nextInt();

        System.out.println("\nVous avez saisi : " + a + " et " + b);

        int somme = a + b;
        int difference = a - b;
        int produit = a * b;

        System.out.println("\nResultats :");
        System.out.println("Somme : " + somme);
        System.out.println("Difference : " + difference);
        System.out.println("Produit : " + produit);

        if (b != 0) {
            int quotient = a / b;
            int reste = a % b;
            System.out.println("Quotient entier : " + quotient);
            System.out.println("Reste de la division euclidienne : " + reste);

            double divisionReelle = (a * 1.0) / b;
            System.out.println("Division reelle (double) : " + divisionReelle);
        } else {
            System.out.println("Erreur : division par zero impossible !");
        }
    }
}
