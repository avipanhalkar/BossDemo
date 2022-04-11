package constructor;

public class CopyConstructor {
	
	int id;
	String nm;
	
	CopyConstructor(int id,String nm)
	{
		this.id=id;
		this.nm=nm;
	}
	
	CopyConstructor(CopyConstructor cc)
	{
		id=cc.id;
		nm=cc.nm;
    }
	
	void dislplay() 
	{
		System.out.println("ID->"+id+" Name->"+nm); 
	}

	public static void main(String[] args) 
	{
		CopyConstructor cc=new CopyConstructor(11,"Avi");
		CopyConstructor cc1=new CopyConstructor(cc);
		cc.dislplay();
		cc1.dislplay();
		
	}
}














