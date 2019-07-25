package com.itisol.sort;

public class InsertionSort implements Sortable {

    @Override
    public Integer [] sort(Integer[] array) {
        Integer [] sorted = new Integer[array.length];

        for (int elementIndex = 0; elementIndex < array.length; elementIndex++) {
            Integer element = array[elementIndex];

            int secondIndex = elementIndex-1;
            while (secondIndex >= 0 && sorted[secondIndex] > element) {
                sorted[secondIndex+1] = sorted[secondIndex];
                secondIndex--;
            }

            sorted[secondIndex+1] = element;
        }

        return sorted;
    }

    @Override
    public Integer [] reverse(Integer[] array) {
        return null;
    }
}
