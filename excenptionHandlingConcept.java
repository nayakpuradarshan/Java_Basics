package com.javaTutorials;

public class excenptionHandlingConcept {
    public static void main(String[] args) {
        // Exception Handling
        int[] marks = {97, 98, 95};
        try {
            System.out.println(marks[5]);
        } catch (Exception exception) {
            // do something after cathing
        }

        System.out.println("The student name is Darshan");

    }
}
