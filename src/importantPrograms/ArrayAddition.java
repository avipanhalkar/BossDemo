package importantPrograms;

public class ArrayAddition {

	public static void main(String[] args) {
		int[] a= {10,20,10,30,40};
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{
		sum=sum+a[i];	
		}
		System.out.println(sum);
	}
}
