package edu.unisabana.pizzafactory.model.model_horneador;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.horneadorge;

public class hornear_pizza_integral implements horneadorge {
    @Override
    public void hornear(){
        Logger.getLogger(hornear_pizza_integral.class.getName())
                .log(Level.INFO, "[@@] horneando la pizza delgada con masa integral.");
    }
    
}
