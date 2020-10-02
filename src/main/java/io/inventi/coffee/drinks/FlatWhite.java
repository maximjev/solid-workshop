package io.inventi.coffee.drinks;

import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.resources.Milk;

public class FlatWhite extends Drink {
    public FlatWhite() {
        super(new Coffee(50), new Milk(100), CoffeeType.FLAT_WHITE);
    }
}
