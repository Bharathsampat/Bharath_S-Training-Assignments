package multipleof5;
import java.util.*;

public class binarysearch {
	public static int binary(int arr[],int key) {
		
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(arr[mid]<key)
			{
				left=mid+1;
			}
			else 
			{
				right=mid-1;
			}
			
		
	}
		return -1;

}

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
		
		int key=sc.nextInt();
		int result= binary(arr,key);
		
		if (result!= -1)
		{
			System.out.println(""+result);
		}
		else
		{
			System.out.println("NOt found");
		}
		
	
		sc.close();
	}
	
}
