package Inheritance;

public class Main
{
    public static void main(String[] args)
    {
        Mouse1 m1 = new Mouse1();

        System.out.println(m1.texture);
        m1.setColor("Blue");
        m1.leftClick();
        m1.rightClick();
        m1.scrollUp();
        m1.scrollDown();

        System.out.println();

        Mouse2 m2 = new Mouse2();
        m2.connect();
        m2.leftClick();
        m2.rightClick();
        m2.scrollUp();
        m2.scrollDown();

        System.out.println();

        Mouse3 m3 = new Mouse3();
        System.out.println(m3.ambidextrous);
        m3.leftClick();
        m3.rightClick();
        m3.scrollUp();
        m3.scrollDown();
    }
}
