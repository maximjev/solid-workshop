package io.inventi.coffee.storage;

import io.inventi.coffee.exception.UnsupportedCoffeeOperationException;
import io.inventi.coffee.resources.Beans;

public class BeanStorage {
    private double amount;

    public void addBeans(Beans beans) {
        this.amount += beans.getAmount();
    }

    public Beans getBeans(double amount) {
        if (this.amount - amount < 0) {
            throw new UnsupportedCoffeeOperationException("out of beans");
        } else {
            this.amount -= amount;
            return new Beans(amount);
        }
    }
}
