package OOP;

import OOP.Headphones;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pen p = new Pen();
        //Attributes of the OOP.Pen
        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);

        /*For methods, always use the name of the class than the assigned
        variable. */
        System.out.println(Pen.clicked);

        Pen.click();

        System.out.println(Pen.clicked);

        System.out.println();


        Headphones h = new Headphones();
        //Attributes of the headphones
        System.out.println(h.charge);
        System.out.println(Arrays.toString(h.controls));
        System.out.println(h.color);
        //Features and how the features of a headphone
        System.out.println(Headphones.power); //It will print false.
        //After calling the object and its method,
        Headphones.powerOn();
        System.out.println(Headphones.power); //It will print true.

        System.out.println(Headphones.volume); //It will print 0.
        Headphones.volumeUp();
        System.out.println(Headphones.volume); //It will print 1 since the volume increased by 1
        Headphones.volumeUp();
        System.out.println(Headphones.volume); //It will print 2 since the volume increased by 1
        Headphones.volumeDown();
        System.out.println(Headphones.volume); //It will print 1 since the volume decreased by 1.



    }
}