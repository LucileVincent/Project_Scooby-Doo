/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoobydoo;

import java.util.ArrayList;

/**
 * Cette classe regroupent tous les personnages secondaires coupables dans l'histoire.
 * Ils possèdent des actions propres qui impactent d'autres classes.
 * @author lucil
 */
public class Coupable extends Suspect{
    /**
     * Parametres de notre classe Coupable.
     * "faceCache" donne la veritable nature du coupable
     */
    private final String faceCache;
    
    /**
     * Constructeur.
     * @param nom
     * @param personnalite
     * @param alibi
     * @param faceCache 
     */
    public Coupable(String nom, String personnalite, String alibi, String faceCache){
       super(nom,personnalite,alibi);
       this.faceCache=faceCache;
       sePresenter();
    }
    
    /**
     * Donne les raisons de leurs actions.
     */
    public void raison(){
        parler("Effectivement nous sommes des " + this.faceCache + ".");
        parler("Et on aurait reussi notre coup si cette bande de petits fouineurs n'avait pas mis son nez dans nos affaires !");
    }
    
    /**
     * Montre que les coupables prennent la fuite.
     */
    public void fuite(){
        Sentiment sent = Sentiment.DECEPTION;
        parler(sent.toString());
        parler("C'est l'heure de prendre la fuite ! Ciao.");
    }
    
    /**
     * Initie l'attaque des animaux en modifiant leur valeur de parametre "mechant" sur true.
     * Overloading
     * @param animal
     */
    public void joueFlute(Animal animal){
        System.out.println("Tiens ? Quelqu'un joue de la flute ?");
        animal.setMechant(true);
    }
    /**
     * Initie l'attaque des detectives animaux en modifiant leur valeur de parametre "mechant" sur true.
     * Overloading
     * @param detectiveAnimal 
     */
    public void joueFlute(DetectiveAnimal detectiveAnimal){
        System.out.println("Tiens ? Quelqu'un joue de la flute ?");
        detectiveAnimal.setMechant(true);
        
    }
}
