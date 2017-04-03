
/**
 * Dog Cat and Genius Dog runner
 * 
 * @author Patrick Boyle
 * @version 3/9/2017
 */
import java.util.*;
public class Kennel
{
    public static void main(String[] args)
    {
        Pet hank = new GeniusDog("Hank", 15, true, 999);
        Pet wicket = new Cat("Wicket", 2, false);
        Pet mani = new Dog("Mani", 20,  true);
        ArrayList<Pet> myPets = new ArrayList<Pet>();
        myPets.add(hank);
        myPets.add(wicket);
        myPets.add(mani);
        for(int i = 0; i < myPets.size(); i++)
        {
            myPets.get(i).poop();
            System.out.println(myPets.get(i));
        }
    }
}
