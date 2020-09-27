package io.inventi.coffee.machine;


import io.inventi.coffee.drinks.FlatWhite;
import io.inventi.coffee.drinks.Latte;
import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.drinks.CoffeeType;
import io.inventi.coffee.resources.Milk;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AdvancedCoffeeMachineTest {

    @Test
    public void shouldMakeFlatWhite() {
        CoffeeMachine coffeeMachine = new AdvancedCoffeeMachine();
        coffeeMachine.addCoffee(new Coffee(50));
        coffeeMachine.addMilk(new Milk(100));
        FlatWhite drink = (FlatWhite) coffeeMachine.makeCoffee(CoffeeType.FLAT_WHITE);

        assertEquals(drink.getType(), CoffeeType.FLAT_WHITE);
        assertEquals(drink.getCoffee().getAmount(), 50, 0);
        assertEquals(drink.getMilk().getAmount(), 100, 0);
    }

    @Test
    public void shouldMakeLatte() {
        CoffeeMachine coffeeMachine = new AdvancedCoffeeMachine();
        coffeeMachine.addCoffee(new Coffee(50));
        coffeeMachine.addMilk(new Milk(100));
        Latte drink = (Latte) coffeeMachine.makeCoffee(CoffeeType.LATTE);

        assertEquals(drink.getType(), CoffeeType.LATTE);
        assertEquals(drink.getCoffee().getAmount(), 25, 0);
        assertEquals(drink.getMilk().getAmount(), 75, 0);
    }
}
