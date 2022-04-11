package variables;

public final class StaticDefault {

	static String vikky;
	static long l;
	final int ii=50;
	
	public static void main(String args)
	{
		System.out.println(vikky); // null
		System.out.println(l);  // 0
		StaticDefault sd=new StaticDefault();
		sd.display();
		System.out.println(sd.ii);//0
	}
	
	
	void display() 
	{
	  final int i=10;
	  int j=20;
	  System.out.println(j+j);
	  System.out.println(i);
	}
}











