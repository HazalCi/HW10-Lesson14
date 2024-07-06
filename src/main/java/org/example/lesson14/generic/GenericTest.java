package org.example.lesson14.generic;

public class GenericTest {
    public static void main(String[] args) {
        SingleGeneric<Integer> intExample = new SingleGeneric<>(9);
        intExample.printVariable();

        SingleGeneric<String> stringExample = new SingleGeneric<>("String Variable");
        stringExample.printVariable();

        SingleGeneric<Double> doubleExample = new SingleGeneric<>(2.85);
        doubleExample.printVariable();

        SingleGeneric<Boolean> booleanExample = new SingleGeneric<>(true);
        booleanExample.printVariable();

        DoubleGeneric<String, Integer> pair = new DoubleGeneric<>("Hazal", 27);
        pair.printVariables();
    }
}