public class Chicken implements Edible, Trainable {
  public String swim(){
    return "cant swim";
  }

  public int nutritionValue(){
    return 10;
  }

  public String speak(){
    return "cluck!";
  }

  public String trick(){
    return "fetch grain!";
  }
}