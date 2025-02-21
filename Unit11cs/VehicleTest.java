import java.util.*;
public class VehicleTest{
    
    public static void main(String[] args){
        System.out.println("Vehicle Test");
        
        ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();
            vehicle.add(new Car());
            vehicle.add(new Motorcycle());
            vehicle.add(new Unicycle());
            vehicle.add(new Bicycle());
        
        for(Vehicle v : vehicle){
          System.out.println(v.getName() + " " + v.getWheelCount() + "  " + v.getIsHumanPowered() +" "+ totalWheels(vehicle) + " " + humanPower(vehicle) + " ");
    }
    }
    
    
        public static int totalWheels(ArrayList<Vehicle> vehicle){
        int result = 0;
        for(Vehicle v : vehicle){
           result+= v.getWheelCount();
        }
        return result;
        }
    
    
        public static ArrayList<Vehicle> humanPower(ArrayList<Vehicle> vehicle){
        ArrayList<Vehicle> result = new ArrayList<Vehicle>();
            for(Vehicle v : vehicle){
                if(v.getIsHumanPowered()==true){
                    result.add(v);
                }
                
            }
            return result;
        } 

        }
    
    