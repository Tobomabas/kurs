package pl.com.tkarolczyk.io;

import java.io.*;
import java.util.Scanner;

public class FileExample {

    private int readChar;

    public static void main(String[] args) throws IOException {
        File maybeFile = new File("c:\\tomek\\test.txt");
        System.out.println("File exist " + maybeFile.exists());
        System.out.println("Directory: " + maybeFile.isDirectory());
        System.out.println("");

        Reader reader = null;

            reader = new FileReader("c:\\tomek\\test.txt");


            int readChar = reader.read();























//        try {
//            Reader reader = new FileReader("\\");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    }

}
