package io.inventi.coffee.drinks;

import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.resources.Milk;

public class Espresso extends Drink {
    public Espresso() {
        super(new Coffee(25), new Milk(0), CoffeeType.ESPRESSO);
    }
}
