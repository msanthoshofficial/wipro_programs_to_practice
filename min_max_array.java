package helo;

import java.util.Arrays;
import java.util.Scanner;


public class third {

	public static void main(String[] args) {
		int n=0;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		Arrays.sort(arr);
		System.out.println("Min value : "+arr[0]);
		System.out.println("Max value : "+arr[n-1]);
	}

}

