import java.util.*;

public class ParkRanger{
  
  private String name;
  private ArrayList<Trainable> trainedAnimals;


  public ParkRanger(String name){
    this.name = name;
    this.trainedAnimals = new ArrayList<Trainable>();
  }

  public String getName(){
    return this.name;
  }

  public void addAnimal(Trainable animal){
    trainedAnimals.add(animal);
  }

  public int animalCount(){
    return this.trainedAnimals.size();
  }

  public Trainable sellAnimal(){
    Trainable animal = trainedAnimals.remove(0);
    return animal;
  }


}