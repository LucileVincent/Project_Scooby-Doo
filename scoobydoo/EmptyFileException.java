/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoobydoo;

/**
 * Exception personnalisée pour les fichiers vides / inexistants
 * @author lucil
 */
public class EmptyFileException extends Exception {
    /**
     * Constructeur
     * @param message 
     */
    public EmptyFileException (String message){
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
