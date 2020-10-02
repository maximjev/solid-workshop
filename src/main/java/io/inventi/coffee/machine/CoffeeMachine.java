package io.inventi.coffee.machine;

import io.inventi.coffee.drinks.CoffeeType;
import io.inventi.coffee.drinks.Drink;
import io.inventi.coffee.exception.UnsupportedCoffeeOperationException;
import io.inventi.coffee.storage.CoffeeStorage;
import io.inventi.coffee.storage.MilkStorage;

import java.util.List;

public abstract class CoffeeMachine {
    private final List<Drink> supportedDrinkRecipes;

    // TODO pass storages as dependencies
    private final MilkStorage milkStorage = new MilkStorage();
    private final CoffeeStorage coffeeStorage = new CoffeeStorage();

    protected CoffeeMachine(List<Drink> supportedDrinkRecipes) {
        this.supportedDrinkRecipes = supportedDrinkRecipes;
    }

    public Drink makeCoffee(CoffeeType type) {
        var drink = supportedDrinkRecipes.stream()
                .filter(d -> d.getType() == type)
                .findFirst()
                .orElseThrow(() -> new UnsupportedCoffeeOperationException("Unsupported coffee type"));

        milkStorage.take(drink.getMilk().getAmount());
        coffeeStorage.take(drink.getCoffee().getAmount());

        return drink;
    }

    public void addMilk(double addedAmount) {
        milkStorage.fill(addedAmount);
    }

    public void addCoffee(double addedAmount) {
        coffeeStorage.fill(addedAmount);
    }
}
