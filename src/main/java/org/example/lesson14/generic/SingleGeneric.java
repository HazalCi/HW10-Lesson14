package org.example.lesson14.generic;

public class SingleGeneric<T> {
    private T variable;

    public SingleGeneric(T variable) {
        this.variable = variable;
    }

    public T getVariable() {
        return variable;
    }

    public void setVariable(T variable) {
        this.variable = variable;
    }

    public void printVariable() {
        System.out.println("Variable Content: " + variable);
    }
}
