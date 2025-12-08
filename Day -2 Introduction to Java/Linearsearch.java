package multipleof5;

import java.util.*;

public class Linearsearch {

	public static void main(String[] args) {
		System.out.println("Enternthe number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the  number to be searched");
		int num=sc.nextInt();
		boolean found=false;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("Found at"+(i+1));
				found=true;
				break;
			}
		}
		
		if (!found)
		{
			System.out.println("not found");
		}
		
		

	}

}
