package com.javaLectureFiveHW.nikolay;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatMatch {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("I'm using patten! Wow!", Pattern.CASE_INSENSITIVE);
        System.out.println(pattern);

        Pattern pattern1 = Pattern.compile(": | ;");
        String[] animals = pattern1.split("cat:dog;bird:cow");
        Arrays.asList(animals).forEach(animal -> System.out.println(animal + " "));

        String formatString = "Double var - %f, and string %s, and ineger %d";
        System.out.println(formatString);
        System.out.println(String.format(formatString, 5.5, "wome sord", 456));

        char [] alphabet = new char[26];
        for( int i = 0; i < alphabet.length; i++) {
           char a = (char) ( 'A' + i);
           alphabet[i] = a;
            System.out.println(alphabet[i] + " ");
        }

        String str = String.valueOf(alphabet[1]);
        String str2 = String.valueOf(alphabet[5]);
        String delimiter = ", ";
        String str3 = String.valueOf(alphabet[11]);

        System.out.println(String.join(delimiter, str, str2, str3));

        StringBuffer sBuf = new StringBuffer("mutable string!");
        System.out.println(sBuf);
        sBuf.append("append'im!");
        System.out.println(sBuf);
        sBuf.insert(sBuf.length() - 10, "()insert'im(!)");
        System.out.println(sBuf);
        sBuf.delete(5, 11);
        System.out.println(sBuf);
    }
}
