package helo;

import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("positive number");
		}
		else if(a<0) {
			System.out.println("Negative number");
		}
		else {
			System.out.println("Zero");
		}
		
	}

}
