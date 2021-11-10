package com.javaTutorials;

public class logicalOperator_Concept {
    public static void main(String[] args) {
        // Logical operator
        // &&
        int a = 30;
        int b = 40;
        if (a < 50 && b < 50)
            System.out.println("Both less then 50");

        // !! (Logical or)
        if(a < 50 && b < 50)
            System.out.println("At least one less than 50");

        // ! (not)
        boolean isAdult = true;
        if (isAdult == true)
            System.out.println("isAdult");
        else
            System.out.println("Not adult");


    }
}
