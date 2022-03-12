/*
* Write a prg to create a class named complex
* two var -->
*       1) real 
*       2) img
* methods --> 
*	1) add()
*	2) subtract()      
*	3) Display()
*/

class complex{
	
	// var dec
	int real;
	int img;
	int result;
	
	
	/*
	* parameterised constructors
	*/
	complex(int real, int img, int result){
		this.real = real;
		this.img = img;
		this.result = result;
	}
	
	/*
	* add methods: add the complex numbers
	*/
	void add(complex obb){
		
		//System.out.println(obb.real);
		this.real = obb.real + this.real;
		this.img = obb.img + this.img;
		//System.out.println(real);
	}
	
	/*
	* sub methods: subtract the complex numbers
	*/
	void sub(complex obb){
	
		this.real = obb.real - this.real;
		this.img = obb.img - this.img;
	}
	
	/*
	* Display methods: displays the result of the complex number
	*/
	void display(complex obb){
		
		System.out.println("The complex number is: "+Integer.toString(real)+" + "+Integer.toString(img)+" j");
	}
	
	/*
	* Main method
	*/
	
	public static void main(String args[]){
		
		
		complex obj = new complex(0, 0, 0);
		
		complex objIns = new complex(0, 0, 0);
		objIns.real = 20;
		objIns.img = 50;
		
		obj.add(objIns);
		//obj.sub(objIns);
		obj.display(objIns);
	}	

}
