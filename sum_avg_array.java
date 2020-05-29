package helo;

import java.util.Scanner;


public class third {

	public static void main(String[] args) {
		int n=0;
		int summ = 0;
		double avg=0;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			summ +=arr[i];
			avg= (double)summ/(double)n;
		}
		System.out.println("Sum: "+summ);
		System.out.println("Average: "+avg);
		
		
		
	}

}

