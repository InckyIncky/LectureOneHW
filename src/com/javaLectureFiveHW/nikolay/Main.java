package com.javaLectureFiveHW.nikolay;

import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Palindrome ara = new Palindrome("ara");

        String word1 = ara.getWord1();
        String a = "кабак";
        String b = "шабаш";

        a.compareToIgnoreCase(b);
/*
Варианты добавить валидацию чисел - CHARACTER isDigit или isLetter

 */

        ara.isPalindrome();

        System.out.println("A cicle started, please, enter \"quit\" to quit");
        Scanner in = new Scanner(System.in);

        for (; ; )
            begin:{

                System.out.println("Please, type your word, to check if it's a palindrome: ");

                String word = in.next();


                if (word.equals("quit")) {
                    return;
                } else {

                    ara.setWord1(word);

                    word1 = ara.getWord1();

                    ara.isPalindrome();
                    break begin;
                }

            }
    }
}

