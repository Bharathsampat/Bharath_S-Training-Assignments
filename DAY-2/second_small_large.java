package multipleof5;

import java.util.Arrays;
import java.util.Scanner;

public class second_small_large {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		{
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(arr[1]);
		System.out.println(arr[n-2]);
		// TODO Auto-generated method stub

	}

}
