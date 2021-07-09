import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        // sort
        // Arrays.sort(intArray);
        Arrays.parallelSort(intArray);

        // print sorted array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
