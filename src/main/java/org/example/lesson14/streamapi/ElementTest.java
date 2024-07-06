package org.example.lesson14.streamapi;
import static org.example.lesson14.streamapi.FindingElement.findElement;

public class ElementTest {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        int element = 3;
        int result = findElement(numbers, element);
        System.out.println("Result: " + result);
        element = 6;
        result = findElement(numbers, element);
        System.out.println("Result: " + result);
    }
}
