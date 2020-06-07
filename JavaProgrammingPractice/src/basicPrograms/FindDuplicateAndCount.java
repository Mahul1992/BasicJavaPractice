
package basicPrograms;

import java.util.ArrayList;

public class FindDuplicateAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a table this table is wooden";
		String[] str1 = s.split(" ");
		ArrayList<String> duplicate = new ArrayList<String>();
		int n = 0;
		for(int i= 0; i<str1.length;i++) 
		{
			String s2 = str1[i];
			
			for(int j=0; j<str1.length; j++) 
			{
				if(str1[j].equalsIgnoreCase(s2)) 
				{
					n++;
					str1[j]="";
				}
				
			}
			
			if(!s2.equals("")){
				System.out.println("Count of String: "+s2 +" is : "+n);				
			}
			//To Find Duplicate
			if(n>1) {
				duplicate.add(s2);
			}
			n=0;
		}
		
		for (String lt : duplicate) {
			System.out.println(lt);
		}
		
	
	}

}
