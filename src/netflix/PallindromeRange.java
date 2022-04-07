package netflix;

public class PallindromeRange {
 
	public static void main(String[] args) 
	{
		int rev=0,nm=1;
		for (int i=0;i<=200;i++)
		{
			nm=i;
			while(nm>0) 
			{
				rev=rev*10+nm%10;
				nm=nm/10;
				
			}
			if (i==rev) {System.out.println("Pallendrome series between 0 to 200is->"+"\n"+i);}
			
		}
	}
}
