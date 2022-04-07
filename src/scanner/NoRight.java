package scanner;



public class NoRight {
	
	public void triangle()  
	{
		for(int i=0;i<=5;i++) //i=0 1 2
		{
			for (int j=0;j<=i;j++)//i=2  j=0
				
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		NoRight rat=new NoRight();
		rat.triangle();
		
	}

}
