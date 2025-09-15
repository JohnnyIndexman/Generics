# Generic Counter in Java

This project demonstrates how to create a generic method in Java that counts the number of elements in a collection satisfying a given property (e.g., odd numbers, prime numbers, palindromes).

# Project Structure
``` src/
      └── example/
           ├── util/
           │    ├── GenericCounter.java   # Generic counter utility
           │    └── NumberUtils.java      # Number-related utilities (prime check)
           │
           ├── model/
           │    └── StringUtils.java      # String-related utilities (palindrome check)
           │
           └── app/
                └── Main.java             # Entry point of the program
 ```
 
# Features

Generic method countByProperty that works with any collection type.

Utility methods:

isPrime(Integer n) → checks if a number is prime.

isPalindrome(String str) → checks if a string is a palindrome.

# How to Compile & Run

Open a terminal in the src folder.

Compile the project:
``` javac example/**/**/*.java```

Example usage with integers and strings.

# Run the program:
```java example.app.Main```

# Example Output
Odd numbers count: 5
Prime numbers count: 4
Palindrome words count: 3

# Concepts Covered

Generics in Java

Functional interfaces (Predicate<T>)

Streams API (filter, count)

Code organization using packages
