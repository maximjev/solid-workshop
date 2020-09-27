package io.inventi.coffee.drinks;

import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.resources.Milk;

public class FlatWhite implements Drink {
    private final Coffee coffee;
    private final Milk milk;

    public FlatWhite(Coffee coffee, Milk milk) {
        this.coffee = coffee;
        this.milk = milk;
    }

    @Override
    public CoffeeType getType() {
        return CoffeeType.FLAT_WHITE;
    }

    @Override
    public void drink() {
        System.out.println("Drinking flat white...");
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public Milk getMilk() {
        return milk;
    }
}
