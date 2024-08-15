package edu.unisabana.pizzafactory;

import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.model_amasador.Amasador_pizza_Integral;
import edu.unisabana.pizzafactory.model.model_horneador.hornear_pizza_integral;
import edu.unisabana.pizzafactory.model.model_moldeador.moldeador_pizza_integral;


public class pizzaintegral implements pizzafactory {
    private Tamano tamano;
    private Ingrediente[] ingredientes;
    public pizzaintegral(Tamano tamano, Ingrediente[] ingredientes) {
        this.tamano = tamano;
        this.ingredientes = ingredientes;
    }
    @Override
        public amasadorgen crearamasadorgen(){
            return new Amasador_pizza_Integral();
        }
    @Override
        public horneadorge crearhorneadorge(){
            return new hornear_pizza_integral();
        }
    @Override
        public moldeadorgen crearmoldeadorgen(){
            return new moldeador_pizza_integral();
        }
    
}
