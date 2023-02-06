/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoobydoo;

/**
 * Classe mère de notre histoire.
 * Elle est abstraite car il n'y a aucun interet a créer une instance de cette classe. 
 * On va juste hériter pour créer des personnages plus précis en modifiant les méthodes définies ici.
 * @author lucil
 */
public abstract class Personnage {
     /**
     * Parametres de notre classe mere.
     */
    protected String nom;
    protected final String personnalite;
    
    /**
     * Constructeur des personnnages.
     * @param nom
     * @param personnalite 
     */
    public Personnage (String nom, String personnalite){
        this.nom=nom;
        this.personnalite=personnalite;
    }
    /**
     * Accesseur.
     * renvoie le nom.
     * @return 
     */
    public String getNom(){
        return this.nom;
    }
    
    /**
     * Accesseur.
     * Renvoie la personnalité.
     * @return 
     */
    public String getPersonnalite(){
        return this.personnalite;
    }
    
    /**
     * Permet au personnage de parler et de preciser qui parle. 
     * @param dit 
     */
    public void parler(String dit){
        System.out.println(nom +" : "+ dit);
    }
    
    /**
     * Introduit les differents personnages au debut du periple.
     */
    public void sePresenter(){
        parler("Salut les amis ! Moi c'est " + nom +". "+ personnalite);
    }
    
    
}
