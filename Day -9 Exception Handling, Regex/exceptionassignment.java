package multipleof5;

import java.util.Scanner;


public class exceptionassignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		try {
			
			if(age<18)
			{
				
				System.out.print("\nNot eligible\n");
				throw new Exception("InvalidAgeException");
			}
			else {
				System.out.print("Eligible");
			}
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.print("\nThank you");
		}
		// TODO Auto-generated method stub

	}

}
