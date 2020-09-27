package io.inventi.coffee.drinks;

import io.inventi.coffee.resources.Coffee;

public class Espresso implements Drink {
    private final Coffee coffee;

    public Espresso(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public CoffeeType getType() {
        return CoffeeType.ESPRESSO;
    }

    @Override
    public void drink() {
        System.out.println("Drinking espresso...");
    }

    public Coffee getCoffee() {
        return coffee;
    }
}
