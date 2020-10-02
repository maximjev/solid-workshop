package io.inventi.coffee.machine;

import io.inventi.coffee.drinks.CoffeeType;
import io.inventi.coffee.drinks.Drink;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EspressoCoffeeMachineTest {
    @Test
    public void shouldMakeEspresso() {
        // given
        CoffeeMachine coffeeMachine = new EspressoCoffeeMachine();
        coffeeMachine.addCoffee(25);

        // when
        Drink drink = coffeeMachine.makeCoffee(CoffeeType.ESPRESSO);

        // then
        assertEquals(drink.getType(), CoffeeType.ESPRESSO);
        assertEquals(drink.getCoffee().getAmount(), 25, 0);
        assertEquals(drink.getMilk().getAmount(), 0, 0);
    }

    @Test
    public void shouldMakeBlackCoffee() {
        // given
        CoffeeMachine coffeeMachine = new EspressoCoffeeMachine();
        coffeeMachine.addCoffee(100);

        // when
        Drink drink = coffeeMachine.makeCoffee(CoffeeType.BLACK_COFFEE);

        // then
        assertEquals(drink.getType(), CoffeeType.BLACK_COFFEE);
        assertEquals(drink.getCoffee().getAmount(), 100, 0);
        assertEquals(drink.getMilk().getAmount(), 0, 0);
    }
}
