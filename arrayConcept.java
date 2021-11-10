package com.javaTutorials;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayConcept {
    public static void main(String[] args) {
        // Array in java

        // normal variable
        int age = 30;
        int physics = 97;
        int chem = 98;
        int eng = 95;

//        // define a array in java
//        int[] marks = new int[3];
//        marks[0] = 97;
//        marks[1] = 99;
//        marks[2] = 95;

        // length
        // System.out.println(marks.length);

        // sort
//        Arrays.sort(marks);
//        System.out.println(marks[0]);

        // single dimention
        int[] marks = {97, 95, 98};

        // multi demention
        int[][] finalMarks = {{97, 98, 99}, {91, 92, 93}};
        System.out.println(finalMarks[0][2]);
    }
}
