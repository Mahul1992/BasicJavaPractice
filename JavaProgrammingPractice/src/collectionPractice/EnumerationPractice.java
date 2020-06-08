package collectionPractice;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v  = new Vector<Integer>();
		v.add(10);
		v.add(11);
		v.add(12);
		v.add(13);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			Integer i = (Integer)e.nextElement();
			System.out.println(i);
		}
	}

}
