/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoobydoo;

/**
 * interface utilisée pour afficher que tous les animaux se font manipuler.
 * Cette interface sert à créer des comportements génériques:
 * DetectiveAnimaux et Animaux doivent obéir à un comportement particulier, l'affichage de leur manipulation.
 * Cette manipulation s'active quand l'evenement "joueFlute" a lieu.
 * @author lucil
 */
public interface Manipulation {
    
    /**
     * Affiche que les animaux sont manipuler et attaquent.
     */
    default void attaquer(){
        System.out.println("Oh non ! Les animaux nous attaquent. Fuyez !!!");
    }
    
    /**
     * Affiche que "nom" se fait manipuler.
     * @param nom
     */
    default void attaquer(String nom){
        System.out.println("Regardez !! Ca recommence ! " +nom+ " se transforme lui aussi !");
        
    }
}
