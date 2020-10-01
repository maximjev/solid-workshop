package io.inventi.coffee.storage;

import io.inventi.coffee.exception.OutOfResourceException;
import io.inventi.coffee.resources.Milk;

public class MilkStorage {
    private double amount;

    public void addMilk(double addedAmount) {
        this.amount += addedAmount;
    }

    public Milk getMilk(double amount) {
        if (this.amount - amount < 0) {
            throw new OutOfResourceException("out of milk");
        } else {
            this.amount -= amount;
            return new Milk(amount);
        }
    }
}
