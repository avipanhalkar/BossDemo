package variables;

public class StaticVariables {
	
	int a=10;
	static int b=20;
	
	public static void main(String[] args) {
		StaticVariables sv =new StaticVariables();
		System.out.println(sv.a+" -- "+b);
		
		sv.a=888;
		sv.b=999;
		System.out.println(sv.a+" -- "+b);
		System.out.println(sv.a+" -- "+sv.b);

		StaticVariables svv=new StaticVariables();
		System.out.println(svv.a+" -- "+svv.b);
		
		
		
		
	}
	

}
