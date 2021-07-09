import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int[] intArray = { 54, 46, 83, 66, 95, 92, 43 };

        bucketSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    private static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            // using ArrayLists for the buckets
            buckets[i] = new ArrayList<Integer>();
            // using LinkedLists for the buckets
            // buckets[i] = new LinkedList<Integer>();
        }

        // scattering phase
        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        // sort into buckets
        for (List bucket: buckets){
            Collections.sort(bucket);
        }
        
        // gathering phase
        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value: buckets[i]){
                input[j++] = value;
            }
        }
    }

    private static int hash(int value) {
        return value / (int) 10;
    }
}
