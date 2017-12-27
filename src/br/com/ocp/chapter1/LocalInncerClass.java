package br.com.ocp.chapter1;

public class LocalInncerClass {

    private int x = 10;

    private void callInner () {
        class Inner {
            private int x = 20;

            public void testInner () {
                System.out.println("Member Inner access private attr: " + x);
                System.out.println("Member Inner access Father private attr: " + LocalInncerClass.this.x);
            }
        }
        Inner inner = new Inner();
        inner.testInner();
    }

    public static void main(String[] args) {
        LocalInncerClass father = new LocalInncerClass();
        father.callInner();
    }
}
