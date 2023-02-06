/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoobydoo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Cette classe contient le synopsis de l'histoire.
 * Elle permet à l'utilisateur d'essayer de résoudre l'enquete en meme temps que l'histoire se deroule
 * @author lucil
 */
public class Histoire {
    /**
     * Parametre de la classe 
     * -Contient la liste des coupables que l'utilisateur va remplir
     */
    ArrayList <String> listCoupable = new ArrayList<String>();
    ArrayList <String> vraiListeCoupable =new ArrayList <String>();
    
    /**
     * Constructeur sans parametre.
     */
    public Histoire (){
        
    }
    
    /**
     * Accesseur
     * @return 
     */
    public ArrayList <String> getList(){
        return this.listCoupable;
    }
    
    /**
     * Mutateur.
     * Permet de modifier la liste de coupable.
     * @param listCoupable 
     */
    public void setList(ArrayList <String> listCoupable){
        this.listCoupable=listCoupable;
    }
    
    /**
     * Accesseur
     * @return 
     */
    public ArrayList <String> getCoupable(){
        return this.vraiListeCoupable;
    }
    
    /**
     * Mutateur.
     * Permet de mettre les vrai coupables dans la liste de coupable.
     * @param vraiListeCoupable 
     */
    public void setCoupable(ArrayList <String> vraiListeCoupable){
        this.vraiListeCoupable=vraiListeCoupable;
    }
    
    
    
    /**
     * Lecture du fichier synopsis de l'histoire qui introduit au tout debut l'enquete
     * @throws Exception 
     */
    public void synopsis () throws Exception{
        String texte;
        try{
            File myFile = new File("./Histoire.txt");
            FileReader fr= new FileReader(myFile);
            BufferedReader br = new BufferedReader(fr);
            if(br.readLine()==null){
                    throw new EmptyFileException("L'histoire charge ...");
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
    }
    
    /**
     * Permet a l'utilisateur de visualiser la liste de suspect dans l'enquete. 
     * Il a le choix de ne rien faire,supprimer des suspects ou ajouter un 
     * coupable dans une liste particuliere pour resoudre l'enquete
     * @param liste
     * @throws Exception 
     */
    public void listeSuspect (LinkedList <String> liste) throws Exception{
        int x =0;
        String texte ="";
        try{
            if(liste.isEmpty()){
                throw new MyEmptyListException("Histoire : La liste de suspect est vide... Vous ne pouvez plus rien faire.");
            }
            System.out.println("Liste des suspects :" + liste);
            System.out.print("Histoire : Voulez-vous enlever un suspect de la liste (1) ? Ajouter un coupable a la liste coupable (2) ? Ou ne rien faire ? (0 n'est pas une reponse possible) ");
            System.out.print("Reponse a rentrer :"); 
            do{
                Scanner sc = new Scanner(System.in);
                String entree = sc.nextLine();
                //ton scanner la
                try {
                    x =Integer.parseInt(entree);
                }
                catch (NumberFormatException e){
                   System.out.println("Histoire : Format de reponse incorrect !");
                   System.out.print("Reponse a rentrer :"); 
                   continue;
                }
            }
            while(x==0);
            switch(x){
                case 1 -> { 
                    int y=0;
                    System.out.print("Histoire : Rentrer le numero de l'emplacement dans la liste du suspect a enlever (commence a 1) :"); 
                    do{
                        Scanner sc = new Scanner(System.in);
                        String entree = sc.nextLine();
                        try {
                            y =Integer.parseInt(entree);
                            if(y>liste.size()){
                                throw new NumberFormatException();
                            }
                            else {
                                liste.remove(y-1);
                            }
                        }
                        catch (NumberFormatException e){
                            System.out.println("Histoire : Format de reponse incorrect !");
                            System.out.print("Reponse a rentrer :"); 
                            System.out.println("");
                            y=0;
                            continue;
                        }
                    }
                    while(y==0);
                    System.out.print(liste);
                }
                case 2 -> {
                    int y=0;
                    System.out.print("Histoire : Rentrer le numero de l'emplacement dans la liste du suspect a ajouter (commence a 1) :"); 
                    do{
                        Scanner sc = new Scanner(System.in);
                        String entree = sc.nextLine();
                        try {
                            y =Integer.parseInt(entree);
                            if(y>liste.size()){
                                throw new NumberFormatException();
                            }
                            else {
                                getList().add(liste.get(y-1));
                                liste.remove(y-1);
                            }
                        }
                        catch (NumberFormatException e){
                            System.out.println("Histoire : Format de reponse incorrect !");
                            System.out.print("Reponse a rentrer :"); 
                            System.out.println("");
                            y=0;
                            continue;
                        }
                    }
                    while(y==0);
                    System.out.print(getList());
                }
                case 3, 0, 4, 5, 6, 7, 8, 9 -> {
                }
                
            }
        }
        catch(MyEmptyListException f){
                 // f.printStackTrace(); affiche le message d'erreur si on le souhaite
            System.out.println(f.getMessage());        
        }
       
    }
    
    /**
     * Permet de verifier si la liste de coupable que les utilisateurs ont crée est la bonne.
     * @param listeCoupableUtilisateur 
     */
    public void verifier(ArrayList <String> listeCoupableUtilisateur){
        Collections.sort(listeCoupableUtilisateur);
        Collections.sort(vraiListeCoupable);
        if(vraiListeCoupable.equals(listeCoupableUtilisateur)){
            System.out.println("Histoire : Vous avez devine qui sont les coupables. Bravo !! ");
            System.out.println("Histoire : Regardons la suite de l'histoire... ");
        }
        else {
            System.out.println("Histoire : La liste des coupables n'est pas complete... Ce n'est pas grave vous retenterez une prochaine fois !");
            System.out.println("Histoire : Regardons la suite de l'histoire... ");
            setList(vraiListeCoupable);
        }
    }
    
    /**
     * Petit texte de fin pour remercier de la participation.
     */
    public void remerciementDeFin (){
        String [] auteur = {" Albane Buchwald", "Lucile Vincent"};
        System.out.print("Merci d'avoir participer a l'enquete !");
        System.out.print("Cordialement : " + Arrays.toString(auteur));
    }
    
    
    /**
     * Initialise la liste de coupable 
     * @param nom 
     */
    public void listCoupable(String nom){
        getCoupable().add(nom);
    }
}
