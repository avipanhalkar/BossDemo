package array;

public class TriangleNumber {
	
  public static void main(String[] args) {
	 
	  int no=6;
	  int value=0;
	  for(int i=0;i<no;i++) 
	  {
		for(int j=0;j<i;j++) 
		{
		   System.out.print(value);
		   value++;
		} 
		System.out.println();
	  }
}

}
