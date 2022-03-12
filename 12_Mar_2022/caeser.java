import java.util.*;
import java.io.*;

class caeser{
	
	void encr(String txt, int n){
		
		int len = txt.length();
		char temp = 'a';
		char[] chArr = new char[len];
		
		// convert text to arr
		
		for(int i=0; i<len; i++){
			chArr[i] = txt.charAt(i);
		}
		
		for(int i=0; i<len; i++){
			temp = txt.charAt(i);
			for(int j=0; j<n; j++){
				temp++;
			}
			chArr[i] = temp;
		}
		
		txt = "";
		
		for(int i=0; i<len; i++){
			txt+=chArr[i];
		}
		
		System.out.println(txt);
	}

	public static void main( String args[]){
	
		caeser obb = new caeser();
		Scanner sc = new Scanner(System.in);
		String inp = "";
		int n=3;
		
		
		System.out.println("Enter your text");
		inp = sc.nextLine();
		
		inp = inp.toLowerCase();
		//System.out.println(inp);
		obb.encr(inp, n);
	}
}
