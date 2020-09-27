package io.inventi.coffee.grinder;

import io.inventi.coffee.resources.Beans;
import io.inventi.coffee.resources.Coffee;

public interface Grinder {
    Coffee grind(Beans beans);
}
