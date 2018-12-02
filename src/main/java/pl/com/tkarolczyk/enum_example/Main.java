package pl.com.tkarolczyk.enum_example;

public class Main {
    public static void main(String[] args) {
//        Seasons maybeSummer = Seasons.SUMMER;
//        System.out.println(maybeSummer.name());
//        maybeSummer = Seasons.AUTOMN;
//        System.out.println(maybeSummer.name());
//
//        System.out.println(maybeSummer.ordinal());

        for(Months miesiac : Months.values()) {

            System.out.println(miesiac + " " + miesiac.getDaysInMonth());
        }
        System.out.println("//////////////");
        for(Subject przedmiot : Subject.values()) {

            System.out.println(przedmiot + " " + przedmiot.getHours());
        }

    }
}
