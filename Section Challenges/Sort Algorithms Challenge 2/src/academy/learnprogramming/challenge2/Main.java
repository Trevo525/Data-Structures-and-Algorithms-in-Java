package academy.learnprogramming.challenge2;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        // insertion sort
        // insertionSort(intArray);
        // insertionSortRecursive(intArray);
        insertionSortVideoExample(intArray, intArray.length);
        // print array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    private static void insertionSort(int[] intArray) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }
    }

    private static void insertionSortRecursive(int[] intArray) {
        // My attempt at making the insertion sort recursive. It works but it wasn't exactly what the video wanted.
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            // start recursive call here
            int i = recursiveSort(intArray, newElement, firstUnsortedIndex);
            // insert into array at index
            intArray[i] = newElement;

        }
    }

    private static int recursiveSort(int[] intArray, int newElement, int index) {
        // break the recursion
        if (index == 0) {
            return 0;
        }
        if (intArray[index - 1] <= newElement) {
            return index;
        } else {
            intArray[index] = intArray[index - 1];
            return recursiveSort(intArray, newElement, index - 1);
        }
    }
    public static void insertionSortVideoExample(int[] input, int numItems){
        /*
        *This is the example from the video
        */

        if (numItems < 2) {
            return;
        }

        insertionSortVideoExample(input, numItems - 1);

        int newElement = input[numItems -1];

        int i;
        for (i = numItems -1; i > 0 && input [i -1]> newElement; i--){
            input[i] = input[i-1];
        }

        input[i] = newElement;
    }
}
