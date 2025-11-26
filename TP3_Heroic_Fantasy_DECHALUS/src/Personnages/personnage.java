/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.*;
import java.util.ArrayList;
/**
 *
 * @author chalu
 */
public abstract class personnage {

    protected String nom;
    protected int niveauVie;
    
    protected static int nbPersonnages = 0;
    
    protected ArrayList<Arme> inventaire = new ArrayList<>();
    protected Arme armeEnMain = null;
    
    public personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        nbPersonnages++;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public String getNom() {
        return nom;
    }

    public void ajouterArme(Arme a) {
        if (inventaire.size() < 5) {
            inventaire.add(a);
            System.out.println(nom + " recoit l'arme : " + a.getNom());
        } else {
            System.out.println("Impossible : " + nom + " possede deja 5 armes !");
        }
    }

    public Arme getArmeEnMain() {
        return armeEnMain;
    }

    public void equiper(String nomArme) {

        for (Arme a : inventaire) {
            if (a.getNom().equalsIgnoreCase(nomArme)) {
                armeEnMain = a;
                System.out.println(nom + " s'equipe de " + a.getNom());
                return;
            }
        }

        System.out.println("Arme non trouvee dans l’inventaire de " + nom + " : " + nomArme);
    }
    
    public abstract boolean estArmeDePredilection(Arme a);

    public int getNombreArmesDePredilection() {
    int count = 0;
    for (Arme a : inventaire) {
        if (estArmeDePredilection(a)) {
            count++;
        }
    }
    return count;
}

    
    @Override
    public String toString() {
        String info = nom + " (vie = " + niveauVie + ")";

        if (armeEnMain != null) {
            info += "  Arme en main : " + armeEnMain.getNom();
        } else {
            info += "  Arme en main : Aucune";
        }

        return info;
}
public static int getNbPersonnages() {
    return nbPersonnages;
}
}


