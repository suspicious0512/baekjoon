import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		
		double v = Double.parseDouble(st.nextToken());
		
		//System.out.println(Math.round((v-a)/(a-b)));
		
		int ans =(int) ((Math.ceil((v-a)/(a-b)))+1);
		
		
		
		System.out.println(ans);
	}

}
