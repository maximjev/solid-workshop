package io.inventi.coffee.machine;

import io.inventi.coffee.drinks.Cappuccino;
import io.inventi.coffee.drinks.CoffeeType;
import io.inventi.coffee.drinks.FlatWhite;
import io.inventi.coffee.exception.UnsupportedCoffeeOperationException;
import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.resources.Milk;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicCoffeeMachineTest {

    @Test
    public void shouldMakeCappuccino() {
        CoffeeMachine coffeeMachine = new BasicCoffeeMachine();
        coffeeMachine.addCoffee(new Coffee(50));
        coffeeMachine.addMilk(new Milk(100));
        Cappuccino drink = (Cappuccino) coffeeMachine.makeCoffee(CoffeeType.CAPPUCCINO);

        assertEquals(drink.getType(), CoffeeType.CAPPUCCINO);
        assertEquals((drink).getCoffee().getAmount(), 25, 0);
        assertEquals((drink).getMilk().getAmount(), 85, 0);
    }

    @Test(expected = UnsupportedCoffeeOperationException.class)
    public void shouldNotSupportFlatWhite() throws Exception {
        CoffeeMachine coffeeMachine = new BasicCoffeeMachine();
        coffeeMachine.addCoffee(new Coffee(50));
        coffeeMachine.addMilk(new Milk(100));
        FlatWhite drink = (FlatWhite) coffeeMachine.makeCoffee(CoffeeType.FLAT_WHITE);
    }
}
