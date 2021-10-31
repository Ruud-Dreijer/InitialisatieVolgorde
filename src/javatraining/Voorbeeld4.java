package javatraining;

// uitgaande van voorbeeld3, met paar extra toevoegingen
public class Voorbeeld4 {
    static {
        add(2);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    Voorbeeld4() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static
    {
        new Voorbeeld4();
    }


    static                                                  // Extra tov voorbeeld 3
    {                                                       // Extra tov voorbeeld 3
        add (10);                                           // Extra tov voorbeeld 3
    }                                                       // Extra tov voorbeeld 3


    {
        add(8);
    }

    public static void main(String[] args) {       // nog moeilijker
        System.out.println();                               // Extra tov voorbeeld 3
        System.out.println("main - first");                 // Extra tov voorbeeld 3

        new Voorbeeld4();                                   // Extra tov voorbeeld 3

        System.out.println();                               // Extra tov voorbeeld 3
        System.out.println("main - second");                // Extra tov voorbeeld 3
    }
}
