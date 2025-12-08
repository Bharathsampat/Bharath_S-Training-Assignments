package multipleof5;

import java.util.Scanner;

public class regularexpressionassignment {

	public static void main(String[] args) {
		String mobi_patter="(\\+1|001)-?\\d{3}-\\d{3}-\\d{4}";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Mobile Number: ");
		String no=sc.nextLine();
		if(no.matches(mobi_patter))
		{
			System.out.print("\n Valid Number");
		}
		else
		{
			System.out.print("\n Invalid Number");
			
		}
		// TODO Auto-generated method stub

	}

}
