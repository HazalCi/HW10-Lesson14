package org.example.lesson14.streamapi;
import java.util.Arrays;
import java.util.OptionalInt;

public class FindingElement {
    public static int findElement(int[] array, int element) {
        OptionalInt result = Arrays.stream(array)
                .filter(x -> x == element)
                .findFirst();
        return result.isPresent() ? result.getAsInt() : -1;
    }
}
