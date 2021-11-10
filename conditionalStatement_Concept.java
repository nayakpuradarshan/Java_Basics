package com.javaTutorials;

public class conditionalStatement_Concept {
    public static void main(String[] args) {
        // Conditional statement
        int day = 1; // 1 - Monday

        switch (day) {
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            default:
                System.out.println("wed - sun");

        }
    }
}
