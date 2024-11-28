import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//수열의 크기
		int n = Integer.parseInt(br.readLine()); 
		
		//수열 크기 배열
		int[] arr = new int [n];
		
		// 입력받은 문자 저장
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) 
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		// 전처리, dp 배열, dp[시작][끝] =1일때 회문이라 판단
		int[][] dp = new int [n][n];
		
		//입력받은 데이터로 dp 전처리 작업하기
		for(int i=0;i<n;i++) 
		{
			//길이가 1이면 항상 회문
			dp[i][i]=1;
		}
		//길이가 2이면 좌우문자 같으면 회문
		
		for(int length=2;length<n+1;length++) // 구간 길이 2~n까지
		{
			for(int start=0;start<n-length+1;start++) 
			{
				int end= start+length-1;
				//2일때와 3이상일때 모두 양쪽 끝이 같아야 회문이니 양쪽 끝 확인 먼저함
				if(arr[start]==arr[end]) 
				{
					//양끝이 같으면 2일때 회문임
					if(length==2) 
					{
						dp[start][end]=1;
					}
					//길이가 2일때를 제외한 3이상부터 내부가 회문이라면 전체도 회문임
					else if(dp[start+1][end-1]==1) 
					{
						dp[start][end]=1;
					}
				}
			}
		}
		
		//질문 횟수
		int m = Integer.parseInt(br.readLine());
		
		//질문 횟수 만큼 반복
		for(int i=0;i<m;i++) 
		{
			// 시작과 끝범위
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			if(dp[s-1][e-1]==1) {
				bw.write("1\n");
			}
			else {
				bw.write("0\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
