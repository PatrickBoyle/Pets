
/**
 * Abstract pet class
 * 
 * @author Patrick Boyle
 * @version 3/7/17
 */
public abstract class Pet
{
    private String name;
    private int age;
    public Pet(String n, int a)
    {
        name = n;
        age = a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public abstract void makeNoise();
    public abstract void eat();
    public abstract void poop();
    public String toString()
    {
        return "Name: " + name + "\nAge: " + age;
    }
    
}
