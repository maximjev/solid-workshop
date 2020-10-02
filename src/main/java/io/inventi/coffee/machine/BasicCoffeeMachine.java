package io.inventi.coffee.machine;

import io.inventi.coffee.drinks.Cappuccino;
import io.inventi.coffee.drinks.Espresso;

import java.util.List;

public class BasicCoffeeMachine extends CoffeeMachine {
    public BasicCoffeeMachine() {
        super(List.of(new Espresso(), new Cappuccino()));
    }
}
