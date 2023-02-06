/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scoobydoo;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 
 * @author lucil
 */
public class Scoobydoo {
   
    
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        int code = 1956;
        LinkedList <String> linkSuspect = new LinkedList<String>();
        
        Histoire hist = new Histoire ();
        hist.synopsis();
        System.out.println("");
        
        
        Innocent enrobi = new Innocent("Capitaine Enrobi","Mon film prefere c'est le Titanic.", "J'etais en train de fumer la pipe sur mon bateau.",2);
        System.out.println("");
        Innocent lloyd = new Innocent("Lloyd Emboukou","Je suis le proprietaire du petit singe.", "Je me suis cache dans un arbre avec Samy pour echapper aux animaux.",2);
        System.out.println("");
        Innocent dr = new Innocent("Dr Goudefiou","Je suis la responsable de la reserve.", "Je n'ai rien vu, j'etais avec les equipes de la reserve pour soigner un oiseau.",3);
        System.out.println("");
        Coupable henri = new Coupable("Henri Enseker","Je suis en vacances ici avec ma femme Honnie.", "Je prenais des photos au bord du lac avec Honnie.","braconniers");
        System.out.println("");
        Coupable honnie = new Coupable("Honnie Enseker","Je suis en vacances de 4e lune de miel avec mon mari Henri.", "J'etais en train d'aider le Dr Goudefiou avec les animaux.","braconniers");
        System.out.println("");
        Animal jacko = new Animal("Jacko","Je suis un petit single a chapeau.",false);
        System.out.println("");
        Detective fred = new Detective("Fred","J'adore construire des pieges !");
        System.out.println("");
        Detective daphne = new Detective("Daphne","Je suis a la pointe de la mode !");
        System.out.println("");
        Detective verra = new Detective("Verra","Rien ne m'echappe quand il s'agit de resoudre une enigme.");
        System.out.println("");
        Detective samy = new Detective("Samy","Je passe mon temps a manger.");
        System.out.println("");
        DetectiveAnimal scooby = new DetectiveAnimal("Scooby","J'ai faim moi !!","Scoobydoobydoooooo");
        System.out.println("");
        System.out.println("");
        
        linkSuspect.add(enrobi.nom);
        linkSuspect.add(dr.nom);
        linkSuspect.add(honnie.nom);
        linkSuspect.add(henri.nom);
        linkSuspect.add(lloyd.nom);
        
        hist.listCoupable(honnie.nom);
        hist.listCoupable(henri.nom);
        
        honnie.joueFlute(jacko);
        System.out.println("");
        jacko.action();
        System.out.println("");
        samy.poursuite();
        System.out.println("");
        
        hist.listeSuspect(linkSuspect);
        System.out.println("");
        System.out.println("");
        
        daphne.piege(code);
        System.out.println("");
        
        hist.listeSuspect(linkSuspect);
        System.out.println("");
        System.out.println("");
        
        verra.indiceTrouve(); 
        System.out.println("");
        
        hist.listeSuspect(linkSuspect);
        System.out.println("");
        System.out.println("");
        
        
        lloyd.inquietude();
        System.out.println("");
        scooby.faim();
        System.out.println("");
        dr.nourrir(scooby);
        System.out.println("");
        System.out.println("");
        
        
        
        fred.plan();
        System.out.println("");
        enrobi.excuse();
        System.out.println("");
        
        hist.listeSuspect(linkSuspect);
        System.out.println("");
        System.out.println("");
        
        dr.excuse();
        System.out.println("");
        
        hist.listeSuspect(linkSuspect);
        System.out.println("");
        System.out.println("");
        
        lloyd.excuse();
        System.out.println("");
        
        hist.listeSuspect(linkSuspect);
        System.out.println("");
        System.out.println("");
        
        honnie.excuse();
        System.out.println("");
        
        hist.listeSuspect(linkSuspect);
        System.out.println("");
        System.out.println("");
        
        henri.excuse();
        System.out.println("");
        
        hist.listeSuspect(linkSuspect);
        System.out.println("");
        System.out.println("");
        
        henri.joueFlute(scooby);
        scooby.action();
        System.out.println("");
        samy.calmer(scooby);
        scooby.action();
        System.out.println("");
        System.out.println("");
        hist.verifier(hist.listCoupable);
        verra.arrestation(hist.listCoupable);
        System.out.println("");
        honnie.raison();
        honnie.fuite();
        System.out.println("");
        System.out.println("");
        dr.remerciement();
        enrobi.nourrir(scooby);
        System.out.println("");
        scooby.outro();
        
        System.out.println("");
        hist.remerciementDeFin();
    }
    
    
}
