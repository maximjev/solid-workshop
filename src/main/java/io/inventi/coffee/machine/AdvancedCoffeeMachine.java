package io.inventi.coffee.machine;

import io.inventi.coffee.drinks.Cappuccino;
import io.inventi.coffee.drinks.Drink;
import io.inventi.coffee.drinks.Espresso;
import io.inventi.coffee.drinks.Latte;
import io.inventi.coffee.drinks.FlatWhite;
import io.inventi.coffee.exception.OutOfResourceException;
import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.exception.UnsupportedCoffeeOperationException;
import io.inventi.coffee.storage.MilkStorage;
import io.inventi.coffee.drinks.CoffeeType;

public class AdvancedCoffeeMachine implements CoffeeMachine {
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
            case LATTE:
                return makeLatte();
            case FLAT_WHITE:
                return makeFlatWhite();
            default: {
                throw new UnsupportedCoffeeOperationException("Unsupported coffee type");
            }
        }
    }

    private Espresso makeEspresso() {
        if (this.coffeeAmount - 25 < 0) {
            throw new OutOfResourceException("out of coffee");
        }
        coffeeAmount -= 25;
        return new Espresso(new Coffee(25));
    }

    private Cappuccino makeCappuccino() {
        if (this.coffeeAmount - 25 < 0) {
            throw new OutOfResourceException("out of coffee");
        }
        coffeeAmount -= 25;
        return new Cappuccino(new Coffee(25), milkStorage.getMilk(85));
    }

    private Latte makeLatte() {
        if (this.coffeeAmount - 25 < 0) {
            throw new OutOfResourceException("out of coffee");
        }
        coffeeAmount -= 25;
        return new Latte(new Coffee(25), milkStorage.getMilk(75));
    }

    private FlatWhite makeFlatWhite() {
        if (this.coffeeAmount - 50 < 0) {
            throw new OutOfResourceException("out of coffee");
        }
        coffeeAmount -= 50;
        return new FlatWhite(new Coffee(50), milkStorage.getMilk(100));
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
