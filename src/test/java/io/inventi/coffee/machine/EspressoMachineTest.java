package io.inventi.coffee.machine;

import io.inventi.coffee.drinks.CoffeeType;
import io.inventi.coffee.drinks.Espresso;
import io.inventi.coffee.resources.Beans;
import io.inventi.coffee.resources.Coffee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EspressoMachineTest {
    @Test
    public void shouldMakeEspresso() {
        CoffeeMachine coffeeMachine = new EspressoMachine();
        coffeeMachine.addCoffee(new Coffee(50));
        Espresso drink = (Espresso) coffeeMachine.makeCoffee(CoffeeType.ESPRESSO);

        assertEquals(drink.getType(), CoffeeType.ESPRESSO);
        assertEquals((drink).getCoffee().getAmount(), 25, 0);
    }

    @Test
    public void shouldMakeEspressoAndGrindBeans() {
        CoffeeMachine coffeeMachine = new EspressoMachine();
        coffeeMachine.addBeans(new Beans(5));
        Espresso drink = (Espresso) coffeeMachine.makeCoffee(CoffeeType.ESPRESSO);

        assertEquals(drink.getType(), CoffeeType.ESPRESSO);
        assertEquals((drink).getCoffee().getAmount(), 25, 0);
    }
}
