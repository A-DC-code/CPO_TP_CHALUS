/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_dechalus;

/**03/11/2025
 *l'objectif est d'ecrire un code pour créer des classes
 * @author chalu
 */
public class TP2_Bieres_DECHALUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
7.0 ,"Dubuisson") ;
uneBiere.lireEtiquette();
        
BouteilleBiere deuxBiere = new BouteilleBiere("Leffe",
6.6 ,"L'abbaye de Leffe") ;
deuxBiere.lireEtiquette();

BouteilleBiere troisBiere = new BouteilleBiere("grim",
6.0 ,"Grimbergen") ;
troisBiere.lireEtiquette();

BouteilleBiere quatreBiere = new BouteilleBiere("goudale",
7.0 ,"lille") ;
quatreBiere.lireEtiquette();

BouteilleBiere cinqBiere = new BouteilleBiere("Pietra",
7.5 ,"Ajaccio") ;
cinqBiere.lireEtiquette();

troisBiere.Decapsuler();
troisBiere.Decapsuler();

 }}   


    

