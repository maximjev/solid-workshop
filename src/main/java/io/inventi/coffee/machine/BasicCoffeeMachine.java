package io.inventi.coffee.machine;

import io.inventi.coffee.drinks.Drink;
import io.inventi.coffee.exception.OutOfResourceException;
import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.exception.UnsupportedCoffeeOperationException;
import io.inventi.coffee.resources.Milk;
import io.inventi.coffee.storage.MilkStorage;
import io.inventi.coffee.drinks.CoffeeType;

public class BasicCoffeeMachine implements CoffeeMachine {
    private final MilkStorage milkStorage = new MilkStorage();
    private double coffeeAmount;

    @Override
    public Drink makeCoffee(CoffeeType type) {
        switch (type) {
            case ESPRESSO: {
                return makeEspresso();
            }
            case CAPPUCCINO: {
                return makeCappuccino();
            }
            default: {
                throw new UnsupportedCoffeeOperationException("Unsupported coffee type");
            }
        }
    }

    private Drink makeEspresso() {
        if (this.coffeeAmount - 25 < 0) {
            throw new OutOfResourceException("out of coffee");
        }
        coffeeAmount -= 25;
        return new Drink(CoffeeType.ESPRESSO, new Coffee(25), new Milk(0));
    }

    private Drink makeCappuccino() {
        if (this.coffeeAmount - 25 < 0) {
            throw new OutOfResourceException("out of coffee");
        }
        coffeeAmount -= 25;
        return new Drink(CoffeeType.CAPPUCCINO, new Coffee(25), milkStorage.getMilk(85));
    }

    @Override
    public void addMilk(double addedAmount) {
        milkStorage.addMilk(addedAmount);
    }

    @Override
    public void addCoffee(double addedAmount) {
        this.coffeeAmount += addedAmount;
    }
}
