package multipleof5;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		System.out.print("Enter n numbers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			//System.out.println(arr[i]);
			
		}
		for(int aray:arr)
		{
			System.out.println(aray);
			
		}

	}


}
