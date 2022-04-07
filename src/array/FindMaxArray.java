package array;

public class FindMaxArray {

	public static void main(String[] args) 
	{
	 int[] a= {10,50,4,60,45,054,4,4,0,54,1,45};
	 int i ;
	 for(i=0;i<a.length;i++) 
	 {
		 int temp;
		for(int j=i;j<a.length;j++) {
		 if(a[i] < a[j]) 
		 { 
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		 }
		}
	 }
	 System.out.print(a[0]);
	}
}
