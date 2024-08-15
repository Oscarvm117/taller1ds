package edu.unisabana.pizzafactory.model.model_moldeador;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.moldeadorgen;

public class moldeador_pizza_delgada implements moldeadorgen{

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(moldeador_pizza_delgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequena de masa convencional.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR

    }
    @Override
    public void molderarPizzaMediana() {
        Logger.getLogger(moldeador_pizza_delgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa convencional.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    
}
