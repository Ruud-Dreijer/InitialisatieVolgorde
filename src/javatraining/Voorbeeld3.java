package javatraining;

public class Voorbeeld3 {
    static {
        add(2);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    Voorbeeld3() {
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
        new Voorbeeld3();
    }

    {
        add(8);
    }

    public static void main(String[] args) { }      // moeilijk
}
