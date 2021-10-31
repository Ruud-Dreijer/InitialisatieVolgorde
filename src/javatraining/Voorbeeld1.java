package javatraining;

public class Voorbeeld1 {
    private String name = "Torchie";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static
    {
        System.out.println(COUNT);
    }

    static
    {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public Voorbeeld1() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {    // Simpel
        new Voorbeeld1();
    }
}

