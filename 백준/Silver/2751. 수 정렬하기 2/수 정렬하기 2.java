import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
	public static void merge_sort(ArrayList<Integer> al, int start, int end) 
	{
		if (start<end) 
		{
			int middle = (start+end)/2;
			merge_sort(al,start,middle); //왼쪽 부분 배열 정렬
			merge_sort(al,middle+1,end); //오른쪽 부분 배열 정렬
			merge(al, start, middle, end);//두 부분 배열 병합
		}
	}
	
	public static void merge(ArrayList<Integer> al, int start, int middle, int end) 
	{
		int nl = middle-start+1; // 왼쪽 부분 크기
		int nr = end-middle;// 오른쪽 부분 크기
		
		int [] left = new int [nl];
		int [] right = new int [nr];
		//System.out.printf("%d %d",nl, nr);
		
		for (int i=0;i<nl;i++) 
		{
			left[i] = al.get(start+i); // 왼쪽 부분 복사
			//System.out.println(left[i]);
		}
		
		for (int j=0;j<nr;j++) 
		{
			right[j] = al.get(middle+1+j); // 오른쪽 부분 복사 
		}
		
		// 두 배열의 값을 앞에서부터 각각 하나씩 비교하여 더 작은 수를 merge로 받아온
		//al에 다시 넣을 거임
		
		int i=0;
		int j =0;
		int k = start;
		
		while (i<nl && j<nr) 
		{
			if (left[i] <= right[j]) 
			{
				al.set(k, left[i]);
				i+=1;
			}
			else 
			{
				al.set(k, right[j]);
				j+=1;
			}
			k+=1;
		}
		
		// 왼쪽 배열 남은 경우
		while (i<nl) 
		{
			al.set(k, left[i]);
			i+=1;
			k+=1;
		}
		
		while(j<nr) 
		{
			al.set(k, right[j]);
			j+=1;
			k+=1;
		}
	}

	public static void main(String[] args) throws IOException
	{
		long startTime = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList <Integer> al = new ArrayList<Integer>();
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n;i++) 
		{
			int temp = Integer.parseInt(br.readLine());
			al.add(temp);
		}
		
		//System.out.println(al);
		
		// 인터넷 검색했다가 수가 큰 경우에는 linked list가 적합하다고 봤는데
		// 챗gpt는 아에 상반된얘기를 함
		// 실제로 코드를 짜는데 있어서는 arrayList가 더 편했음
		// 물론 더 익숙해서 그런 걸 수 도 있음
		
		// 분할 해보자
		int start =0;
		int end =n-1;
		merge_sort(al,start,end);
		
		//System.out.println(al);
		
		//long endTime = System.currentTimeMillis();
		//long duration = endTime - startTime;;
		//System.out.println("실행시간" + duration + "ms");
		
		for (int num :al) {
			System.out.println(num);
		}
		
		
	}

}
