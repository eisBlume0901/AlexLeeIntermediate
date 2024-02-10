package Polymorphism;
/* Polymorphism means the ability of an object to take many forms.

 */
//This is a wrong example since Robin and Pelicans does not sing with the same sound.
class Bird
{
    public void sing()
    {
        System.out.println("tweet tweet tweet");
    }
}

class Robin extends Bird
{
    public void sing()
    {
        System.out.println("twiddledeedee");
    }
}

class Pelican extends Bird
{
    public void sing()
    {
        System.out.println("Kwaah Kwahah Kwaha");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Bird b = new Bird();
        b.sing();

        Robin r = new Robin(); //Output would be twiddledeedee instead of tweet tweet tweet
        r.sing();

        Pelican p = new Pelican(); //Output would be Kwaah Kwahah Kwaha instead of tweet tweet tweet.
        p.sing();
    }
}
