package com.javaTutorials;

public class StringConcept {
    public static void main(String[] args) {
        // Strings
        String name1 = "Darshan ";
        String name2 = "Vidhi ";
        String name3 = name1 + name2;
        System.out.println(name3);

        // character position
        System.out.println("step of string is " + name1.charAt(0));

        // replace
        String nameFirst = "Aman";
        String newName = nameFirst.replace("A", "B");
        System.out.println(newName);
        System.out.println(nameFirst);

    }
}
