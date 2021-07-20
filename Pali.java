package palindrom;

import java.util.*;
public class Pali
{
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			String s1=sc.next();
			String s2="";
			for(int i=s1.length();i>0;i--)
				s2+=s1.substring(i-1,i);
			//	System.out.println(s2);
			if(s2.equalsIgnoreCase(s1))
				System.out.println("YES it is a palindrom");
			else
				System.out.println("NO, it's not a palindrom");
		}
	}


}