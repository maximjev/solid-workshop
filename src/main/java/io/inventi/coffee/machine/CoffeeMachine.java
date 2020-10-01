package io.inventi.coffee.machine;

import io.inventi.coffee.drinks.Drink;
import io.inventi.coffee.drinks.CoffeeType;

public interface CoffeeMachine {
    Drink makeCoffee(CoffeeType type);

    void addMilk(double addedAmount);

    void addCoffee(double addedAmount);
}
