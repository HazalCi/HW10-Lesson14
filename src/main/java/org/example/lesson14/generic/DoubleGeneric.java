package org.example.lesson14.generic;

public class DoubleGeneric<H,C> {
    private H variable1;
    private C variable2;

    public DoubleGeneric(H variable1, C variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }
    public H getVariable1() {
        return variable1;
    }
    public void setVariable1(H variable1) {
        this.variable1 = variable1;
    }
    public C getVariable2() {
        return variable2;
    }
    public void setVariable2(C variable2) {
        this.variable2 = variable2;
    }
    public void printVariables() {
        System.out.println("Output: " + variable1 + " " + variable2);
    }
}
