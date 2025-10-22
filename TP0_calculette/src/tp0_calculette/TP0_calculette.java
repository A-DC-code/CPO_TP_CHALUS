/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**20/10/2025
 *l'objectif est de faire une Calculette
 * @author chalu
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        Scanner sc = new Scanner(System.in); 
        
        int operateur = 0;
        System.out.println( " Choisis un operateur " );
        operateur=sc.nextInt();
        
        if (operateur >= 1 && operateur <= 5) {
    System.out.println("Opérateur valide !");



        int operande1 = 0;
        System.out.println( " Choisis le premier nombre " );
        operande1=sc.nextInt();
        
        int operande2 = 0;
        System.out.println( " Choisis le deuxieme nombre " );
        operande2=sc.nextInt();
        
        int resultat=0;
        
        if (operateur == 1) {
            resultat = operande1 + operande2;
            
        } else if (operateur == 2) {
            resultat = operande1 - operande2;
            
        } else if (operateur == 3) {
            resultat = operande1 * operande2;
            
        } else if (operateur == 4) {
            if (operande2 == 0)
                System.out.println("Erreur : division par zero !");
            else {
                resultat = operande1 / operande2;
                return;
            }
        } else if (operateur == 5) {
            if (operande2 == 0)
                System.out.println("Erreur : modulo par zero !");
            else {
                resultat = operande1 % operande2;
                return;
            }
        } else {
            System.out.println("Erreur : operateur invalide !");
            return;
        }

        System.out.println("Le resultat est : " + resultat);
    }}
}else {
                System.out.println("Opérateur invalide !");
        
}
