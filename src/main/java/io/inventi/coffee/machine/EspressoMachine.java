package io.inventi.coffee.machine;

import io.inventi.coffee.drinks.Drink;
import io.inventi.coffee.drinks.Espresso;
import io.inventi.coffee.exception.UnsupportedCoffeeOperationException;
import io.inventi.coffee.grinder.Grinder;
import io.inventi.coffee.grinder.ManualGrinder;
import io.inventi.coffee.resources.Beans;
import io.inventi.coffee.resources.Coffee;
import io.inventi.coffee.resources.Milk;
import io.inventi.coffee.storage.BeanStorage;
import io.inventi.coffee.drinks.CoffeeType;

public class EspressoMachine implements CoffeeMachine {
    private final BeanStorage beanStorage = new BeanStorage();
    private final Grinder grinder = new ManualGrinder();
    private double coffeeAmount;

    @Override
    public Drink makeCoffee(CoffeeType type) {
        if (CoffeeType.ESPRESSO.equals(type)) {
            if (this.coffeeAmount - 25 < 0) {
                Coffee coffee = grinder.grind(beanStorage.getBeans(5));
                this.coffeeAmount += coffee.getAmount();
            }
            coffeeAmount -= 25;
            return new Espresso(new Coffee(25));
        }
        throw new UnsupportedCoffeeOperationException("Unsupported coffee type");
    }

    @Override
    public void addMilk(Milk milk) {
        throw new UnsupportedCoffeeOperationException("Missing milk storage");
    }

    @Override
    public void addCoffee(Coffee coffee) {
        coffeeAmount += coffee.getAmount();
    }

    @Override
    public void addBeans(Beans beans) {
        beanStorage.addBeans(beans);
    }
}
