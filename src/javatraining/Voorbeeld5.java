package javatraining;

public class Voorbeeld5 extends Voorbeeld4{
    static {
        add(20);
    }

    {
        add(30);
    }

    public Voorbeeld5() {
        add(40);
    }

    public static void main(String[] args) {       // moeilijkste
        new Voorbeeld5();
    }

}
