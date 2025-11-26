/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author chalu
 */
public abstract class Arme {
    String nom;
    int attaque;
    
    public Arme(String nom,int attaque){
        this.attaque=attaque;
        this.nom=nom;
    }
    
    public String getNom() {
        return nom;
    }
}
