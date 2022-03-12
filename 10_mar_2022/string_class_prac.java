import java.io.*;
import java.util.*;

public class string_class_prac{

	
	public String usingPlusOp(String oneStr, String twoStr){
		return oneStr+twoStr+twoStr+oneStr;
	}
	
	public static void main(String args[]) throws IOException{
		
		String inpDataOne = "ahh";
		String inpDataTwo = "haa";
		Scanner sc = new Scanner(System.in);
		
		String_calss_prac obb = new String_calss_prac();
		
		System.out.println(usingPlusOp(inpDataOne, inpDataTwo));
		
	}

}
