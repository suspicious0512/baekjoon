import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); 
		//연산 후 n : t번째 수열에서 몇번째 수인지
		//기존 n : 몇번째 수인지
		
		int t = 1; //몇번째 수열인지 알기 위하여 n에서 빼야하는 수
		
		
		while(true) 
		{
			if(n-t>0) 
			{
				n-=t;
				t+=1;
			}
			else 
			{
				break;
			}
		}
		
		int m = t+1; // t번째 열 분자 분모 합
		
		if(t%2==0) //짝수번째 열일때 분자는 작은수부터
		{
			System.out.printf("%d/%d",n,m-n);
		}
		else //홀수번째 열일때 분자는 큰수부터
		{
			System.out.printf("%d/%d",m-n,n);
		}

	}

}
