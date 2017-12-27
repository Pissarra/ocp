package br.com.ocp.chapter2;

public class AnimalFunctionalInterface {

    public static void main(String[] args) {
        check(new Tiger(), a -> a.canRun());
        check(null, a -> a != null);
    }

    public static void check(Tiger tiger, Animal animal) {
        if (animal.hasName(tiger)) {
            System.out.println(tiger.getClass().getName());
        } else {
            System.out.println("Must not print this!");
        }
    }
}

class Tiger {
    public boolean canRun() {
        return true;
    }
}

@FunctionalInterface
interface Animal {
    // must not to have more than one method
    boolean hasName(Tiger tiger);
}
