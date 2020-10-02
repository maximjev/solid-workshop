package io.inventi.coffee.storage;

import io.inventi.coffee.resources.Coffee;

public class CoffeeStorage extends Storage<Coffee> {
    public CoffeeStorage() {
        super(new Coffee(0));
    }

    public CoffeeStorage(Coffee resource) {
        super(resource);
    }
}
