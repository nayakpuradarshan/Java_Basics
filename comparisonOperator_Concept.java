package com.javaTutorials;

import java.util.Scanner;

class comparisonOperator_Concept {
    public static void main(String[] args) {
        // Competition Operator
        // a == b
        // a != b
        // a < b
        // a > b
        // a <= b
        // a >= b


        // Conditional Statement
        boolean isSunUp = true;
        if (isSunUp == true)
            System.out.println("Yes");
        else
            System.out.println("NO");

        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        // condition
        if (age > 18)
            System.out.println("can vote!");
        else
            System.out.println("can't vote!");


    }
}
