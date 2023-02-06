/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoobydoo;

/**
 * La classe innocent regroupe tous nos personnages secondaires non coupables. 
 * Ils agrementent l'histoire et permettent de ne pas avoir que des coupables.
 * Ils possèdent des interractions propres. 
 * @author lucil
 */
public class Innocent extends Suspect{
    /**
     * Parametres de notre classe Innocent.
     * "scoobysnack" donne le nombre de snack qu'ils peuvent fournir .
     */
    private int scoobySnack;

    /**
     * Constructeur
     * @param nom
     * @param personnalite
     * @param alibi
     * @param scoobySnack 
     */
    public Innocent(String nom, String personnalite, String alibi, int scoobySnack){
       super(nom,personnalite,alibi);
       this.scoobySnack=scoobySnack;
       sePresenter();
    }
    /**
     * La fonction remerciement permet de cloturer l'histoire apres la decouverte des coupables.
     */
    public void remerciement(){
        parler("Attrapez moi les coupables vous autres avant qu'ils ne s'enfuient !");
        parler("Et vous un grand merci ! Vous avez sauve la reserve naturelle de Johannesburg !!!");
        Sentiment sent = Sentiment.JOIE;
        parler(sent.toString());
    }
    
    /**
     * Permet de nourir Scooby avec le nombre de scoobySnack que le personnage a.
     * A chaque fois que le personnage nourrit Scooby, le nombre de ScoobySnack qu'il possède diminue.
     * @param detectiveAnimal
     */
    public void nourrir(Detective detectiveAnimal){
        if(this.scoobySnack==0){
            parler("Mince ! Il n'y a plus de ScoobySnack... Nous sommes perdus !!!");
        }
        else {
            parler("Tiens "+detectiveAnimal.nom+" !! Un ScoobySnack pour toi !");
            this.scoobySnack--;
        }
        parler("Ils m'en restent " + this.scoobySnack);
    }
    
    /**
     * Renvoie l'état emotionnel de l'inquiétude du personnage en plus d'une petite phrase.
     */
    public void inquietude(){
        Sentiment sent = Sentiment.INQUIET;
        parler(sent.toString());
        parler("Tout le monde va bien ?");
    }
}
