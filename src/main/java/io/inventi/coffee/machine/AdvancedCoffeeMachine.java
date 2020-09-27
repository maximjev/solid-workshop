package io.inventi.coffee.machine;

import io.inventi.coffee.drinks.Cappuccino;
import io.inventi.coffee.drinks.Drink;
import io.inventi.coffee.drinks.Espresso;
import io.inventi.coffee.drinks.Latte;
import io.inventi.coffee.drinks.FlatWhite;
import io.inventi.coffee.resources.Beans;
import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.resources.Milk;
import io.inventi.coffee.exception.UnsupportedCoffeeOperationException;
import io.inventi.coffee.grinder.BladeGrinder;
import io.inventi.coffee.grinder.Grinder;
import io.inventi.coffee.storage.BeanStorage;
import io.inventi.coffee.storage.MilkStorage;
import io.inventi.coffee.drinks.CoffeeType;

public class AdvancedCoffeeMachine implements CoffeeMachine {
    private final MilkStorage milkStorage = new MilkStorage();
    private final BeanStorage beanStorage = new BeanStorage();
    private final Grinder grinder = new BladeGrinder();

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
            Coffee coffee = grinder.grind(beanStorage.getBeans(5));
            this.coffeeAmount += coffee.getAmount();
        }
        coffeeAmount -= 25;
        return new Espresso(new Coffee(25));
    }

    private Cappuccino makeCappuccino() {
        if (this.coffeeAmount - 25 < 0) {
            Coffee coffee = grinder.grind(beanStorage.getBeans(5));
            this.coffeeAmount += coffee.getAmount();
        }
        coffeeAmount -= 25;
        return new Cappuccino(new Coffee(25), milkStorage.getMilk(85));
    }

    private Latte makeLatte() {
        if (this.coffeeAmount - 25 < 0) {
            Coffee coffee = grinder.grind(beanStorage.getBeans(5));
            this.coffeeAmount += coffee.getAmount();
        }
        coffeeAmount -= 25;
        return new Latte(new Coffee(25), milkStorage.getMilk(75));
    }

    private FlatWhite makeFlatWhite() {
        if (this.coffeeAmount - 50 < 0) {
            Coffee coffee = grinder.grind(beanStorage.getBeans(10));
            this.coffeeAmount += coffee.getAmount();
        }
        coffeeAmount -= 50;
        return new FlatWhite(new Coffee(50), milkStorage.getMilk(100));
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
        beanStorage.addBeans(beans);
    }
}
