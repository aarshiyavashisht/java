package Arrays;

import java.*;
import java.util.Arrays;

public class IceCream {

    public IceCream() {

    }

    public static void main(String[] args) {

        // Declaring arrays
        // String[] iceCreamNames;
        // int[] iceCreamPrices;

        // Instantiating arrays
        // String[] iceCreamNames = new String[5];
        // int[] iceCreamPrices = new int[5];

        String[] iceCreamNames = { "Mango", "Pineapple", "Chocolate", "Butterscotch", "Fruity" };
        int[] iceCreamPrices = { 20, 40, 35, 25, 15 };

        // Array literals

        // Accessing one value from array
        System.out.println("Ice cream at index[3]: " + iceCreamNames[3]);
        System.out.print("\n");

        // Accessing multiple values from array - Iterating
        for (int i = 0; i < iceCreamNames.length; i++) {
            System.out.println("Ice cream at index[" + i + "]: " + iceCreamNames[i]);
        }
        System.out.print("\n");

        // Updating one value from array
        System.out.println("Ice cream at index[3]: " + iceCreamNames[3]);
        iceCreamNames[3] = "Vanilla";
        System.out.println("Ice cream at index[3]: " + iceCreamNames[3]);
        System.out.print("\n");

        // Sorting an array
        Arrays.sort(iceCreamNames);
        // Arrays.sort(iceCreamNames,2,4);
        for (int i = 0; i < iceCreamNames.length; i++) {
            System.out.println("Ice cream at index[" + i + "]: " + iceCreamNames[i]);
        }
        System.out.print("\n");

        Arrays.sort(iceCreamPrices);
        for (int i = 0; i < iceCreamPrices.length; i++) {
            System.out.println("Ice cream at index[" + i + "]: " + iceCreamPrices[i]);
        }
        System.out.print("\n");

        // SORT
        // Arrays.sort(array);
        // Arrays.sort(array, fromIndex, toIndex);
        // Arrays.sort(objectArray, fromIndex, toIndex);

        // FILL - only for single dimensional arrays
        // Arrays.fill(array, value);
        // Arrays.fill(array, fromIndex, toIndex, value);

        // BINARY SEARCH
        // Arrays.fill(array, key);
        // Arrays.fill(array, fromIndex, toIndex, key);

        // EQUALS - boolean return type
        // Arrays.equals(array_1, array_2);
        // Arrays.equals(array_1, fromIndex_1, toIndex_1, array_2, fromIndex_2,
        // toIndex_2);

        // RANGE
        // Arrays.rangeCheck();

    }

}