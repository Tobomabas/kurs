package pl.com.tkarolczyk.BufferReaderTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReaderTest {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner tms = new Scanner(System.in);
        String value1;
        value1 = br.readLine();

        System.out.println(value1.length());
        System.out.println(value1);

    }
}
