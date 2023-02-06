/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoobydoo;




/**
 * Cette classe regroupe tous les personnages secondaires qui seront dans l'histoire.
 * Elle hérite de personnage et est héritée par Innocent et Coupables.
 * @author lucil
 */
public abstract class Suspect extends Personnage{
    /**
     * Parametres propres a la classe Suspect.
     * "alibi" donne l'alibi du personnage dans l'histoire.
     */
    protected final String alibi;
    
    /**
     * Constructeur
     * @param nom
     * @param personnalite
     * @param alibi 
     */
    protected Suspect(String nom, String personnalite, String alibi){
        super(nom, personnalite);
        this.alibi=alibi;
    }
    /**
     * Accesseur.
     * Renvoie l'alibi.
     * @return 
     */
    public String getAlibi(){
        return this.alibi;
    }
       
    /**
     * Permet de connaitre l'excuse de nos personnages apres l'attaque des animaux. 
     */
    public void excuse(){
        parler("C'est pas moi ! "+ this.alibi);
    } 
    
    
}
