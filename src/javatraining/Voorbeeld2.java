package javatraining;

public class Voorbeeld2 {
    private String name = "Torchie";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static
    {
        System.out.println(COUNT);
    }

    {
        COUNT++;
        System.out.println(COUNT);
    }

    public Voorbeeld2() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {    // Wat lastiger
        System.out.println("main - first");
        new Voorbeeld2();
        System.out.println("main - second");
    }
}
