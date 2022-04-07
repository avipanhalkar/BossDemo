
package scanner;

public class Blocks {
   
  
	{
		System.out.println("non static block ");
	}
	
	static 
	{
		System.out.println("static block");
		
	}
	public static void main(String[] args) {
		Blocks b = new Blocks();
	}
}
