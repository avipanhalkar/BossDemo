package commonerrors;

public class MisingReturnStatement {
	
	char add() 
	{
		return 97;
		System.out.println("1");
		
	}
	
	public static void main(String[] args) {
		MisingReturnStatement aa= new MisingReturnStatement();
		
		char x = aa.add();
		System.out.println("->"+x);
	}

}
