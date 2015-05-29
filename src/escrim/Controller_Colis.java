/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package escrim;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author David
 */
public class Controller_Colis {
    
    // Assure que la classe courante utilise le logger 'LOGGER'
    private final static Logger LOGGER = Logger.getLogger(Controller_Colis.class.getName()); 
        
    public static final Controller_Colis instance = new Controller_Colis();
    
    
    
    public static Controller_Colis getController(){
        return instance ;
    }
    
    private Controller_Colis(){
        LOGGER.setLevel(Level.INFO);
    }
    
    public void creerColis(){
        LOGGER.info("Je suis dans creerColis()");
    }
    
   
}
