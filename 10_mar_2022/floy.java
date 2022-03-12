import java.util.*;


public class pattern{

	public void floy(){
	
		int val = 1;
		for(int i=5;i>0;i--){
			for(int j=i;j<5;j++){
				System.out.print(val);
				val++;
			}
			System.out.println();
		}
	}

	public static void main(String args[]){
		
		pattern obb = new pattern();
		obb.floy();
		
	}
}
