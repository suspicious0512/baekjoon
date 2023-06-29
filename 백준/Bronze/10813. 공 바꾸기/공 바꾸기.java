import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int temp=0;
		
		int arr[]= new int [n];
		
		for(int i=0;i<n;i++) 
		{
			arr[i]=i+1;
		}
		
		for(int i=0;i<m;i++) 
		{
			int l = sc.nextInt();
			int r = sc.nextInt();
			
			
			temp=arr[l-1];
			arr[l-1]=arr[r-1];
			arr[r-1]=temp;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d ",arr[i]);
		}
	}

}
