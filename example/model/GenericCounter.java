package example.model;

import java.util.Collection;
import java.util.function.Predicate;

public class GenericCounter {

    // Generic method to count elements that satisfy a given condition
    public static <T> long countByProperty(Collection<T> collection, Predicate<T> condition) {
        return collection.stream()
                         .filter(condition)
                         .count();
    }
}