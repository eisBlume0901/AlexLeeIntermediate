package Enumeration;
enum Level
{
    LOW, MEDIUM, HIGH;
}
public class EnumS
{
    enum Flavor
    {
        VANILLA, STRAWBERRY, CHOCOLATE;

        public static void getVanilla()
        {
            System.out.println(Flavor.VANILLA);
        }
    }
    String[] levels = {"Low", "Medium", "High"};
    public static void main(String[] args)
    {
        EnumS e = new EnumS();
        System.out.println(e.levels[0]); //Low
        System.out.println(e.levels[1]); //Medium
        System.out.println(e.levels[2]); //High

        Level l = Level.LOW;
        System.out.println(Level.HIGH); //HIGH
        System.out.println(l); //LOW

        switch(l)
        {
            case LOW:
                //this will print since l is LOW
                System.out.println("Easy mode");
                break;
            case MEDIUM:
                System.out.println("Average mode");
                break;
            case HIGH:
                System.out.println("Difficult mode");
        }

        Flavor hatedFlavor = Flavor.CHOCOLATE;
        System.out.println(hatedFlavor);

        Flavor favoriteFlavor = Flavor.STRAWBERRY;

        if (hatedFlavor == Flavor.CHOCOLATE)
        {
            //This will be the output since hatedFlavor is set to CHOCOLATE
            System.out.println("I hate chocolate flavored ice-cream");
        }

        if (favoriteFlavor == Flavor.STRAWBERRY)
        {
            //This will be the output since the favoriteFlavor is set to STRAWBERRY
            System.out.println("I love strawberry flavored ice-cream");
        }

        Flavor.getVanilla(); //Output would be VANILLA
    }
}
