import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main 
{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int ans = 0;
		
		int five = n/5;
		
		ArrayList <Integer> nList = new ArrayList<Integer>();
		
		for(int i=five;i>=0;i--) 
		{
			if((n-i*5)%3==0) 
			{
				nList.add(i+(n-i*5)/3);
			}
		}
		
		//System.out.println(nList);
		int min =999999;
		
		if(nList.size()==0) {
			System.out.println("-1");
		}
		else 
		{
			for(int i =0;i<nList.size();i++) 
			{
				
				if(nList.get(i)<min) 
				{
					min=nList.get(i);
				}
			}
			System.out.println(min);
        }
	}
}
