package importantPrograms;
public class AscendingArrray {

public static void main(String[] args) {
	
	int[] a = new int[] {10,20,2,20,4,2,52,1,0,5,14,1,510,4,2,0,4,10};
	
	for (int i=0;i<a.length;i++) 
	{
		for (int j=i;j<a.length;j++)
		{
		int temp;
			if (a[i] > a[j])
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
