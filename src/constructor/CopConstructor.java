package constructor;

public class CopConstructor {
	
	int id;
	String nm;
	
	CopConstructor(int id,String nm)
	{
		this.id=id;
		this.nm=nm;
	}
	
	CopConstructor(CopConstructor cc)
	{
		id=cc.id;
		nm=cc.nm;
	}
	
	void display() 
	{
		System.out.println("ID->"+id+" Name->"+nm);
	}
	
	public static void main(String[] args)
	{
		CopConstructor cc=new CopConstructor(11,"Avi");
		CopConstructor cc1=new CopConstructor(cc);
		cc.display();
		cc1.display();
		
	}

}
