import java.util.*;


public class pattern{

	public void floy(){
	
		int val = 1;
		for(int i=5;i>0;i--){
			for(int j=i;j<5;j++){
				System.out.print(val+" ");
				val++;
			}
			System.out.println();
		}
		System.out.println("");
	}
	
	public void pyramid(){
	
    int rows = 5, tmp = 0, count = 0, count1 = 0;

    for (int i = 1; i <= rows; i++) {
      for (int sp = 1; sp <= rows - i; sp++) {
        System.out.print("  ");
        count++;
      }

      while (tmp != 2 * i - 1) {
        if (count <= rows - 1) {
          System.out.print((i + tmp) + " ");
          count++;
        } else {
          count1++;
          System.out.print((i + tmp - 2 * count1) + " ");
        }

        tmp++;
      }
      count1 = 0;
      count = 0; 
      tmp = 0;

      System.out.println();
    }
	}
	

	public static void main(String args[]){
		
		pattern obb = new pattern();
		obb.floy();
		obb.pyramid();
		
	}
}
