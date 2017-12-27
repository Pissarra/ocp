package br.com.ocp.chapter1;

public class StaticNestedClass {

    private int x = 15;

    static class Inner {
        private int x = 35;
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.x = 55;
        System.out.print("Static Nested: " + inner.x);
    }
}
