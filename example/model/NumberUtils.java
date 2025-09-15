package example.model;

public class NumberUtils {

    // Check if a number is prime
    public static boolean isPrime(Integer num) {
        if (num == null || num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}