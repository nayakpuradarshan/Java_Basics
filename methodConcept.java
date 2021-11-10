package com.javaTutorials;

public class methodConcept {
    // method / function
    public static void printjava() {
        System.out.println("Hello java");
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // Methods
//        System.out.println("Hello java!");
//        System.out.println("Hello java!");
//        System.out.println("Hello java!");

        // calling function / method
        printjava();
        printjava();
        printjava();

        printSum(5, 9);

    }
}
