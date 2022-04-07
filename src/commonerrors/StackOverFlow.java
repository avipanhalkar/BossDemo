package commonerrors;

public class StackOverFlow {
	
	public void m1() 
	{
		m2();
	}
	
	public void m2() {
		m1();
	}
	
	public static void main(String[] args) {
		StackOverFlow ss = new StackOverFlow();
		ss.m1();
	}

}
