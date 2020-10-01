package io.inventi.coffee.drinks;

import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.resources.Milk;

public class Drink {
    private final CoffeeType type;
    private final Coffee coffee;
    private final Milk milk;

    public Drink(CoffeeType type, Coffee coffee, Milk milk) {
        this.type = type;
        this.coffee = coffee;
        this.milk = milk;
    }

    public CoffeeType getType() {
        return type;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public Milk getMilk() {
        return milk;
    }
}
