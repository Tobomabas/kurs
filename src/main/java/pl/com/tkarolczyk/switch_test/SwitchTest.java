package pl.com.tkarolczyk.switch_test;
import pl.com.tkarolczyk.enum_example.Months;



public class SwitchTest {



    public static int changeInt(int a){
        a=a+a;
        return a;
    };




    public static void checkMarkWithSwitch(int mark) {
        switch (mark) {
            case 6:
            case 5:
                System.out.println("nice nice");
//                break;
            case 4:
            case 3:
                System.out.println("not bad");
                break;
            case 2:
            case 1:
                System.out.println("u failed !");
                break;
//
        }
    }
    public static void daysInMonth(Months month){

     switch(month)
     {
         case APRIL:
         case JULY:
         case JANUARY:
         case FEBRUARY:
         case MARCH:
         case MAY:
         case JUNE:
         case AUGUST:


             System.out.println(month.getDaysInMonth());
             break;

     }

    }


    public static void main(String[] args) {

        final int a = 5;
        changeInt(a);
        System.out.println("a after method " + a);

        daysInMonth(Months.MAY);



//        final int a = 5;
//        final StringBuilder builder = new StringBuilder();
//        builder.append(1);
//        builder.append(2);





//    }
//
//    public static void checkMark (int mark) {
//
//        if (mark == 6 || mark == 5) {
//            System.out.println("Pieknie");
//        }
//        else if (mark == 4 || mark == 3) {
//            System.out.println("moze byc");
//        } else {
//            System.out.println("siadaj !!!!! !");
//        }
//    }
//
//




    }

}
