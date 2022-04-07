package importantPrograms;

public class CharecterString1 {
	public static void main(String[] args) {
		String str="avi panhalkar akola";
		int count=0;
		
		for(int i=0;i<str.length();i++) 
		{
		   if(str.charAt(i) !=' ') 
		   {
			count++; //1  
		   }	
		}
		
		System.out.println(count);
	}

}
