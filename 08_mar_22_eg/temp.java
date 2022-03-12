import java.io.*;
import java.util.*;



public class temp{


	/*
	* sleeper return true if it's weekday and vacation is true
	* returns false if weekday and vacation is false
	*/

	public boolean sleeper(boolean weekday, boolean vacation){
/*		if(weekday && vacation){
			//System.out.println("sleep");
			return true;
		}
		else if(!vacation && weekday){
			//System.out.println("no sleep");
			return false;
		}*/
		
		return (weekday||!vacation)?true:false;
	}
	
	/*
	* Main function
	*/
	public static void main(String args[] ){
		
		
		// variables initialisation
		boolean vacation = true, weekday = true;
		temp obb = new temp();
		Scanner sc = new Scanner(System.in);
		int usrInp = 0;
		 
		 
		/*
		* print option to the user
		*/
		System.out.println("\nEnter 1. if your are not on vacation and it's a weekday");
		System.out.println("\nEnter 2. if your are not on weekday and not on vacation");
		System.out.println("\nEnter 3. if your are on vacation and it's weekday");
		System.out.println("\nEnter 4. if your are on vacation and it's not a weekday");
		System.out.println("\nEnter your option:");
		
		// validating the user input
		try{
		usrInp = sc.nextInt();
		}
		catch(Exception e){
			System.out.println("Invalid input\n"+e);
		}	
		
		
		switch(usrInp){	
			case 1:
				vacation = false;
				weekday = true;
				break;
			case 2:
				vacation = false;
				weekday = false;
				break;
			case 3: 
				vacation = true;
				weekday = true;
				break;
			case 4:
				vacation = true;
				weekday = false;
				break;
		}
		
		//System.out.println(obb.sleeper(false, true));
		
		if(obb.sleeper(weekday, vacation)){
			System.out.println("sleeping :)");
		}
		else if(!obb.sleeper(weekday, vacation)){
			System.out.println("not sleeping :(");
		}
	
	
	}

}
