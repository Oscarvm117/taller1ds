package edu.unisabana.pizzafactory.model.model_amasador;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.amasadorgen;

public class Amasador_pizza_Integral implements amasadorgen {
    @Override
    public void amasar() {
        Logger.getLogger(Amasador_pizza_Integral.class.getName())
                .log(Level.INFO, "[@@] Amasando la delgada  con masa integral.");
        
        
    }

    
}
