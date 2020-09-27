package io.inventi.coffee.machine;

import io.inventi.coffee.drinks.Cappuccino;
import io.inventi.coffee.drinks.Drink;
import io.inventi.coffee.drinks.Espresso;
import io.inventi.coffee.resources.Beans;
import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.resources.Milk;
import io.inventi.coffee.exception.UnsupportedCoffeeOperationException;
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

    private Espresso makeEspresso() {
        if (this.coffeeAmount - 25 < 0) {
            throw new UnsupportedCoffeeOperationException("out of coffee");
        }
        coffeeAmount -= 25;
        return new Espresso(new Coffee(25));
    }

    private Cappuccino makeCappuccino() {
        if (this.coffeeAmount - 25 < 0) {
            throw new UnsupportedCoffeeOperationException("out of coffee");
        }
        coffeeAmount -= 25;
        return new Cappuccino(new Coffee(25), milkStorage.getMilk(85));
    }

    @Override
    public void addMilk(Milk milk) {
        milkStorage.addMilk(milk);
    }

    @Override
    public void addCoffee(Coffee coffee) {
        this.coffeeAmount += coffee.getAmount();
    }

    @Override
    public void addBeans(Beans beans) {
        throw new UnsupportedCoffeeOperationException("Missing beans storage");
    }
}
