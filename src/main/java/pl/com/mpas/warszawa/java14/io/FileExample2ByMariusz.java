package pl.com.mpas.warszawa.java14.io;

import java.io.*;

public class FileExample2ByMariusz {

    public static void main(String[] args) {
        File maybeFile = new File("/home/maniek/spring.mv.db");
        System.out.println("file exist: " + maybeFile.exists());
        System.out.println("is directory: " + maybeFile.isDirectory());

        File existingOneOrNot = new File("c:\\dfafafa\\tafafsaf");
        System.out.println("existingOneOrNot: " + existingOneOrNot);
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader("/home/maniek/spring.mv.db");
            writer = new FileWriter("/home/maniek/spring.mv.db.copy");
            int readChar;
            while ((readChar = reader.read()) != -1) {
                System.out.println("readChar: " + readChar);
                writer.write(readChar);
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != writer) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}