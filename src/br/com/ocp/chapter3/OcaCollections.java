package br.com.ocp.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OcaCollections {

    public static void main(String[] args) {
        arraysAndLists();
        searchingAndSorting();
    }

    private static void arraysAndLists() {
        List<String> list = new ArrayList<>();
        list.add("Rita");

        String[] array = new String[1];
        array[0] = "Pissarra";

        // Fixed size
        list = Arrays.asList(array);

        System.out.println(list);

        try {
            list.remove(0);
        } catch (UnsupportedOperationException e) {
            System.out.println("Arrays.asList returns a fixed list. Can not add or remove itens.");
        }

        System.out.println(list);

        array = (String[]) list.toArray();
        System.out.println(array[0]);
    }

    private static void searchingAndSorting() {
        int[] numbers = {10,2,5,11,15};

        Arrays.sort(numbers);

        int notFoundSearchResult = Arrays.binarySearch(numbers, 7);
        System.out.println(notFoundSearchResult);

        // (check position . -1) + (-1)
        int foundSearchResult = Arrays.binarySearch(numbers, 11);
        System.out.println(foundSearchResult);
    }
}
