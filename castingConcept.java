package com.javaTutorials;

public class castingConcept {

    public static void main(String[] args) {
        // casting
        double price = 100.0;
        double finalPrice = price + 18;  // implicit casting

        System.out.println(finalPrice);


        int p = 100;
        int fp = p + (int)18.0;     // Explicit casting

        System.out.println(fp);

    }
}
