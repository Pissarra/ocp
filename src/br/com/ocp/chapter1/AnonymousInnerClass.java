package br.com.ocp.chapter1;

public class AnonymousInnerClass {

    private int x = 201;

    abstract class Inner {
        public abstract void testInner ();
    }

    private void callInner () {
        Inner inner = new Inner() {
            @Override
            public void testInner() {
                System.out.println("Member Inner access Father private attr: " + AnonymousInnerClass.this.x);
            }
        };
        inner.testInner();
    }

    public static void main(String[] args) {
        AnonymousInnerClass father = new AnonymousInnerClass();
        father.callInner();
    }
}
