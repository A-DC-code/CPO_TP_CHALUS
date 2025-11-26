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
public class Guerrier extends personnage {
     private boolean aCheval;

    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
    }

    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    public boolean isACheval() {
        return aCheval;
    }

    @Override
public boolean estArmeDePredilection(Arme a) {
    return a instanceof Epee;
}
    
    @Override
    public String toString() {
        return "Guerrier " + super.toString() + ", a cheval = " + aCheval;
    }
}
