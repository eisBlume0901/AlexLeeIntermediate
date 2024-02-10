package Encapsulation;
/* It is a powerful mechanism for storing the data members and data methods
of a class together. It is done in the form of a secure field accessible by
only the members of the same class.

Encapsulation is the process by which data (variables) and the code that acts
upon them (methods) are integrated as a single unit. By encapsulating a class's
variables, other classes cannot access them, and only the methods of the class can
access them.

Note: It is important to declare this class as private

Syntax:

<Access_Modifier> class <Class_name>
{
    private <Data_Members>;
    private <Data_Methods>;
}
 */
public class Student
{
    private String name; //This should be private
    private int age; //This should be private


    /* The static keyword belongs to a class rather than the object of a class.
    A constructor is called when an object of a class is created, so no use of the
    static constructor.

    Declaring static constructor means we cannot access/call the constructor from a subclass.
    Static means allowed within a class but not by a subclass.
     */

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setAge(int newAge)
    {
        this.age = newAge;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}
