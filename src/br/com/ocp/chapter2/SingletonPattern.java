package br.com.ocp.chapter2;

public class SingletonPattern {

    private static final SingletonPattern instance = new SingletonPattern();

    // or do this
//    static {
//        instance = new SingletonPattern();
//    }

    public static SingletonPattern getInstance () {
        return instance;
    }
}
