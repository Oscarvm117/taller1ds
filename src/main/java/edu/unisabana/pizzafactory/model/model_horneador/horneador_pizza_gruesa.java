package edu.unisabana.pizzafactory.model.model_horneador;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.horneadorge;



public class horneador_pizza_gruesa implements horneadorge {


    @Override
    public void hornear() {
        Logger.getLogger(horneador_pizza_gruesa.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza gruesa con masa convencional.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
    
}