package exception;

public class ThrowEsception {
	
	public static void marraige(int age) 
	{
		if(age>21) System.out.println("Ellegible for marraige");
		else throw new InvalidAgeException();
	}

	public static void main(String[] args)
	{
		
		marraige(21);
		marraige(10);
	}
}

class InvalidAgeException extends RuntimeException
{
	}