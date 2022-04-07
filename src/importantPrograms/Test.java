package importantPrograms;

public class Test 
{
	public static void main(String[] args) 
	{
		String str="life is beautifull";

		String[] words = str.split(" ");

        String op;
        
        String each = null;
		for(int i=words.length-1;i>=0;i--)
			{
				//System.out.print(words[i]+" ");
				each=words[i]+" ";
				System.out.print(each);
				
				String[] eache=each.split(" ");
				op="";
				for(String word : eache)
					{
					String rev="";
						for(int j=word.length()-1;j>=0;j--)
							{
								rev=rev+word.charAt(j);
							}
							op=op+rev+" ";
							

					}System.out.print(op);
			}
		System.out.println();
		
	}
}
