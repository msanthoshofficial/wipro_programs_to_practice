package helo;

import java.util.ArrayList;
import java.util.List;



public class pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="World Wide";
		s=s.toLowerCase();
		List<Integer> a = new ArrayList<Integer>();
		String[] formst = s.split(" ");
		//int[] arr=new int[10];
		for(String elm : formst) {
			int len = elm.length();
			int sum =0;
			//int k=0;
			if(len%2==0) {
				for(int i=0;i<(len/2);i++) {
					for(int j=len-1;j>(len/2)+1;j--) {
						sum+=Math.abs(elm.charAt(i)-elm.charAt(j));
						//arr[k]=sum;
						//k+=1;
						a.add(sum);
						//System.out.println(sum);
					}
				}
			}
			else if(len%2!=0) {
				for(int i=0;i<(len/2);i++) {
					for(int j=len-1;j>len/2;j--) {
						//System.out.println(Math.abs(elm.charAt(i)-elm.charAt(j)));
						sum+=Math.abs(elm.charAt(i)-elm.charAt(j));
						sum+=elm.charAt(len/2);
						a.add(sum);
						//System.out.println(Math.abs(elm.charAt(i)-elm.charAt(j)));
					}
				}
			}
			
		}
for(int m=0;m<a.size();m++) {
	System.out.println(a.get(m));
	}
	}

}
