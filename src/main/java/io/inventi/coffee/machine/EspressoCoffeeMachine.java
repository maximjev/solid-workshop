package io.inventi.coffee.machine;

import io.inventi.coffee.drinks.BlackCoffee;
import io.inventi.coffee.drinks.Espresso;

import java.util.List;

public class EspressoCoffeeMachine extends CoffeeMachine {
    protected EspressoCoffeeMachine() {
        super(List.of(new BlackCoffee(), new Espresso()));
    }
}
