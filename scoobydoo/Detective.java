/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoobydoo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Cette classe regroupe tous les personnages principaux de l'histoire : les detectives.
 * Classe mère de la classe DetectiveAnimaux.
 * @author lucil
 */
public class Detective extends Personnage{
  
    /**
     * Constructeur
     * @param nom
     * @param personnalite 
     */
    public Detective (String nom, String personnalite){
        super(nom, personnalite);
        sePresenter();
    }
    
    
    /**
     * modidfier partiellement la fonction sePresenter.
     */
    @Override
    public void sePresenter(){
        parler("Salut les amis ! Moi c'est " + nom + ". " + personnalite +" En avant pour l'aventure !!!");
    }
    
   
    /**
     * Permet de lire un fichier texte et de l'afficher dans le navigateur.
     * Verifie que le fichier n'est pas vide ou qu'il s'ouvre bien.
     * @throws java.lang.Exception
     */
    public void indiceTrouve()throws Exception{
        parler("Tiens ? Un bout de papier.");
        String texte;
        try{
            File myFile = new File("./Indice.txt");
            FileReader fr= new FileReader(myFile);
            BufferedReader br = new BufferedReader(fr);
            if(br.readLine()==null){
                throw new EmptyFileException("Le papier est vide ...");
            }
            Scanner lecture = new Scanner(myFile);
            do{
                texte = lecture.nextLine();
                System.out.println(texte);
            }
            while(lecture.hasNext());
        }
        catch(IOException | EmptyFileException f){
                 // f.printStackTrace(); affiche le message d'erreur si on le souhaite
            System.out.println(f.getMessage());        
        }
        finally {
            System.out.println("");
            Sentiment sent = Sentiment.REFLEXION;
            parler(sent.toString());
            parler("Regardez Dr, qu'est ce que vous en pensez ?");
        }
    }

    /**
     * Pour sortir du piege, demande a l'utilisateur de rentrer un code qu'il trouve en repondant a une question 
     * S'il rentre le bon code, on sort de la condition sinon on recommence tout à zéro.
     * @param code 
     * @throws java.lang.Exception 
     */
    public void piege(int code)throws Exception{
        parler("On est tombe dans un piege a animaux! ");
        parler("Regarde ! Il y a un cadenas a 4 chiffres... Et la ! Sur l'arbre, un truc ecrit : Creation de ISEN ??");
        System.out.print("Code a trouver :");
        
        int x=0;
        do{
            Scanner sc = new Scanner(System.in);
            String entree = sc.nextLine();
            //ton scanner la
            try {
                x =Integer.parseInt(entree);
            }
            catch (NumberFormatException e){
               System.out.println("Format du code incorrect !");
               System.out.print("Code a trouver :"); 
               continue;
            }
        }
        while(x==0);
        if (x==code){
            System.out.println("");
            Sentiment sent = Sentiment.JOIE;
            parler(sent.toString()+" On a trouve le code !");
            parler("Tiens ? C'est le Capitaine sur son bateau la bas.");
        } 
        else{
            System.out.println("Mince ce n'est pas le bon code ! Reprenons depuis le debut...");
            piege(code);
        } 
    }
  
    
   /**
    * Ecrit juste des phrases de texte utilent à l'histoire.
    */
    public void plan(){
        parler("Il est clair qu'il se passe quelque chose de louche ici... Quelqu'un en veut a la reserve !!");
        parler("Pour le demasquer, il n'y a qu'une solution ! Interrogeons tout le monde. Que faisiez vous hier aprem quand nous nous sommes fait attaquer au camps ??");
    }
    
    /**
     * Fonction qui fait suite à l'attaque des animaux pour agrémenter l'histoire.
     */
    public void poursuite(){
        Sentiment sent = Sentiment.PEUR;
        parler(sent.toString());
        System.out.println("Cours " +this.nom + " !!!");
        parler("Suivez moi LLoyd, vite!!!");
    }
    
    /**
     * Permet de dévoiler qui sont les coupables en prenant leurs noms en parametres 
     * dans une liste de String et en donnant des explications pour faire sens a l'histoire.
     * @param list 
     */
    public void arrestation(ArrayList <String> list){
        parler("Les amis, je sais qui sont nos coupables. Et ce n'est autre que :");
        for(String c : list){
            parler(c);
        }
        parler("J'ai tout de suite compris quand j'ai decouvert ce papier contenant une liste d'animaux avec des prix.");
        parler("Ils comptaient revendre les animaux au plus offrant une fois qu'il aurait effraye chacun d'entre nous car ce sont en fait...");
    }
    
    /**
     * Permet de modifier la valeur du boolean mechant dans la classe 
     * DetectiveAnimaux pour calmer Scooby apres la manipulation.
     * @param detectiveAnimal
     */
    public void calmer(DetectiveAnimal detectiveAnimal){
        parler("Attrappe "+ detectiveAnimal.nom+", un ScoobySnack !");
        detectiveAnimal.setMechant(false);
    }
    
   
}
