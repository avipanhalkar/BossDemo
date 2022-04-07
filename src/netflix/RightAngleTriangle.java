package netflix;

public class RightAngleTriangle {

	public void pattern() 
	{
		for (int i=0;i<=5;i++) //i=  2
			{
			    for (int j=0;j<=i;j++) //j=1 2
			    {
			    	System.out.print("* ");
			    }
			    System.out.println();
			}
	}
	
	public static void main(String[] args)
	{
		RightAngleTriangle ran=new RightAngleTriangle();
		ran.pattern();
	}
}
