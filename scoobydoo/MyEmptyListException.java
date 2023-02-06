/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoobydoo;

/**
 * Exception créée pour les listes vides
 * @author lucil
 */
public class MyEmptyListException extends Exception {
    /**
     * Constructeur
     * @param message 
     */
    public MyEmptyListException (String message){
        super(message);
    }
    
     /**
     * Accesseur.
     * renvoie le message personnalisé
     * @return 
     */
    @Override
    public String getMessage(){
        return super.getMessage();
    }
}
