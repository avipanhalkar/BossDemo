package scanner;

public class Constructor 
{
	Constructor(int x){System.out.println("Zero arg const");}
}

class child extends Constructor
{

	child(int x) {
		super(20);
		System.out.println("child");	
		}

	public static void main(String[] args) {
		Constructor c = new child(10);

	}

}

