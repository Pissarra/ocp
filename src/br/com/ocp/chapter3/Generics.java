package br.com.ocp.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        List<? super Number> listaSuperNumeros = new ArrayList<>();
        listaSuperNumeros.add(1);

        Integer n = new Integer(1);

        List<? extends Number> listaExtendsNumeros = new ArrayList<Integer>();

        // Nao compila o codigo abaixo porque sao imutaveis
//        listaExtendsNumeros.add(new Integer(1));
//        listaExtendsNumeros.add(1);

        // stranger things


        // ? super Class   -> qualquer classe filha de Class
        // ? extends Class -> qualquer classe pai de Class

        testGenericsWithExtends(Arrays.asList(1,2,3));
    }

    private static void testGenericsWithExtends(List<? extends Number> parametros) {
        for (Object o : parametros) {
            System.out.println(o);
        }
    }
}
