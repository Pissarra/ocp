package br.com.ocp.chapter1;

public class EnumWithAbstractMethods {

    public static void main(String[] args) {
        for (Type e : Type.values()) {
            e.printDefault();
        }
    }
}


enum Type {

    NUMBER {
        @Override
        public void printDefault() {
            System.out.println("Number: 0");
        }
    },
    STRING {
        @Override
        public void printDefault() {
            System.out.println("String: TEXT");
        }
    },
    FILE {
        @Override
        public void printDefault() {
            System.out.println("File: /home/pissarra/test.txt");
        }
    };

    public abstract void printDefault();
}