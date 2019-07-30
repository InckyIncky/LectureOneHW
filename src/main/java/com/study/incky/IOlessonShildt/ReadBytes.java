package com.study.incky.IOlessonShildt;
import java.io.*;

public class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];
        System.out.println("Input chars: ");
        System.in.read(data);
        System.out.print("You entered: ");
        for(byte a : data) {
            System.out.println((char) a);
        }
        int b;
        b = 'S';
        System.out.write(b);
        System.out.write('\n');
//        String a = "C:\\Users\\nantonov\\Downloads\\file.html";
//        FileInputStream(String a) throws FileNotFoundException;
    }

}
