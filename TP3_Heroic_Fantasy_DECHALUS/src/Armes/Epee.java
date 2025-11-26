/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author chalu
 */
public class Epee extends Arme{
 int finesse  ; 
    public Epee(String nom,int attaque,int finesse){
       super(nom,attaque);
        this.finesse=finesse;
       
    }
    @Override
    public String toString() {
        return "L'epee "+nom + " a une attaque de " + attaque + " et un indice de finesse de " + finesse ;}
}
