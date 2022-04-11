package constructor;

public class RecursiveConstructor {

	RecursiveConstructor()
	{
		this(10);
		System.out.println(" Recursive");
	}
	
	RecursiveConstructor(int a)
	{
		//this();
		System.out.println(" Recursive  2");
		
	}
	
	
	public static void main(String[] args) {
	
		new RecursiveConstructor();

		System.out.println("Hi");
			}

}

