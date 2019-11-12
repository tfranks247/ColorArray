package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here



        ArrayList<String> colors = new ArrayList<String>();

        colors.add("blue");
        colors.add("red");
        colors.add("green");

        System.out.println(colors.get(1));

        while (true) {

            System.out.println("Add a color");
            Scanner key = new Scanner(System.in);
            String c;
            c = key.next();
            colors.add(key.next());

            System.out.println("Keep adding colors and type quit when your done");
            
            String input = key.next();
            if (input.equalsIgnoreCase("quit")){
                break;
            }
        }
        System.out.println(colors);
    }
}

//        Write a Java program to create a new array list to hold colors.
//        Add at least 3 colors (string) to the array list and print out all its values.
//        Using the array list created above, print out the value at index 1.
//        Using the array list above, prompt the user for one new color, and add that color to the array list.
//        Using the array list, continue prompting the user for colors until they type in "Q" or "q" to quit. Each time the user enters a color, add that to the array list.
//        Print out the list at the end.