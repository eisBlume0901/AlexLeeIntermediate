package Encapsulation;

public class Main
{
    public static void main(String[] args)
    {
        /*
        Student s = new Student();
        System.out.println(s.name); //Output is null since there is no value declared yet.
        System.out.println(s.age); //Output is 0 since there is no value declared yet.
        //Not good practice
        s.name = "Mary Odette";
        s.age = 19;
        System.out.println(s.name); //Output is Mary Odette
        System.out.println(s.age); //Output is 19
        */

        /* Student m = new Student();
        m.setName("Maria");
        m.setAge(20);

        System.out.println(m.name); //Output is Maria
        System.out.println(m.age); //Output is 19

        There is an error since the variables were declared as private, meaning
        it is not available for the user.
         */

        Student odette = new Student();
        odette.setName("Mary Odette F. Anecito");
        odette.setAge(19);

        System.out.println(odette.getName()); //Output would be Mary Odette F. Anecito
        //getter is public and can access the private declared variables
        System.out.println(odette.getAge()); //Output would be 19
    }
}
