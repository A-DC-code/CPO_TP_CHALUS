/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_dechalus;

import java.util.Scanner;

/**24/10/2025
 *ce programme est un convertisseur de température
 * @author chalu
 */
public class TP1_convertisseur_DECHALUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bonjour, saisissez une valeur :");
        double valeur = sc.nextDouble();

        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");

        int choix = sc.nextInt();

        double resultat = 0;

        switch (choix) {
            case 1:
                resultat = CelciusVersKelvin(valeur);
                System.out.println(valeur + " degres Celcius est egal à " + resultat + " degres Kelvin");
                break;
            case 2:
                resultat = KelvinVersCelcius(valeur);
                System.out.println(valeur + " degres Kelvin est egal à " + resultat + " degres Celcius");
                break;
            case 3:
                resultat = FarenheitVersCelcius(valeur);
                System.out.println(valeur + " degres Farenheit est egal à " + resultat + " degres Celcius");
                break;
            case 4:
                resultat = CelciusVersFarenheit(valeur);
                System.out.println(valeur + " degres Celcius est egal à " + resultat + " degres Farenheit");
                break;
            case 5:
                resultat = KelvinVersFarenheit(valeur);
                System.out.println(valeur + " degres Kelvin est egal à " + resultat + " degres Farenheit");
                break;
            case 6:
                resultat = FarenheitVersKelvin(valeur);
                System.out.println(valeur + " degres Farenheit est egal à " + resultat + " degres Kelvin");
                break;
            default:
                System.out.println("Erreur : choix invalide.");
        }

        sc.close();
    }

    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) / 1.8;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        return tCelcius * 1.8 + 32;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
    }
}
