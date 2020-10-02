package io.inventi.coffee.machine;

import io.inventi.coffee.drinks.Cappuccino;
import io.inventi.coffee.drinks.Espresso;
import io.inventi.coffee.drinks.FlatWhite;
import io.inventi.coffee.drinks.Latte;

import java.util.List;

public class AdvancedCoffeeMachine extends CoffeeMachine {
    public AdvancedCoffeeMachine() {
        super(List.of(new Espresso(), new FlatWhite(), new Latte(), new Cappuccino()));
    }
}
