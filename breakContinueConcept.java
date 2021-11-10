package com.javaTutorials;

public class breakContinueConcept {
    public static void main(String[] args) {
        // Break and Continue

        int i = 0;
        while (true) {
            if(i == 3) {
                i = i + 1;
                continue;
            }
            System.out.println(i);
            i = i + 1;
            if (i > 5) {
                break;
            }

        }
    }
}
