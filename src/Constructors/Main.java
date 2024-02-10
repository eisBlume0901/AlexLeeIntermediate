package Constructors;
/* Constructor is similar to a method that is invoked when an object of the
class is created. There are 3 types of constructor:
No-Arg Constructor: does not accept any parameters
Parameterized Constructor: constructor with parameters
Default Constructor: if we do not create any constructor, the Java compiler
automatically create a no-arg constructor during the execution of the program.
 */
public class Main {
    public static void main(String[] args)
    {
        //Shirt.putOn();
        /* Static member 'Constructors.Shirt.putOn()' accessed via instance reference.
        There is no point in accessing a static member from an instance reference but there is any actual
        problems with doing this if you have already an instance reference.

        Instead of using,
        Shirt s = new Shirt(); - Default constructor. Since we do not have a constructor, it had a
        weak warning error.
        s.putOn(); - This is a instance reference

        You can use,
        Shirt.putOn(); - You do not need to put the instance variable

        It makes more sense a "Class" is a "factory" that makes "objects"(instance).

        Static properties or members and methods are services that the Class provides that can be
        accessed from anywhere outside the Class, without having to instantiate an object from that class.
        For the sake of good object-oriented design, it is recommended that static members are accessed
        via ClassName only, and not via instance.
         */

        //Shirt s = new Shirt();
        //s.putOn();
        /* Output is:
        inside constructor
        Shirt is on!
         */

        //s.setColor("Blue");
        //s.setSize('M');

        //System.out.println(s.color); //Output is Blue
        //System.out.println(s.size); //Output is M

        /* Creating a lot of object is tedious; therefore, create a constructor.

        In my own understanding, constructor sets the attributes whereas methods allows to make actions for
        the attributes.
         */

        //Using a constructor
        Shirt odettePurchase = new Shirt("white",'M');
        System.out.println(odettePurchase.color); //white
        System.out.println(odettePurchase.size); //M
    }
}
