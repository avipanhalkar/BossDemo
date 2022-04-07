package importantPrograms;


public class EachWordReverse
{
	public static void main(String[] args)
	{
		String str="jay maharashtra";

		String[] words =str.split(" ");//{'jay','maharashtra'}


		String tot="";

		for(String word : words)
		{	      if(!word.equals("jay")) {
			String rev="";
			//2 1
			for(int i=word.length()-1;i>=0;i--)
			{
				rev=rev+word.charAt(i);//yaj
			}
			tot=tot+rev+" ";
		}
		tot=tot+word+" ";
	}
		System.out.println(tot);
	}


}