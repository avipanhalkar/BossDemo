package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		 ArrayList al = new ArrayList();
		 al.add(12);
		 al.add(1);
		 al.add(2);
		 al.add(122);
		 al.add(112);
		 al.add(120);
//		 al.add(120.0);
//		 al.add(121.1);
//		 al.add('b');
//		 al.add('a');
//		 al.add("avi");
//		 al.add("ravi");
		 
		 for(Object i : al) 
		 {
			System.out.println(i); 
		 }
		 
		 Collections.sort(al);
		 System.out.println("After sorting");
		 for(Object i : al) 
		 {
			System.out.print(i+"-"); 
		 }
	}
}
