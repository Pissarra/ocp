package br.com.ocp.chapter2;

/**
 * Double checked Locking
 *
 * volatile / synchronized
 */
public class LazySingletonPattern {

    private static volatile LazySingletonPattern instance;

    private LazySingletonPattern () {}

    public static LazySingletonPattern getInstance () {
        if (instance == null) {
            // only the first few calls would require synchronized
            synchronized (LazySingletonPattern.class) {
                instance = new LazySingletonPattern();
            }
        }
        return instance;
    }
}
