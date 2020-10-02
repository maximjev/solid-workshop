package io.inventi.coffee.drinks;

import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.resources.Milk;

public class BlackCoffee extends Drink {
    public BlackCoffee() {
        super(new Coffee(100), new Milk(0), CoffeeType.BLACK_COFFEE);
    }
}
