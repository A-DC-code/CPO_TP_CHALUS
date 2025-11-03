/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_dechalus;

/**
 *
 * @author chalu
 */
public class Personne {
    String prenom;
    String nom;
    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.nbVoitures = 0;
        this.liste_voitures = new Voiture[3];
    }

    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) {
            return false;
        }
        if (nbVoitures >= 3) {
            return false;
        }
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        voiture_a_ajouter.proprietaire = this;
        return true;
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }
}
