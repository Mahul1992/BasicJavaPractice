package collectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class IteratorPractice {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ArrayList<Integer> v  = new ArrayList<Integer>();
		v.add(10);
		v.add(11);
		v.add(12);
		v.add(13);

		Iterator<Integer> i = v.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}



}
