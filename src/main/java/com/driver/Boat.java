public class Boat implements WaterVehicle{
   private String name; // name of the boat
  private int capacity; // capacity of the boat
  
  public Boat(String name,int capacity){
    this.name=name;
    this.capacity=capacity;
  }
  
  public String getVehicleName(){
    return name;
  }
  
  public int getVehicleCapacity(){
    return capacity;
  }
  
}
