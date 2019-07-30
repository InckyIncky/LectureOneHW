package com.study.incky.IOlessonShildt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ShowFile {
    public static void main(String[] args) {

        int i;
        FileInputStream fin;

        if (args.length != 1) {
            System.out.println("Use of: ShowFile file_name");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException fne) {
            System.out.println("File not found");
            return;
        }

        try {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {


            try {
                fin.close();
            } catch (IOException ioe) {
                System.out.println("error while closing");
            }
        }
    }
}
