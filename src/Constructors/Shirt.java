package Constructors;

public class Shirt
{
    String color;
    /* putting a static keyword means it belongs to the class rather than a specific instance.
    You do not need to instantiate an object. Just simply use the constructor variableName
     */
    char size;

    //This is a constructor
    public Shirt(String newColor, char newSize)
    {
        color = newColor;
        size = newSize;
    }
    //This is a method
    public static void putOn()
    {
        System.out.println("Shirt is on!");
    }

    //This is a method
    public static void takeOff()
    {
        System.out.println("Shirt is off!");
    }

    //This is a setter; however, you have to declare the field as static.
    //public static void setColor(String newColor)
    //{
    //    color = newColor;
    //}

    //This is a setter; however, you have to declare the field as static.
    //public static void setSize(char newSize)
    //{
    //    size = newSize;
    //}
}
