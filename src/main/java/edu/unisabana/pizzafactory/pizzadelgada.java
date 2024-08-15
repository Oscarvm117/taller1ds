package edu.unisabana.pizzafactory;

import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.model_amasador.Amasador_pizza_Delgada;
import edu.unisabana.pizzafactory.model.model_horneador.horneador_pizza_delgada;
import edu.unisabana.pizzafactory.model.model_moldeador.moldeador_pizza_delgada;

public class pizzadelgada implements pizzafactory{
    private Tamano tamano;
        private Ingrediente[] ingredientes;
        public pizzadelgada(Tamano tamano, Ingrediente[] ingredientes) {
            this.tamano = tamano;
            this.ingredientes = ingredientes;
        }
    @Override
        public amasadorgen crearamasadorgen(){
            return new Amasador_pizza_Delgada();
        }
    @Override
        public horneadorge crearhorneadorge(){
            return new horneador_pizza_delgada();
        }
    @Override
        public moldeadorgen crearmoldeadorgen(){
            return new moldeador_pizza_delgada();
        }
}
