import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
	

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] arr = new int [10];
		int ans =1;
		
		for(int i=0;i<3;i++) 
		{
			ans*= Integer.parseInt(br.readLine());
		}
		
		while(!(ans<10)) 
		{
			arr[ans%10]+=1;
			ans/=10;
		}
		arr[ans]+=1;
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}
	}

}