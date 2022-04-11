package variables;

public class VariablesInstatnce {
	
	 int i=10;
	
	
//	public static void main(String[] args) {
//		
//		System.out.println(i); //10
//		VariablesInstatnce t=new VariablesInstatnce();
//		t.i=999;
//		System.out.println(t.i);//999
//		VariablesInstatnce tt=new VariablesInstatnce();
//		System.out.println(tt.i);//10 999
//		
//		
//	}
	
	
	public static void main(String[] args)
	{
	
	VariablesInstatnce t=new VariablesInstatnce();
	System.out.println(t.i); //10(valid)
	
	t.i=999;
	System.out.println(t.i); //999
	
	VariablesInstatnce tt=new VariablesInstatnce();
	System.out.println(tt.i); // 10 
	
	}
	
	
	
}
