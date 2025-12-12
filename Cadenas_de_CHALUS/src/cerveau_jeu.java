/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chalu
 */
public class cerveau_jeu {
  
public static int[] comparerPlusMoins(int[] joueur, int[] machine) {
    int justes = 0;
    int plus = 0;
    int moins = 0;

    for (int i = 0; i < joueur.length; i++) {
        if (joueur[i] == machine[i]) {
            justes++;
        } else if (joueur[i] < machine[i]) {
            plus++;
        } else { // joueur[i] > machine[i]
            moins++;
        }
    }

    return new int[]{justes, plus, moins};
}

public static int[] genererSuiteAleatoire() {
    int[] suite = new int[4];
    java.util.Random rand = new java.util.Random();

    for (int i = 0; i < 4; i++) {
        suite[i] = rand.nextInt(10);  // valeurs entre 0 et 9
    }

    return suite;
}

int[] suiteMachine;

public void nouvellePartie() {
    suiteMachine = genererSuiteAleatoire();  // ici ça change !

}
 
public static int incrementer(int n) {
    return (n + 1) % 10;
}

public static int decrementer(int n) {
    return (n + 9) % 10;
}


}
