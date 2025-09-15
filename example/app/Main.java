package example.app;

import example.model.GenericCounter;
import example.model.NumberUtils;
import example.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 11, 13, 15, 22);
        List<String> words = Arrays.asList("madam", "racecar", "hello", "world", "level");

        long oddCount = GenericCounter.countByProperty(numbers, n -> n % 2 != 0);
        long primeCount = GenericCounter.countByProperty(numbers, NumberUtils::isPrime);
        long palindromeCount = GenericCounter.countByProperty(words, StringUtils::isPalindrome);

        System.out.println("Odd numbers count: " + oddCount);
        System.out.println("Prime numbers count: " + primeCount);
        System.out.println("Palindrome words count: " + palindromeCount);
    }
}
