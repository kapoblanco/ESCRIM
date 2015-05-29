/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package escrim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author David
 */

import java.util.logging.Level;
import java.util.logging.Logger;
public class Base_Escrim{
    
    private final static Logger LOGGER = Logger.getLogger(JFrame_Principale.class.getName()); 
      
    public static void main(String[] args)
    {
        //Affiche
        LOGGER.setLevel(Level.INFO);
        //Affiche
        LOGGER.info("Je suis dans Base_Escrim");
        
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (Exception ex) {
            // handle the error
        }

        try
        {
        //Tentative de connexion à la base de données en local : utilisateur 'sonar2' et password 'sonar2'
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/?"+"user=sonar2&password=sonar2");
        
        //Affiche
        LOGGER.info("Connexion à la base de données ESCRIM réussie");
        
        //Créé l'objet requête
        Statement requete = conn.createStatement();

        //Requête de création de la base de données ESCRIM si non existante
        requete.executeUpdate("CREATE DATABASE IF NOT EXISTS escrim");
        //Requête d'utilisation de la base ESCRIM
        requete.executeUpdate("USE escrim");
        
        
        }
        catch(SQLException e){
            //Affiche
            LOGGER.severe("Exception SQL");
            
            while (e!=null){
              System.out.println(e.getErrorCode());
              System.out.println(e.getMessage());
              System.out.println(e.getSQLState());
              e.printStackTrace();
              e=e.getNextException();}
            }
        catch(Exception e)
                {
                e.printStackTrace();
                }
    }

}
