package br.com.ocp.chapter3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        List<? super Number> listSuperNumber = new ArrayList<Number>();
        listSuperNumber.add(1);

        Integer n = new Integer(1);

        List<? extends Number> listExtendsNumber = new ArrayList<Integer>();

        // Nao compila o codigo abaixo porque sao imutaveis
//        listExtendsNumber.add(new Integer(1));
//        listExtendsNumber.add(1);

        // stranger things


        // ? super Class   -> nao eh imutavel, pode add ou remove
        // ? extends Class e <?> -> eh imutavel

        testGenericsWithExtends(Arrays.asList(1,2,3));

        // Nao compila o codigo abaixo
//        List<Object> list = new ArrayList<String>();


        List<? super IOException> l = new ArrayList<Exception>();
        l.add(new IOException());
        // Nao compila
//        l.add(new Exception());
    }

    private static void testGenericsWithExtends(List<? extends Number> parameters) {
        parameters.forEach(it -> System.out.println(it));
    }
}
