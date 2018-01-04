package br.com.ocp.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        List<? super Number> listSuperNumber = new ArrayList<>();
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
    }

    private static void testGenericsWithExtends(List<? extends Number> parameters) {
        for (Object o : parameters) {
            System.out.println(o);
        }
    }
}
