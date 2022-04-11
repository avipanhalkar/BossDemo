package constructor;

public class Construstor2 {
	
	 int a;
	 int b;
	 int c;
	 int d;
	 
	 Construstor2()
	 {
		 a=10;
		 b=20;
		 
	 }
	 Construstor2(int c,int d)
	 {
		 this.c=c;
		 this.d=d;
		 System.out.println(c+"-----"+d);
	 }
	 
	  public void display() 
	  {
		
		  System.out.println(a+"-----"+b);
		  
	  }
	  
	  
	  public static void main(String[] args) {
		  Construstor2 cc=new Construstor2();
		  Construstor2 cd=new Construstor2(30,40);
		  cc.display();
		  
		  
		  
		  
	}

}
