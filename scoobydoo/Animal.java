/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoobydoo;

/**
 * Cette classe regroupe les animaux principaux de l'histoire qui peuvent se faire manipuler.
 * @author lucil
 */
public class Animal extends Personnage implements Manipulation{
    /**
     * Parametres de notre classe Animaux.
     * "mechant" definit si notre detective animaux est agressif ou non par true ou false.
     */
    protected boolean mechant;
    
    /**
     * Constructeur.
     * @param nom
     * @param personnalite
     * @param mechant 
     */
    public Animal(String nom, String personnalite, boolean mechant){
        
        super(nom, personnalite);
        this.mechant=mechant;
        sePresenter();
    }
    
    /**
     * Accesseur.
     * Renvoie l'etat de mechant.
     * @return 
     */
    public boolean getMechant(){
        return this.mechant;
    }
    
    /**
     * Mutateur.
     * Permet de modifier l'etat de mechant.
     * @param mechant 
     */
    public void setMechant(boolean mechant){
        this.mechant=mechant;
    }
    
    
    /**
     * Action que notre "animaux" effectuera selon s'il est mechant ou non.
     * Directement lié a l'interface manipulation.
     */
    public void action(){
        if (mechant==true){
            Sentiment sent = Sentiment.MECHANT;
            parler(sent.toString());
            attaquer();
        }
        else{
            parler("J'apprends a coder en JAVA !!!");
        }
    }
    
    
}
