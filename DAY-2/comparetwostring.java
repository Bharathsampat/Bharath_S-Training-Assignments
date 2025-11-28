package multipleof5;

import java.util.Scanner;

public class comparetwostring {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		String s2 = sc.nextLine();
		System.out.println("Enter second number:");
		String s3=sc.nextLine();
		int cmp=s2.compareTo(s3);
		if(cmp==0)
		{
			System.out.println("same");
		}
		else if(cmp<0)
		{
			System.out.println("frst string smaller than seecond");
		}
		else
		{
			System.out.println("frst string greater than seeconds");
		}
		
	}

}
