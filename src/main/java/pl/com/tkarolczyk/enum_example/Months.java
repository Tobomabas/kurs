package pl.com.tkarolczyk.enum_example;

public enum Months {
    JANUARY (30, 25),
    FEBRUARY(28, 22),
    MARCH(31, 25),
    APRIL(30, 25),
    MAY(31, 56),
    JUNE(30, 56),
    JULY(31, 85),
    AUGUST(31, 96),
    SEPTEMBER(30, 78);

    private int daysInMonth;
    private int sssss;
    Months (int daysInMonth, int sssss){

        this.daysInMonth = daysInMonth;
        this.sssss = sssss;

    }


    public int getDaysInMonth() {
        return daysInMonth;
    }
}

