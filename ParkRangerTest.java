import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class ParkRangerTest{
  Bear bear;
  Chicken chicken;
  ParkRanger parkranger;

  @Before 
  public void before() {
    bear = new Bear("Baloo");
    chicken = new Chicken();
    parkranger = new ParkRanger("Henry");
  }

  @Test 
  public void rangerHasName(){
  assertEquals("Henry", parkranger.getName());
  }

  @Test 
  public void addAnimalToList(){
    parkranger.addAnimal(bear);
    assertEquals(1, parkranger.animalCount());
  }

  @Test
  public void addChickenToList(){
    parkranger.addAnimal(chicken);
    assertEquals(1, parkranger.animalCount());
  }

  @Test
  public void animalCanDoTrickOnceRemoved(){
    parkranger.addAnimal(bear);
    Trainable animal = parkranger.sellAnimal();
    assertEquals("juggles!", animal.trick());
  }


}

