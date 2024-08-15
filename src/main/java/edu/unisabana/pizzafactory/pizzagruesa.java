package edu.unisabana.pizzafactory;

import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.model_amasador.Amasador_pizza_Gruesa;
import edu.unisabana.pizzafactory.model.model_horneador.horneador_pizza_gruesa;
import edu.unisabana.pizzafactory.model.model_moldeador.moldeador_pizza_gruesa;

public class pizzagruesa implements pizzafactory{
    private Tamano tamano;
    private Ingrediente[] ingredientes;

    public pizzagruesa(Tamano tamano, Ingrediente[] ingredientes) {
        this.tamano = tamano;
        this.ingredientes = ingredientes;
    }
    @Override
        public amasadorgen crearamasadorgen(){
            return new Amasador_pizza_Gruesa();
        }
    @Override
        public horneadorge crearhorneadorge(){
            return new horneador_pizza_gruesa();
        }
    @Override
        public moldeadorgen crearmoldeadorgen(){
            return new moldeador_pizza_gruesa();
        }

}