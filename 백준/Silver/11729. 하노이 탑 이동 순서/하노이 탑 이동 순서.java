import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main 
{
	static int ans =0;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static void hanoi(int n, int start, int to, int bypass) throws IOException {
		if(n==1) {
			ans+=1;
			/*
			 * bw.write(String.valueOf(start)); bw.write(String.valueOf(to));
			 * bw.write("\n");
			 */
			sb.append(start).append(" ").append(to).append("\n");
		}else {
			ans+=1;
			hanoi(n-1,start,bypass,to);
			/*
			 * bw.write(String.valueOf(start)); bw.write(String.valueOf(to));
			 * bw.write("\n");
			 */
			sb.append(start).append(" ").append(to).append("\n");
			hanoi(n-1,bypass,to,start);
		}
	}
	
	public static void main(String[] args) throws IOException
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		hanoi(a,1,3,2);
		bw.write(String.valueOf(ans)+"\n");
		String str = sb.toString();
		bw.write(str);
		
		bw.flush();
		bw.close();
		
		
		
		
		
		

	}

}
