package io.inventi.coffee.machine;

import io.inventi.coffee.drinks.Drink;
import io.inventi.coffee.resources.Beans;
import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.resources.Milk;
import io.inventi.coffee.drinks.CoffeeType;

public interface CoffeeMachine {
    Drink makeCoffee(CoffeeType type);

    void addMilk(Milk milk);

    void addCoffee(Coffee coffee);

    void addBeans(Beans beans);
}
