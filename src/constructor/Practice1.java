package constructor;

public class Practice1 {

	String nm;
	int id;
	double sal;
	
	Practice1(String nm,int id,double sal)
	{
		this.nm=nm;
		this.id=id;
		this.sal=sal;
	}
	
	void display() 
	{
		System.out.println("NAME->"+nm+"\n"+"ID->"+id+"\n"+"SALARY->"+sal);
	}
	
	public static void main(String[] args) {
		Practice1 pp=new Practice1("Avi",111,75000.00);
		pp.display();
	}
	
}
