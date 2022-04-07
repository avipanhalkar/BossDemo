package importantPrograms;

public class TTest
{
	public static void main(String[] args) 
	{
		String str="Mr. Pankaj  Lipte";
		
		String[]  words=str.split(" ");//{'Mr.','pankaj','lipte'}
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
		String st="anna";
		String onm=st;
		String rev="";
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
			//System.out.print(str.charAt(i));
		}
		
		if(onm.equals(rev))
			System.out.println("String is palindrome"); 
		else System.out.println("Not Palindrome");
		System.out.println();
		System.out.println("******************");
		
		String op="";
		
		for(int i=words.length-1;i>=0;i--)
		{
			op=op+words[i]+" ";
		}
		System.out.println(op);

	}
}
