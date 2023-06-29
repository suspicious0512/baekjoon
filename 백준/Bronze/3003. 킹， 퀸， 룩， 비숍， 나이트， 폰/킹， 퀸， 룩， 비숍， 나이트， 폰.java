import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main 
{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] chess_arr = {1,1,2,2,2,8};
		int[] check_arr = new int [6];
		int[] ans_arr = new int [6];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<check_arr.length;i++) 
		{
			check_arr[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<chess_arr.length;i++) 
		{
			System.out.printf("%d ",chess_arr[i]-check_arr[i]);
		}
		
		
	}

}
