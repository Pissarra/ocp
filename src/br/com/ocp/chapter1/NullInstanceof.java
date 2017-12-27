package br.com.ocp.chapter1;

interface HeavyAnimal {}

class HippoAnimal implements HeavyAnimal {}

public class NullInstanceof {

    public static void main(String[] args) {
        HeavyAnimal hippo = new HippoAnimal();
        boolean isHeavy = hippo instanceof HeavyAnimal;
        HeavyAnimal hippoNull = null;
        boolean isHeavyAndNotThrowException = hippoNull instanceof HeavyAnimal;

        System.out.println("Hippo is heavy? " + isHeavy);

        System.out.println("Hippo null is heavy? " + isHeavyAndNotThrowException);
    }
}
