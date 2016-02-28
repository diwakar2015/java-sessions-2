
public class Car {
	
 String modelName;
 boolean haveAirBag;
 int noOfWheels;
 String color;
 
 
 public void  blowHorn()
 {
	 System.out.println("Blowing horn");
 }
 
 public void  canBeDriven()
 {
	 System.out.println("Driving the car");
 }
 
 public void carryLuggage()
 {
	System.out.println("Carrying luaage"); 
 }
 
 

 public static void main(String[] args) {
	
	 
	Car audi = new Car(); 
	
	audi.modelName = "Audi A8";
	audi.haveAirBag = true;
	audi.noOfWheels = 4;
	audi.color = "Black";
	
	audi.blowHorn();
	audi.canBeDriven();
	audi.carryLuggage();
	
	
}
 
 
}


