package importantPrograms;

public class Armstrong {

	public static void main(String[] args) {
		
		int no=372;
		int rem,sum=0;
		int onm = no;
		while(no>0) 
		{
			rem=no%10;
			sum=sum+rem*rem*rem;
			no=no/10;
		}
		
		if (onm == sum) System.out.println("Given number is armstrong");
		else System.out.println("Not Armstrong number");
		
	}
}
