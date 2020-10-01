package io.inventi.coffee.machine;

import io.inventi.coffee.drinks.CoffeeType;
import io.inventi.coffee.drinks.Drink;
import io.inventi.coffee.exception.OutOfResourceException;
import io.inventi.coffee.exception.UnsupportedCoffeeOperationException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicCoffeeMachineTest {

    @Test
    public void shouldMakeEspresso() {
        CoffeeMachine coffeeMachine = new BasicCoffeeMachine();
        coffeeMachine.addCoffee(50);
        coffeeMachine.addMilk(100);
        Drink drink = coffeeMachine.makeCoffee(CoffeeType.ESPRESSO);

        assertEquals(drink.getType(), CoffeeType.ESPRESSO);
        assertEquals((drink).getCoffee().getAmount(), 25, 0);
        assertEquals((drink).getMilk().getAmount(), 0, 0);
    }

    @Test
    public void shouldMakeCappuccino() {
        CoffeeMachine coffeeMachine = new BasicCoffeeMachine();
        coffeeMachine.addCoffee(50);
        coffeeMachine.addMilk(100);
        Drink drink = coffeeMachine.makeCoffee(CoffeeType.CAPPUCCINO);

        assertEquals(drink.getType(), CoffeeType.CAPPUCCINO);
        assertEquals((drink).getCoffee().getAmount(), 25, 0);
        assertEquals((drink).getMilk().getAmount(), 85, 0);
    }

    @Test(expected = UnsupportedCoffeeOperationException.class)
    public void shouldNotSupportFlatWhite() {
        CoffeeMachine coffeeMachine = new BasicCoffeeMachine();
        coffeeMachine.addCoffee(50);
        coffeeMachine.addMilk(100);
        Drink drink = coffeeMachine.makeCoffee(CoffeeType.FLAT_WHITE);
    }

    @Test(expected = OutOfResourceException.class)
    public void shouldThrowOutOfResource() {
        CoffeeMachine coffeeMachine = new BasicCoffeeMachine();
        Drink drink = coffeeMachine.makeCoffee(CoffeeType.CAPPUCCINO);
    }
}
