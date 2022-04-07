package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		String[] str = {"avi","ravi"};
		//   List<String> al =new ArrayList<String>(Arrays.asList(geeks))
		     List<String> al = new ArrayList<String>(Arrays.asList(str));
		
		System.out.println(al);
		
		al.add("savi");
		System.out.println(al);
	}

}
