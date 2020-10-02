package io.inventi.coffee.storage;

import io.inventi.coffee.resources.Resource;

public abstract class Storage<T extends Resource> {
    private final T resource;

    public Storage(T resource) {
        this.resource = resource;
    }

    public void fill(double addedAmount) {
        resource.increaseAmount(addedAmount);
    }

    public double take(double amount) {
        return resource.reduceAmount(amount);
    }
}
