package programs;

public class ArraysSort {

	public static void main(String[] args) {
		int[] a= {10,54,24,62,71,22,45,45,365,714,45,21,98,74,32};

		for(int i=0;i<a.length;i++) 
		{
			int temp;
			for(int j=i;j<a.length;j++) {
				if(a[i] < a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;				
					}	
			}System.out.println(a[i]);
			
		}System.out.println(a[0]);
		
	}
}
