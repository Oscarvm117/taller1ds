package edu.unisabana.pizzafactory.model.model_amasador;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.amasadorgen;



public class Amasador_pizza_Delgada implements amasadorgen{

    
    @Override
    public void amasar() {
        Logger.getLogger(Amasador_pizza_Delgada.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza delgada con masa convencional.");
        
        
    }
    
}