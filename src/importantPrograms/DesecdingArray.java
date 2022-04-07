package importantPrograms;

public class DesecdingArray {

	public static void main(String[] args) {
		int[] a= new int [] {10,20,50,40,30,721,025,0,52,2,0,0,52,58,5,5,5};
		
		for (int i=0;i<a.length;i++) 
		{
			for (int j=i;j<a.length;j++) 
			{int temp;
				if(a[i] < a[j]) 
				{
					temp=a[i];
				      a[i]=a[j];
				      a[j]= temp;
				}
				
			}
			System.out.println(a[i]);
		}
	}
}
