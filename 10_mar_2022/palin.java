
import java.lang.*;
import java.util.*;

public class palin{

	public boolean chpal(String tmp){
		
		tmp = tmp.toLowerCase();
		String rev = "";
		for(int i=tmp.length()-1;i>=0;i--){
			rev+= tmp.charAt(i);
		}
		System.out.println("The reverse of the String"+rev);
		return rev.equals(tmp);
		
	}

	public static void main(String args[]){
		
		String inp = "";
		Scanner sc = new Scanner(System.in);
		palin obb = new palin();
		
		
		System.out.println("Enter the String");
		inp = sc.nextLine();
		
		if(obb.chpal(inp)){
		System.out.println("The entered string is a palindrome :)");
		}
		else{
		System.out.println("The entered string is not a palindrome :(");
		}
		
	}
}
