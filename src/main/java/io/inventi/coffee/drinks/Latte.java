package io.inventi.coffee.drinks;

import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.resources.Milk;

public class Latte implements Drink {
    private final Coffee coffee;
    private final Milk milk;

    public Latte(Coffee coffee, Milk milk) {
        this.coffee = coffee;
        this.milk = milk;
    }

    @Override
    public CoffeeType getType() {
        return CoffeeType.LATTE;
    }

    @Override
    public void drink() {
        System.out.println("Drinking latte...");
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public Milk getMilk() {
        return milk;
    }
}
