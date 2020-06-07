package collectionPractice;

import java.util.ArrayList;



public class ArrayListPractice {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
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
			
			//Work With ObjectData
			ArrayList ar1 = new ArrayList();
			ar1.add(new Employee(101, "Temper"));
			ar1.add(new Students(001, "Prashant"));
			ar1.add(null);
			ar1.add("Sumitra");
			
			System.out.println("--------------Object Data--------------");
			System.out.println(ar1.toString());
			
			for (Object object : ar1)
			{
				if(object instanceof Employee) {
					Employee e = (Employee) object;
					System.out.println(e.eid);
					System.out.println(e.name);
				}
				
				if(object instanceof Students) {
					Students s = (Students) object;
					System.out.println(s.sid);
					System.out.println(s.sName);
				}
				if(object instanceof String)
				{
					System.out.println(object);
				}
				if(object ==null)
				{
					System.out.println(object);
				}
			}
			
			//Above example was not type safe, we can type safe using generic .
			//  Use below example
			
			ArrayList<Integer> al2 = new ArrayList<Integer>();
			//al2.add("ahba"); - here compilation error appear since we are adding string to the integer arraylist
			
			al2.add(1);
			al2.add(1);
			al2.add(2);
			al2.add(5);
			al2.add(4);
			
			System.out.println(al2.get(3));
			for (Integer i : al2) {
				System.out.println("Type Safe value with integer: "+i);
			}
	}

}
