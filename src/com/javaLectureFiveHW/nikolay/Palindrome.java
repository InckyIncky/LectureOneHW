package com.javaLectureFiveHW.nikolay;
import java.util.Scanner;


public class Palindrome {
    private String word1;

    Palindrome(String word1) {
        this.word1 = word1;
    }

    public String getWord1() {
        return word1;
    }

    public void setWord1(String word1) {
        this.word1 = word1;
    }


    public String createPalindrome(String word1) {

        char[] wordArray = word1.toCharArray();
        int i = 0;
        int j = wordArray.length - 1;

        while(i < j) {

            Character temp =
            wordArray[i++] = wordArray[i--];

        }

        String word2 = String.valueOf(wordArray);
        return word2;
    }



    public void isPalindrome() {

        char[] wordArray = word1.toCharArray();
        int i = 0;
        int j = wordArray.length - 1;

        while (i < j){
            if (wordArray[i++] == wordArray[j--]){
                continue;
            }else {
                System.out.println(word1 + " isn't palindrome");
                return;
            }
        }
        System.out.println(word1 + " is palindrome");
    }
}
