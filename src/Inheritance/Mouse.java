package Inheritance;

public class Mouse
{
    public void leftClick()
    {
        System.out.println("Click!");
    }
    /* It should not be public static void leftClick() because it will give
    a yellow warning of Static member 'Inheritance.Mouse1.leftClick() accessed via instance reference.
     */

    public void rightClick()
    {
        System.out.println("Click!");
    }

    public void scrollUp()
    {
        System.out.println("Scrolled up!");
    }

    public void scrollDown()
    {
        System.out.println("Scrolled down!");
    }
}
