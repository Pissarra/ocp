package br.com.ocp.chapter2;

import java.util.function.*;

public class AnimalPredicateInterface {

    public static void main(String[] args) {
        check(new Hummingbird(), a -> a.isBeautiful());
        check(null, a -> false);

        // the following code does not compile because this must check the value
        // check(null, () -> false);

    }

    public static void check(Hummingbird hummingbird, Predicate<Hummingbird> bird) {
        if (bird.test(hummingbird)) {
            System.out.println(hummingbird.getClass().getName());
        } else {
            System.out.println("Must not print this!");
        }
    }
}

class Hummingbird {
    public boolean isBeautiful() {
        return true;
    }
}