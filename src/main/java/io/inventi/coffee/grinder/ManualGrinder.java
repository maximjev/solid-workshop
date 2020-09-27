package io.inventi.coffee.grinder;

import io.inventi.coffee.resources.Beans;
import io.inventi.coffee.resources.Coffee;

public class ManualGrinder implements Grinder {
    @Override
    public Coffee grind(Beans beans) {
        try {
            System.out.println("Manually grinding beans...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Coffee(beans.getAmount() * 5);
    }
}
