package collectionPractice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
			ArrayList ar = new ArrayList();
			ar.add("Mahul");
			ar.add(100);
			ar.add('c');
			ar.add(10.20);
			
			System.out.println(ar.get(0).toString());
			
			for (Object object : ar) 
			{
				System.out.println(object.toString());
			}
	}

}
