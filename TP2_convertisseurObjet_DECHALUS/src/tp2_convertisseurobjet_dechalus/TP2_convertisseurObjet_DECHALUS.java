/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_dechalus;

import java.util.Scanner;

/**03/11/2025
 *Dans cet exercice qui est une directe application de ce que vous avez compris de l’exercice 1, nous allons
réaliser un convertisseur de températures en version objet. L’objectif est d’atteindre un résultat similaire à
ce qui avait été réalisé lors du TP syntaxe de base, mais en utilisant le paradigme objet. Ici, il ne s’agit pas
simplement de refaire un exercice dont le résultat sera similaire. Mais de s’approprier une nouvelle façon
de développer.
 * @author chalu
 */
public class TP2_convertisseurObjet_DECHALUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Convertisseur conv = new Convertisseur();

        int choix;
        double valeur, resultat;

        do {
            System.out.println("\n=== MENU CONVERTISSEUR ===");
            System.out.println("1. Celsius vers Kelvin");
            System.out.println("2. Kelvin vers Celsius");
            System.out.println("3. Fahrenheit vers Celsius");
            System.out.println("4. Celsius vers Fahrenheit");
            System.out.println("5. Kelvin vers Fahrenheit");
            System.out.println("6. Fahrenheit vers Kelvin");
            System.out.println("7. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            if (choix >= 1 && choix <= 6) {
                System.out.print("Entrez la temperature a convertir : ");
                valeur = sc.nextDouble();

                switch (choix) {
                    case 1:
                        resultat = conv.CelciusVersKelvin(valeur);
                        System.out.println(valeur + " °C = " + resultat + " K");
                        break;
                    case 2:
                        resultat = conv.KelvinVersCelcius(valeur);
                        System.out.println(valeur + " K = " + resultat + " °C");
                        break;
                    case 3:
                        resultat = conv.FahrenheitVersCelcius(valeur);
                        System.out.println(valeur + " °F = " + resultat + " °C");
                        break;
                    case 4:
                        resultat = conv.CelciusVersFahrenheit(valeur);
                        System.out.println(valeur + " °C = " + resultat + " °F");
                        break;
                    case 5:
                        resultat = conv.KelvinVersFahrenheit(valeur);
                        System.out.println(valeur + " K = " + resultat + " °F");
                        break;
                    case 6:
                        resultat = conv.FahrenheitVersKelvin(valeur);
                        System.out.println(valeur + " °F = " + resultat + " K");
                        break;
                }

                System.out.println(conv);
            }

        } while (choix != 7);

        System.out.println("Fin du programme. Merci d'avoir utilise le convertisseur !");
        sc.close();
    }
}
