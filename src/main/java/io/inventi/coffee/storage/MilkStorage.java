package io.inventi.coffee.storage;

import io.inventi.coffee.resources.Milk;

public class MilkStorage extends Storage<Milk> {
    public MilkStorage() {
        super(new Milk(0));
    }

    public MilkStorage(Milk resource) {
        super(resource);
    }
}
