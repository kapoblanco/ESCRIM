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
public class ControllerColis {
    
    // Assure que la classe courante utilise le logger 'LOGGER'
    private final static Logger LOGGER = Logger.getLogger(ControllerColis.class.getName()); 
        
    public static final ControllerColis instance = new ControllerColis();
    
    
    
    public static ControllerColis getController(){
        return instance ;
    }
    
    private ControllerColis(){
        LOGGER.setLevel(Level.INFO);
    }
    
    public void creerColis(String name){
        LOGGER.info("Je suis dans creerColis()");
    }
    
   
}
