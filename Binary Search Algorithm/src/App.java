import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        Arrays.sort(intArray);

        // System.out.println(iterativeBinarySearch(intArray, 7));
        // System.out.println(iterativeBinarySearch(intArray, 1));
        // System.out.println(iterativeBinarySearch(intArray, 111111));
        // System.out.println(iterativeBinarySearch(intArray, -22));

        System.out.println(recursiveBinarySearch(intArray, 7));
        System.out.println(recursiveBinarySearch(intArray, 1));
        System.out.println(recursiveBinarySearch(intArray, 111111));
        System.out.println(recursiveBinarySearch(intArray, -22));
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    private static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end)
            return -1;

        int midpoint = (start + end) / 2;
        if (input[midpoint] == value) {
            return midpoint;
        } else if (input[midpoint] < value) {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        } else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }

    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            if (input[midpoint] == value) {
                return midpoint;
            } else if (input[midpoint] < value) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }
        return -1;
    }
}