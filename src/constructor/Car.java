package constructor;

public class Car {
	String brand;
	 
     Car(){
		brand="Ford";
	}
     public String getBrand() {
    	 return brand;
     }
     void run() {
    	 System.out.println("car is running...");
     }
     public static void main(String[] args) {
    	 Car c=new Car();
    	 String s=c.getBrand();
    	 System.out.println(s);
    	 c.run();
     }

}
