import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) 
		{
			int n = Integer.parseInt(br.readLine());
			
			if(n==-1) 
			{
				break;
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append(1);
			//System.out.println(sb);
			int perfect = n-1;
			
			for(int i=2;i<n;i++) 
			{
				if(n%i==0) 
				{
					sb.append(" + ");
					sb.append(i);
					perfect-=i;
					//System.out.println(sb);
				}
			}
			
			if(sb.toString().length()>1&&perfect==0) {
				System.out.printf("%d = %s\n",n,sb);
			}
			else {
				System.out.printf("%d is NOT perfect.\n",n);
			}
			
			
		}
	
	}

}
