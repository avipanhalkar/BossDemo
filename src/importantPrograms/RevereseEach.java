package importantPrograms;

public class RevereseEach
{
  public static void main(String[] args)
  {
    String str="avi panhalkar";

    String[] words = str.split(" ");
    String op="";


    for(String word : words)
    {
	String rev="";
	for(int i=word.length()-1;i>=0;i--)
	{
		rev=rev+word.charAt(i);
	}
	op=op+rev+" ";

    }
    System.out.println(op);


  }
}
