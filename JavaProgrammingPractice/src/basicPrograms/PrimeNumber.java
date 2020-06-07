package basicPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPrimeNumber(10);
		PrintPrimeNumber(10);
	}
	public static boolean IsPrimeNumber(int n)

    {
        if(n==0 || n==1|| n == 2 )
        {
            return false;
        }
        for(int i=2; i<n; i++)
        {
            if (n % i == 0)
            {
               
                return true;
                
            
            }
        }
        return false;
    }
	public static String PrintPrimeNumber(int n)
      {
		String pN = "0,1,2";
		boolean status = true;
          
          for(int i=3; i<n; i++)
          {
              for(int j=2; j<i; j++)
              {
                  if (i % j == 0)
                  {
                      status = false;
                      break;
                  }
              }

              if (status)
              {
                  pN = pN + "," + i;
              }
              status = true;
          }
          return pN;
      }
}
