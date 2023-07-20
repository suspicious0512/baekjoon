import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int angleSum =0;
		
		ArrayList <Integer>angleList = new ArrayList<Integer>();
		
		for(int i=0;i<3;i++) 
		{
			int n = Integer.parseInt(br.readLine());
			
			angleSum+=n;
			
			if(!angleList.contains(n)) 
			{
				angleList.add(n);
			}
			else {
				angleList.remove(angleList.indexOf(n));
			}
		}
		
		if(angleSum==180) 
		{
			if(angleList.size()==1) 
			{
				if(angleList.get(0)==60)
				{
					System.out.println("Equilateral");
				}
				else 
				{
					System.out.println("Isosceles");
				}
			}
			else {
				System.out.println("Scalene");
			}
		}
		else 
		{
			System.out.println("Error");
		}
	
	}

}
