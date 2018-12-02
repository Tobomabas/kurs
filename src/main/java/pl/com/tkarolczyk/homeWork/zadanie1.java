package pl.com.tkarolczyk.homeWork;

public class zadanie1 {

    public static int nww(int a, int b) {
        int min; // większa z dwóch liczb - najmniejsza wspólna wielokrotność nie może być mniejsza od większej z podanych liczb
        int max; // iloczyn podanych liczb - w najgorszym przypadku nww może być maksymalnie tą liczbą

        if (a < b) {
            min = b;
        } else {
            min = a;
        }

        max = a * b;


        // pętla sprawdza czy i, które początkowo ma wartość 'min' dzieli obie wprowadzone liczby bez reszty, jeżeli tak, zwraca i.
        // jeżeli pętla skończy się, zwrócony zostaje iloczyn wprowadzonych liczb
        for (int i = min; i < max; i++) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(nww(15, 23));
    }

}

