package io.inventi.coffee.resources;

import io.inventi.coffee.exception.OutOfResourceException;

public abstract class Resource {
    private double amount;

    protected Resource(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public double reduceAmount(double amount) {
        if (this.amount - amount < 0) {
            throw new OutOfResourceException("out of resource");
        }

        this.amount -= amount;
        return this.amount;
    }

    public double increaseAmount(double amount) {
        this.amount += amount;
        return this.amount;
    }
}
