package io.inventi.coffee.drinks;

import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.resources.Milk;

// TODO maybe split Drinks to recipes?
public abstract class Drink {
    private final Coffee coffee;
    private final Milk milk;
    private final CoffeeType type;

    protected Drink(Coffee coffee, Milk milk, CoffeeType type) {
        this.coffee = coffee;
        this.milk = milk;
        this.type = type;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public Milk getMilk() {
        return milk;
    }

    public CoffeeType getType() {
        return type;
    }
}
