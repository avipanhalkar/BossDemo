package constructor;

public class Constructor {
//declaration
	int a;
	int b;
	//initilization
	
	public Constructor()
	{
		a=10;
		b=20;
		
	}
	
	public void display() 
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void add() 
	{
		Constructor cc=new Constructor();
        int c=cc.a+cc.b;
		System.out.println(c);
		cc.display();
	}
	
	
	 public static void main(String[] args) {
		Constructor c=new Constructor();
		c.display();
		add();
		
		
		
		
	}

}
