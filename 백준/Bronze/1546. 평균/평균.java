

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int howmany = sc.nextInt();
		
		float arr[] = new float[howmany];
		
		for(int i=0; i<howmany;i++) {
			arr[i]=sc.nextInt();
		}
		
		float max = -99999;
		
		for(int i=0;i<howmany;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		
		
		for(int i=0;i<howmany;i++) {
			arr[i]=arr[i]/max*100;
		}
		
		float total = 0;
		
		for(int i=0;i<howmany;i++) {
			total+=arr[i];
		}
		
		System.out.printf("%f",total/howmany);
		
		
	}
}