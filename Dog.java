
/**
 * Extends Pet class
 * 
 * @author Patrick Boyle 
 * @version 3/9/2017
 */
public class Dog extends Pet
{
    private Boolean goodDog;
    public Dog(String n, int a, Boolean g)
    {
        super(n, a);
        goodDog = g;
    }
    public Boolean getGoodDog()
    {
        return goodDog;
    }
    public void setGoodDog(Boolean g)
    {
        goodDog = g;
    }
    public void makeNoise()
    {
        System.out.println("I am barking");
    }
    public void eat()
    {
        System.out.println("I am eating dog food");
    }
    public void poop()
    {
        System.out.println("I am pooping in the yard");
    }
    public String toString()
    {
        return super.toString() + "\nGood Boy: " + goodDog;
    }
}
