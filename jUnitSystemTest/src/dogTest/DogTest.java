package dogTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import jUnitSystemTest.Dog;
public class DogTest {
    Dog myDog;
    @Before
    public void setUp(){
        myDog = new Dog("Jimmy", "Beagle");
        System.out.println("My dog's name is " + myDog.getName() + ".");
        System.out.println("He is " + myDog.getWeight() + " pounds.");
    }
    @After
    public void tearDown(){
        System.out.println("Goodbye");
    }
    @Test
    public void createNewDog(){
        assertEquals("Error in creating a dog", "Jimmy", myDog.getName());
    }
    @Test
    public void feedDog(){
        myDog.setWeight(5);
        myDog.eat();
        System.out.println("My dog is now " + myDog.getWeight() + " pounds.");
        assertEquals("Error when eating", 10, myDog.getWeight());
    }
}
