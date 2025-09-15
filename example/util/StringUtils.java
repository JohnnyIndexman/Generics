package example.util;


public class StringUtils {

    // Check if a string is palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
