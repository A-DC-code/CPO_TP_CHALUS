/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_dechalus;

/**03/11/2025
 *L’objectif de cet exercice est de manipuler les références objets comprendre un peu mieux les mécanismes
de référence des objets. Il s’agit d’un TP guidé sur lequel l’important est l’observation des manipulations.
 * @author chalu
 */
public class TP2_manip_DECHALUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;

        System.out.println("Avant modification :");
        System.out.println("nb de calories de assiette2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de assiette3 : " + assiette3.nbCalories);

        assiette2.nbCalories += 100;

        System.out.println("\nApres modification :");
        System.out.println("nb de calories de assiette2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de assiette3 : " + assiette3.nbCalories);

        System.out.println("\nAvant inversion : assiette1 = " + assiette1.nbCalories + " / assiette2 = " + assiette2.nbCalories);
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;
        System.out.println("Apres inversion : assiette1 = " + assiette1.nbCalories + " / assiette2 = " + assiette2.nbCalories);

        moussaka[] tabMoussaka = new moussaka[10];
        for (int i = 0; i < tabMoussaka.length; i++) {
            tabMoussaka[i] = new moussaka(100 + i * 10);
        }

        System.out.println("\nCreation des Moussakas :");
        for (int i = 0; i < tabMoussaka.length; i++) {
            System.out.println("Moussaka " + i + " : " + tabMoussaka[i].nbCalories + " calories");
        }

    }
}
