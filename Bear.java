import java.util.*;


public class Bear implements Trainable{
  
  private String name;
  private ArrayList<Edible> belly;


  public Bear(String name){
    this.name = name;
    this.belly = new ArrayList<Edible>(); 
  }

  public String getName(){
    return this.name;
  }

  public int foodCount(){
    return  this.belly.size();
  }

 public String trick(){
  return "juggles!";
 }

 public void eat(Edible food){
  this.belly.add(food);
 }

 // public boolean bellyFull(){
 //   return foodCount() == belly.length;
 // }

 public void sleep(){
   belly.clear();
 }

 public Edible throwUp() {
  if (foodCount() > 0) {
  Edible food =  belly.remove(0);
  return food;
  }
  return null;
 }

 public int totalNutrition() {
  int totalValue = 0;
  for (Edible food : belly) {
    totalValue += food.nutritionValue();
  }
  return totalValue;
 }

}
