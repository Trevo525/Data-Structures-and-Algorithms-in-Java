public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i <= 10; i++) {
            callFactorials(i);
        }
        // callFactorials(6);
    }

    private static void callFactorials(int i) {
        System.out.println(i + "! = " + recursiveFactorial(i));
        System.out.println(i + "! = " + iterativeFactorial(i));
    }

    // 1! = 0! * 1 = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!

    // n! = n * (n - 1)!
    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }

    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

}
