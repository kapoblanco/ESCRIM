/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrim;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class Transport_Colis {
/******************************************************************************/
/*                                                                            */
/*                              VARIABLES GLOBALES                            */
/*                                                                            */
/******************************************************************************/ 
    // Assure que la classe courante appelle le LOGGER
    private final static Logger LOGGER = Logger.getLogger(JFrame_Principale.class.getName()); 
    
    //Créée une instance Transport_Colis
    public static final Transport_Colis instance = new Transport_Colis();
    
    private int    numero_Colis;
    private int    affectataire_Colis;  //Nominal/Optionnel
    private int    module_Colis;
    private int    priorite_Colis;      //Nominal/Optionnel
    private int    secteur_Colis;
    private int    nature_Colis;
    private String designation_Colis;
    private String precisions_Colis;
    private int    longueur_Colis;
    private int    largeur_Colis;
    private int    hauteur_Colis;
    private int    poids_Colis;
    private int    valeur_Colis;
    private int    iata_Colis;
    private int    projection_Colis;
    private String observations_Colis;
    
/******************************************************************************/
/*                                                                            */
/*                                 METHODES                                   */
/*                                                                            */
/******************************************************************************/ 
    private Transport_Colis(){
        //Filtre tous les logs INFO
        LOGGER.setLevel(Level.INFO);
        
    }
    //Retourne l'instance du transporteur colis
    public static Transport_Colis getTransporteur(){
        return instance ;
    }
}
