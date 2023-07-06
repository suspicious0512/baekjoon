import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [][] white_arr = new int [100][100];
		
		int n = Integer.parseInt(br.readLine());
		
		int ans = 0;
		
		for(int t=0;t<n;t++) 
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x= Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			//System.out.printf("x: %d\n",x);
			//System.out.printf("y: %d\n",y);
			
			x-=1;
			y-=1;
			
			//System.out.printf("x-1: %d\n",x);
			//System.out.printf("y-1: %d\n",y);
			
			for(int i=y;i<y+10;i++) 
			{
				//System.out.printf("i : %d\n",i);
				
				for(int j=x;j<x+10;j++) 
				{
					//System.out.printf("j : %d\n",j);
					 if(i<100&&j<100) 
					 {
						 white_arr[i][j]=1;
					 }
					//System.out.println("이게 문제?");
				}
				//System.out.println("저게 문제?");
			}
			
		}
		
		for(int i=0;i<100;i++) 
		{
			for(int j=0;j<100;j++) 
			{
				//System.out.print(white_arr[i][j]);
				ans+=white_arr[i][j];
			}
			
		}
		
		System.out.println(ans);
	}

}
