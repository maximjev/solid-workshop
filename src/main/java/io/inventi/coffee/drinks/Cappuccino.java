package io.inventi.coffee.drinks;

import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.resources.Milk;

public class Cappuccino extends Drink {
    public Cappuccino() {
        super(new Coffee(25), new Milk(85), CoffeeType.CAPPUCCINO);
    }
}
