package com.javaTutorials;

import java.util.Scanner;

public class user_inputConcept {
    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name here : ");
        String name = sc.nextLine();
        System.out.println(name);

    }
}
