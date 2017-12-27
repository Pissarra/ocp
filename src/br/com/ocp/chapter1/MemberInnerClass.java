package br.com.ocp.chapter1;

public class MemberInnerClass {

    private int x = 15;

    protected class Inner {
        private int x = 35;

        public void testInner () {
            System.out.println("Member Inner access private attr: " + x);
            System.out.println("Member Inner access Father private attr: " + MemberInnerClass.this.x);
        }
    }

    private void callInner () {
        Inner inner = new Inner();
        inner.testInner();
    }

    public static void main(String[] args) {
        MemberInnerClass father = new MemberInnerClass();
        father.callInner();

        Inner inner = father.new Inner();
        inner.x = 55;
        father.x = 25;
        inner.testInner();
    }
}
