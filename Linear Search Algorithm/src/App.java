public class App {
    public static void main(String[] args) throws Exception {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        int index = linearSearch(intArray, 7);

        System.out.println(linearSearch(intArray, 7));
        System.out.println(linearSearch(intArray, 1));
        System.out.println(linearSearch(intArray, 111111));
        System.out.println(linearSearch(intArray, -22));
    }

    private static int linearSearch(int[] intArray, int value) {

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == value){
                return i;
            }
        }
        return -1;
    }
}
