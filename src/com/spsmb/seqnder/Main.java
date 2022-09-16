package com.spsmb.seqnder;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       run();
    }

    static void run() {
        String[] userInput = getInput();
        findSeq(userInput);
    }

    static String[] getInput() {
        System.out.println("Enter phrase: ");
        String phrase = sc.nextLine();
        System.out.println("Enter sequence: ");
        String seq = sc.nextLine();
        return new String[]{phrase, seq};
    }

    static void findSeq(String[] userInput) {
        Pattern pattern = Pattern.compile(userInput[1]);
        Matcher matcher = pattern.matcher(userInput[0]);

        int count = 0;
        while (matcher.find())
            count++;

        System.out.println(userInput[1] + " in " + userInput[0] + "\n was found " + count + " times.");
    }
}