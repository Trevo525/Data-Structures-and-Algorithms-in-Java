package academy.learnprogramming.challenge1;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        // splitting phase
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);

        // merging phase
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {

        /* 
        * To flip from ascending to descending order two operators 
        * must be changed as commented below
        */
        if (input[mid - 1] >= input[mid]) {// Here. <= for ascending >= for descending
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];// Here. <= for ascending >= for descending
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

}