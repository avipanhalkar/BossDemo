package blocks;

public class Blocks {

	
	
	static 
	{
		System.out.println("Static block");
	}
	
	{
		System.out.println();
	}
	{
		
		System.out.println("Instance block");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		Blocks b = new Blocks();
	}
}
