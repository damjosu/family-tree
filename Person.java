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
        children = new ArrayList<>();
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

    /**
     * Gets the person's name.
     */
    private String getName()
    {
        return name;
    }

    /**
     * Gets the person's age.
     */
    private int getAge()
    {
        return age;
    }

    /**
     * Shows the parents' names and ages. 
     */    
    public void showParentsData()
    {
        System.out.println("Father's name: " + father.getName() + "\n" + "Father's age: " + father.getAge());
        System.out.println("Mother's name: " + mother.getName() + "\n" + "Mother's age: " + mother.getAge());
    }

    /**
     * Shows children's names and ages.
     */
    public void showChildrenData()
    {
        for(Person child: children)
        {
            System.out.println("Child's name: " + child.getName() + "\n" + "Child's age: " + child.getAge());
        }
    }

    /**
     * If the person has children returns true, false otherwise.
     */
    public boolean hasChildren()
    {
        boolean gotChildren = false;
        if (children.size() > 0)
        {
            gotChildren = true;
        }  
        return gotChildren;
    }

    /**
     * Returns the number of children the person has.
     */
    public int getNumberOfChildren()
    {
        int childrenNumber = children.size();
        return childrenNumber;
    }

    /**
     * If the person has brother returns true, false otherwise.
     */
    public boolean hasBrothers()
    {
        boolean brothers = false;
        if (father != null)        
        {
            int childrenNumber = father.getNumberOfChildren();
            if (childrenNumber > 1)
            {
                brothers = true;
            }
        }
        
        if (mother != null)        
        {
            int childrenNumber = mother.getNumberOfChildren();
            if (childrenNumber > 1)
            {
                brothers = true;
            }
        }
        return brothers; 
    }
}