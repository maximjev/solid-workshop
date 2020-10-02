package io.inventi.coffee.drinks;

import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.resources.Milk;

public class Latte extends Drink {
    public Latte() {
        super(new Coffee(25), new Milk(75), CoffeeType.LATTE);
    }
}
