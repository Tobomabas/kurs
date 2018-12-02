package pl.com.tkarolczyk.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindNumbers {


    public static void main(String[] args) {




        Random random = new Random();

        List<Integer> tms = new ArrayList<>();
        for (int i = 0; i <= 1000; i++) {

            tms.add(random.nextInt(101));
        }
//        for (Integer list : tms) {
//            if (list != 51) {
//                System.out.println("i: " + list);
//            } else {
//                System.out.println(list);
//                break;
//            }
//        }
        int indexOF51 = -1;
        for (int i = 0; i < tms.size(); i++) {
            if (tms.get(i) == 51) {
                indexOF51 = i;
                break;
            }
        }
        System.out.println("index of 51: " + indexOF51);
    }
}
