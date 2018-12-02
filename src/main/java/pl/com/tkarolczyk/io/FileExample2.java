package pl.com.tkarolczyk.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileExample2 {


    public static void main(String[] args)  {

        try {
            Reader reader = new FileReader("c:\\tomek\\logo.JPG");
            int readChar;
            int i = 0;
            List<Integer> integers = new ArrayList<>();
            while ((readChar = reader.read()) != -1) {


                integers.add(i, readChar);
                i++;
            }
            Writer writer = new FileWriter(new File("c:\\tomek\\logo2.JPG"));
            for (int d : integers){
                writer.write(d);
//                writer.flush();
            }
            writer.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
