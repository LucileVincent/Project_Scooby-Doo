/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoobydoo;

/**
 * Cette classe hérite de la classe Detective et fait reference au detective animal.
 * Il peut se faire manipuler comme les autres animaux.
 * @author lucil
 */
public class DetectiveAnimal extends Detective implements Manipulation{
    /**
     * Parametres de notre classe Detective.
     * "cri" donne le cri connu de l'outro du dessin animé.
     * "mechant" definit si notre detective animaux est agressif ou non par true ou false.
     */
    private final String cri;
    protected boolean mechant;
    
    /**
     * Constructeur.
     * @param nom
     * @param personnalite
     * @param cri 
     */
    public DetectiveAnimal (String nom, String personnalite, String cri){
        super(nom, personnalite);
        this.cri=cri;
    }
    
    /**
     * Acceseur.
     * Renvoie le parametre mechant.
     * @return 
     */
    public boolean getMechant(){
        return this.mechant;
    }
    
    /**
     * Mutateur.
     * Permet de modifier le parametre mechant.
     * @param mechant 
     */
    public void setMechant(boolean mechant){
        this.mechant=mechant;
    }
    
    /**
     * Affiche le cri de fin de l'episode.
     */
    public void outro(){
        parler(this.cri + " !!!");
    }
    
    /**
     * Renvoie l'etat affamé de notre detective animaux.
     */
    public void faim(){
        Sentiment sent = Sentiment.FAIM;
        parler(sent.toString());
    }
    
    /**
     * Action que notre _"detective animaux" effectuera selon s'il est mechant ou non.
     * Directement lié a l'interface manipulation.
     */
    public void action(){
        if (mechant==true){
            Sentiment sent = Sentiment.MECHANT;
            parler(sent.toString());
            attaquer(this.nom);
        }
        else{
            parler("Miam !");
            faim();
        }
    }
    
}
