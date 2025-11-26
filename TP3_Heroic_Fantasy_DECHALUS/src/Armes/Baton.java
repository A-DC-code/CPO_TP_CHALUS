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
public class Baton extends Arme {
   int age; 
   public Baton(String nom,int attaque,int age){
       super(nom,attaque);
        this.age=age;
}
   @Override
    public String toString() {
        return "Le baton "+nom + " a une attaque de " + attaque + " et un age de " + age ;}
}
