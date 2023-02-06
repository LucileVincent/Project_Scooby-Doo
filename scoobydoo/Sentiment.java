/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoobydoo;

/**
 * Cette classe retourne les différentes emotions que peuvent ressentir nos personnages 
 * durant l'histoire.
 * @author lucil
 */

public enum Sentiment {
    /**
     * Enumeration des différentes emotions avec une phrase pour les décrire.
     */
    PEUR("Aaaaah, au secours !!"),
    JOIE("Hourra !"),
    FAIM("Samy, j'ai encore faim !"),
    INQUIET("Oulalalala !"),
    REFLEXION("Mmmmmh..."),
    ETONNEMENT("OH ! Qu'est ce qui se passe ?"),
    DECEPTION("Mince ! On s'est fait avoir.."),
    MECHANT("Grrrr !");
    
    /**
     * Parametre de classe qui prendra en compte l'etat emotionnel.
     */
    private final String sentiment;
    
    /**
     * Constructeur
     * @param f 
     */
    private Sentiment(String f){
        sentiment=f;
    }
    
    /**
     * Retourne l'etat emotionnel de nos personnages.
     * @return 
     */
    @Override
    public String toString (){
        return sentiment;
    }
    
}
