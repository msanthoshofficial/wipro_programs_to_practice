package helo;

import java.util.Scanner;

class alpha{
	public String app(String gend,String age) {
		int agee = Integer.parseInt(age);
		if(gend.equalsIgnoreCase("Female") && (agee>=1 && agee<=58) ) {
			return "Interest = 8.2%";
		}
		else if(gend.equalsIgnoreCase("Female") && (agee>=59 && agee<=120)) {
			return "Interest = 7.6%";
		}
		else if(gend.equalsIgnoreCase("Male") && (agee>=1 && agee<=60)) {
			return "Interest = 9.2%";
		}
		else if(gend.equalsIgnoreCase("Male") && (agee>=61 && agee<=120)) {
			return "Interest = 8.3%";
		}
		else {
			return"Enter a valid input ";
		}
	}
}
public class third {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		 String gend = args[0];
		 String age = args[1];
		 System.out.println(args[0]+" "+args[1]);
		 alpha obj = new alpha();
		 String ab = obj.app(gend,age);
		 System.out.println(ab);
		
		
	}

}

