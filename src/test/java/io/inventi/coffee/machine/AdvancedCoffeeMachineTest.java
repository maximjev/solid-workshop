package io.inventi.coffee.machine;


import io.inventi.coffee.drinks.Drink;
import io.inventi.coffee.drinks.CoffeeType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AdvancedCoffeeMachineTest {

    @Test
    public void shouldMakeFlatWhite() {
        CoffeeMachine coffeeMachine = new AdvancedCoffeeMachine();
        coffeeMachine.addCoffee(50);
        coffeeMachine.addMilk(100);
        Drink drink = coffeeMachine.makeCoffee(CoffeeType.FLAT_WHITE);

        assertEquals(drink.getType(), CoffeeType.FLAT_WHITE);
        assertEquals(drink.getCoffee().getAmount(), 50, 0);
        assertEquals(drink.getMilk().getAmount(), 100, 0);
    }

    @Test
    public void shouldMakeLatte() {
        CoffeeMachine coffeeMachine = new AdvancedCoffeeMachine();
        coffeeMachine.addCoffee(50);
        coffeeMachine.addMilk(100);
        Drink drink = coffeeMachine.makeCoffee(CoffeeType.LATTE);

        assertEquals(drink.getType(), CoffeeType.LATTE);
        assertEquals(drink.getCoffee().getAmount(), 25, 0);
        assertEquals(drink.getMilk().getAmount(), 75, 0);
    }
}
