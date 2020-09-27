package io.inventi.coffee.storage;

import io.inventi.coffee.exception.UnsupportedCoffeeOperationException;
import io.inventi.coffee.resources.Milk;

public class MilkStorage {
    private double amount;

    public void addMilk(Milk milk) {
        this.amount += milk.getAmount();
    }

    public Milk getMilk(double amount) {
        if (this.amount - amount < 0) {
            throw new UnsupportedCoffeeOperationException("out of milk");
        } else {
            this.amount -= amount;
            return new Milk(amount);
        }
    }
}
