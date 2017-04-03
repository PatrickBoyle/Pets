
/**
 * Extends Dog quotes So Crates
 * 
 * @author Patrick Boyle
 * @version 3/9/17
 */
public class GeniusDog extends Dog
{
    private int iq;
    public GeniusDog(String n, int a, Boolean g, int i)
    {
        super(n, a, g);
        iq = i;
    }
    public int getIQ()
    {
        return iq;
    }
    public void setIQ(int i)
    {
        iq = i;
    }
    public void makeNoise()
    {
        System.out.println("An unexamined life is not worth living, I am barking");
    }
    public void eat()
    {
        System.out.println("Like sands of the hourglass, so are the days of our lives, I am eating dog food");
    }
    public void poop()
    {
        System.out.println("Our lives are but specks of dust falling through the fingers of time, I am pooping in the yard");
    }
    public String toString()
    {
        return super.toString() + "\nIQ: " + iq;
    }
    
}
