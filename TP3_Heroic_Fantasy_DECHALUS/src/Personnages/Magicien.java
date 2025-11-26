/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.*;
/**
 *
 * @author chalu
 */
public class Magicien extends personnage {
        private boolean confirme; 


    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
    }

   
    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    public boolean isConfirme() {
        return confirme;
    }
    
    @Override
public boolean estArmeDePredilection(Arme a) {
    return a instanceof Baton;
}
    
    @Override
    public String toString() {
        return "Magicien " + super.toString() + ", confirme = " + confirme;
    }
}
