class coza{
	
	void cozaOwza(){
		
		int count = 1;
		for(int i=1; i<=110; i++){
			
			if(count<=11){
			
				if(i%3 == 0){
					System.out.print("mulOf:3="+i+":"+"Coza\t");	
				}
				if(i%5 == 0){
					System.out.print("mulOf:5="+i+":"+"Loza\t");
				}
				if(i%7 == 0){
					System.out.print("mulOf:7="+i+":"+"Woza\t");
				}
				count++;
			}
			else{
				System.out.println("\n");
				count = 1;
			}
		}
	}

	public static void main( String args[]){
	
		coza obb = new coza();
		obb.cozaOwza();
	}
}
