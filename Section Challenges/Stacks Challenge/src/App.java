import java.io.StringBufferInputStream;
import java.util.LinkedList;

import org.graalvm.compiler.core.common.util.ReversedList;

public class App {
    public static void main(String[] args) throws Exception {
        // // should return true
        // System.out.println(checkForPalindrome("abccba"));
        // // should return true
        // System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // // should return true
        // System.out.println(checkForPalindrome("I did, did I?"));
        // // should return false
        // System.out.println(checkForPalindrome("hello"));
        // // should return true
        // System.out.println(checkForPalindrome("Don't nod"));

        // should return true
        System.out.println(exampleCheckForPalindrome("abccba"));
        // should return true
        System.out.println(exampleCheckForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(exampleCheckForPalindrome("I did, did I?"));
        // should return false
        System.out.println(exampleCheckForPalindrome("hello"));
        // should return true
        System.out.println(exampleCheckForPalindrome("Don't nod"));
    }

    public static boolean exampleCheckForPalindrome(String string) {
        // This is how she did it in the video

        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }
        StringBuilder reverseString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }

        return reverseString.toString().equals(stringNoPunctuation.toString());
    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<>();

        // strip non-letter characters
        String strippedString = stripString(string);

        // Add half to stack
        for (int i = 0; i < strippedString.length() / 2; i++) {
            stack.push(strippedString.toCharArray()[i]);
        }

        // test palindrome
        boolean isPalindrome = true;
        for (int i = strippedString.length() - (strippedString.length() / 2); i < strippedString.length(); i++) {
            if (strippedString.toCharArray()[i] != stack.pop()) {
                isPalindrome = false;
            }
        }

        return isPalindrome;
    }

    private static String stripString(String string) {
        String newString = "";
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            char character = string.toCharArray()[i];
            if ((int) character > 96 && (int) character < 123) {
                newString += character;
            }
        }
        return newString;
    }
}
