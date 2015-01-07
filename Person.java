import java.util.ArrayList;
/**
 * Person class.
 */
public class Person
{
    // The name of the person.
    private String name;
    // The age of the person.
    private int age;
    // Person's father.
    private Person father;
    // Person's Mother.
    private Person mother;
    // Person's children/s.
    private ArrayList<Person> children;
    
    /**
     * Person's constructor, which you can set the person's name and age.
     */
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    /**
     * Prints the person's name and age.
     */
    public void showData()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    /**
     * Sets the person's father.
     */
    public void setFather(Person father)
    {
        this.father = father;        
    }
    
    /**
     * Sets the person's mother.
     */
    public void setMother(Person mother)
    {
        this.mother = mother;
    }
    
    /**
     * Sets the person's child/s.
     */
    public void addChild(Person child)
    {
        children.add(child);
    }
 
}