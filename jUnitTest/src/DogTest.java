import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DogTest {
    Dog myDog;
    @Before
    public void setUp(){
        myDog = new Dog("Jimmy", "Beagle");
        System.out.println("My dog's name is " + myDog.getName() + ".");
        System.out.println("He is " + myDog.getWeight() + " pounds.");
        myDog.play();
        if(myDog.isHappy().equals(true)){
            System.out.println("He is happy.");
        } else{
            System.out.println("He is not happy.");
        }
    }
    @After
    public void tearDown(){
        System.out.println("Goodbye");
    }
    @Test
    public void createNewDog(){
        assertEquals("Error in creating a dog", "Jimmy", myDog.getName());
        assertNotNull("Breed is null", myDog.getBreed());
        assertNotSame("Name is breed or breed is name.", myDog.getBreed(), myDog.getName());
        assertSame("Age is not the same as weight", myDog.getAge(), myDog.getWeight());
        assertThat("Dog is happy.", myDog.isHappy(), is(true));
    }

    @Test
    public void isDogHappy(){
        assertTrue("Dog is not happy", myDog.isHappy());
        assertFalse("Dog is happy", myDog.isHappy());
        assertNull("Dog has at least one bone", myDog.getBones());
    }
    @Test
    public void feedDog(){
        myDog.setWeight(5);
        myDog.eat();
        System.out.println("My dog is now " + myDog.getWeight() + " pounds.");
        assertEquals("Error when eating", 10, myDog.getWeight());
    }
}