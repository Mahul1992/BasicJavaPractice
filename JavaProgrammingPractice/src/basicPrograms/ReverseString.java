package basicPrograms;

public class ReverseString {

	public static String main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Mahul";
		String s1 = "";

        char[] ch = s.toCharArray();
        for(int i=s.length()-1; i>=0; i--)
        {
            s1 = s1 + ch[i];
        }
        return s1;
	}

}
