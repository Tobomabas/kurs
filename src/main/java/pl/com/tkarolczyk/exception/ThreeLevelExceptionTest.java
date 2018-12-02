package pl.com.tkarolczyk.exception;

public class ThreeLevelExceptionTest {
    static int counter = 0;

    public static void main(String[] args) throws MyException {
        System.out.println("sout from main");
        level1();
        System.out.println("Main before END ! ");
    }

    public static int level1() throws MyException {
        System.out.println("sout from leve11");
        try {
            level2();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("here was ");
        }
        return 1;
    }

    public static int level2() throws MyException {
        System.out.println("sout from leve2");
        try {
            level3();
            System.out.println("level2 - after call to level 3");
        }

        catch(MyNewException e) {
            e.printStackTrace();
        }
        catch(MyException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("level 2 before return");
        return 2;
    }

    public static int level3() throws MyException, MyNewException {
        System.out.println("sout from leve3");
        if (counter % 2 == 1) {
            throw new MyException("Problem on level 3");

        } else if (counter == 4) {
            throw new MyNewException("My New Exception ");
        }


        System.out.println("sout int level 3 before return");
        return 3;
    }

    //LIFO - Last In First Out
    //FIFO - Firt In First Out

}
