package importantPrograms;

public class AscendingOrder {
	
	public static void main(String[] args) {
		int[] a=new int [] {10,20, 5,  40,56, 0 ,4,0,4,0,54,52,0,45,20,1,0,25,0,1,0,52,5,5,0,5,2,00,4145,5,2};
//                          0   1  2  3  4   5 .... 
		//	System.out.println(a.length);//30
		              //30
		for (int i=0;i<a.length;i++) 
		{//i= 0
			int temp;
			              //30
			for (int j=i;j<a.length;j++) 
			{//j =0 1 2 3
				//i=0
				    //
				   //0 > 
				if(a[i] > a[j]) 
				{
					temp = a[i];//5
					a[i] = a[j];//0
					a[j] = temp;//5
				}
			}
			System.out.println(a[i]);
		}
	}

}
