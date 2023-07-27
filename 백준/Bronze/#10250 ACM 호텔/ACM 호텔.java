import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++) 
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			int front = 0;
			int end = 1;
			
			while(n>0) 
			{
				//System.out.printf("n : %d\n",n);
				
				
				if(front<h) 
				{
					front++;
					n--;
					//System.out.printf("위로 쌓는 중 : %d %d\n",front,end);
				}
				else {
					front=1;
					end++;
					n--;
					//System.out.printf("옆줄 한칸 이동 : %d %d\n",front,end);
				}
				
			}
			if(end<10) 
			{
				System.out.printf("%d0%d\n",front,end);
			}
			else 
			{
				System.out.printf("%d%d\n",front,end);
			}
			
		}
		

	}

}
