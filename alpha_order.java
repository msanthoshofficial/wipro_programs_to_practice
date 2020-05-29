package helo;

import java.util.Scanner;

class alpha{
	public String app() {
		char a = 'c';
		char b = 'b';
		if(a<b) {
			return (a+" "+b);
		}
		else{
			return (b+" "+a);
		}
	}
}
public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 alpha obj = new alpha();
		 String ab = obj.app();
		 System.out.println(ab);
		
		
	}

}

