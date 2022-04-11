package mainmethod;
//A 10 A 10  20 
// public default abstract final strictfp //not->static private protected
public class MainOverloading {

	 
	
	public static void main(int a) {
		main('a');
		System.out.println(10);
		
	}
	public static void main(int a,int b) {
		main('a');
		System.out.println(10+" "+20);
		
	}
	
	public static void main(char ch) {
		System.out.println('A');
		
	}
	void display() {}
	private MainOverloading()
	{
		System.out.println("Constructor");
		
	}
}























