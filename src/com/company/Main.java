/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your input string? ");
        String inString = input.nextLine();

        System.out.printf("%s has length of %d.", inString, inString.length());
    }
}
