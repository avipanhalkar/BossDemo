package variables;

public class StaticVar {
	
	int i;
	String ss;
	static String s="Velocity";
	
	void display(int i,String ss)
	{
//		i=a;
//		ss=snm;
		System.out.println("ID ->"+i);
		System.out.println("NAME ->"+ss);
		System.out.println("Institute ->"+s);
	}

	
	public static void main(String[] args) {
		
		StaticVar sv=new StaticVar();
		sv.display(10,"AVI");
		sv.display(11,"Swapnil");
		sv.display(12,"DEv");
		sv.display(13,"Rahul");
		sv.display(14,"Pankaj");
		
	}
}
