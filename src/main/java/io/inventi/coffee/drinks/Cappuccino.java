package io.inventi.coffee.drinks;

import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.resources.Milk;

public class Cappuccino implements Drink {
    private final Coffee coffee;
    private final Milk milk;

    public Cappuccino(Coffee coffee, Milk milk) {
        this.coffee = coffee;
        this.milk = milk;
    }

    @Override
    public CoffeeType getType() {
        return CoffeeType.CAPPUCCINO;
    }

    @Override
    public void drink() {
        System.out.println("Drinking cappuccino...");
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public Milk getMilk() {
        return milk;
    }
}
