package io.inventi.coffee.grinder;

import io.inventi.coffee.resources.Beans;
import io.inventi.coffee.resources.Coffee;

public class BladeGrinder implements Grinder {
    @Override
    public Coffee grind(Beans beans) {
        try {
            System.out.println("Automatically grinding beans...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Coffee(beans.getAmount() * 5);
    }
}
