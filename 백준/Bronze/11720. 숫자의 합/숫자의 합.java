import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//11720
public class Main 
{

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int total=0;
		String s =br.readLine();
		for(int i=0;i<n;i++) 
		{
			total+=((int)(s.charAt(i))-48);
		}
		
		bw.write(String.valueOf(total));
		bw.flush();
		bw.close();
		

	}

}
