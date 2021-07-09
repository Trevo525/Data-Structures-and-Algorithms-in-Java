import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.add(c);
                stack.push(c);
            }
        }

        StringBuilder reverseString = new StringBuilder(stack.size());
        StringBuilder normalString = new StringBuilder(queue.size());
        while (!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }
        while (!queue.isEmpty()) {
            normalString.append(queue.removeFirst());
        }

        return reverseString.toString().equals(normalString.toString());
    }
}
