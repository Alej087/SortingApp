package org.example;

import java.util.Arrays;


public class SortingApp {

    public int[] sort(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Please insert some numbers");

        }

        if (array.length > 10) {
            throw new IllegalArgumentException("Please insert max 10 numbers");
        }

        Arrays.sort(array);

        System.out.println("Sorted numbers:");
        for (int number : array) {
            System.out.print(number + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        SortingApp sortingApp = new SortingApp();

        if (args.length == 0) {
            System.out.println("Please insert some numbers");
            return;
        }

        if (args.length > 10) {
            System.out.println("Please insert max 10 numbers");
            return;
        }

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("The item " + args[i] + " is not a number");
                return;
            }
        }

        sortingApp.sort(numbers);
    }
}
