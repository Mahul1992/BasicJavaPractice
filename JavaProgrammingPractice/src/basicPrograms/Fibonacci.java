package basicPrograms;

public class Fibonacci {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n= 10;
		  int j = 1;
          int i =1;
          int h;
          String fn = "0";
          fn = fn + " " + j + " " + i;
          for (int k = 1; k < n; k++)
          {

              h = j + i;
              fn = fn + " " + h;
              i = j;
              j = h;

          }
          System.out.println("Fibonaci Number is: " + fn);

          while (j < n)
          {

              h = j + i;
              fn = fn + " " + h;
              i = j;
              j = h;
          }
          System.out.println("Fibonaci Number using while loop: " + fn);

	}

}
