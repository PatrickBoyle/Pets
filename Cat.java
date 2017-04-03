
/**
 * Pet Subclass
 * 
 * @author Patrick Boyle
 * @version 3/7/17
 */
public class Cat extends Pet
{
    private Boolean declawed;
    public Cat(String n, int a, Boolean d)
    {
        super(n, a);
        declawed = d;
    }
    public Boolean getDeclawed()
    {
        return declawed;
    }
    public void setDeclawed(Boolean d)
    {
        declawed = d;
    }
    public void makeNoise()
    {
        System.out.println("I am meowing");
    }
    public void eat()
    {
        System.out.println("I am eating cat food");
    }
    public void poop()
    {
        System.out.println("I am pooping in my litter box");
    }
    public String toString()
    {
        return super.toString() + "\nDeclawed: " + declawed;
    }
    
}