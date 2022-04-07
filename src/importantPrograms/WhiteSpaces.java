package importantPrograms;

public class WhiteSpaces {
	 public static void main(String[] args)
	    {
	       
	       String str = " aefafa af a er afa fea";
	       String neww =str.replaceAll(" ","");
	       System.out.println(neww);
	       
	       String str1 = "#JH86558996655FKE*(U#*#KJNEF*U(REOIE*#UJ*(#$*R(*R$#UEI";
	       String newStr1=str1.replaceAll("[^a-zA-Z0-9]","");
	       System.out.println(newStr1);
	       
	
	    }
}
