/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_dechalus;
import Personnages.personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**12/11/2025
 *L'objectif du TP est de mettre en place la hiérarchie de classes pour un jeu d’Heroic Fantasy. La partie graphique ne sera pas abordée.
 * @author chalu
 */
public class TP3_Heroic_Fantasy_DECHALUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Epee exc = new Epee("Excalibur",7,5);
        Epee dur = new Epee("Durandale",4,7);
        Baton chene = new Baton("Chene",4,5);
        Baton charme = new Baton("charme",5,6);
        Baton ac = new Baton("accacia",6,7);
        Baton bo = new Baton("bouleau",4,12);
        Baton pi = new Baton("pin",7,3);
        Epee joy  = new Epee("Joyeuse",10,10);
        Epee hauteclaire = new Epee("Hauteclaire", 9, 6);
        Epee cortain = new Epee("Cortain", 8, 5);
        Epee flamberge = new Epee("Flamberge", 11, 6);


    ArrayList<Arme> listeArmes = new ArrayList<>();
listeArmes.add(exc);
listeArmes.add(bo);
listeArmes.add(pi);
listeArmes.add(ac);
listeArmes.add(flamberge);
listeArmes.add(cortain);
listeArmes.add(joy);
listeArmes.add(hauteclaire);
listeArmes.add(dur);
listeArmes.add(chene);
listeArmes.add(charme);
System.out.println("\nListe des armes :");
for (int i = 0; i < listeArmes.size(); i++) {
    System.out.println(listeArmes.get(i));
}
Magicien gandalf = new Magicien("Gandalf", 65, true);
        Magicien garcimore = new Magicien("Garcimore", 44, false);

        Guerrier conan = new Guerrier("Conan", 78, false);
        Guerrier lannister = new Guerrier("Lannister", 45, true);

        System.out.println("\n");
        conan.ajouterArme(bo);
        conan.ajouterArme(exc);
        conan.ajouterArme(flamberge);
        conan.equiper("Excalibur");
       
        System.out.println("\n");
        gandalf.ajouterArme(charme);
        gandalf.ajouterArme(chene);
        gandalf.ajouterArme(cortain);
        gandalf.equiper("Chene");
        
        ArrayList<personnage> listePerso = new ArrayList<>();
        listePerso.add(gandalf);
        listePerso.add(garcimore);
        listePerso.add(conan);
        listePerso.add(lannister);

        System.out.println("\nListe des personnages :");
        for (int i = 0; i < listePerso.size(); i++) {
            System.out.println(listePerso.get(i));
                System.out.println("\n");
        conan.ajouterArme(bo);
        conan.ajouterArme(exc);
        conan.ajouterArme(flamberge);
        conan.equiper("Excalibur");
       
        System.out.println("\n");
        gandalf.ajouterArme(charme);
        gandalf.ajouterArme(chene);
        gandalf.ajouterArme(cortain);
        gandalf.equiper("Chene");}
System.out.println("\n--- Caracteristiques des personnages ---");
System.out.println(conan);
System.out.println(gandalf);

System.out.println("Armes preferees de Gandalf : " 
                           + gandalf.getNombreArmesDePredilection());
System.out.println("Armes preferees de conan : " 
                           + conan.getNombreArmesDePredilection());

    }

    

}
    


