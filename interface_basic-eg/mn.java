


import java.util.*;
import java.lang.*;



interface animal{

	public static final String type = "Land Animal";
	public abstract void speak();
}


class cow implements animal{

	public void speak(){
		System.out.println("moww moww ....");
	}
}


class dog implements animal{
	
	public void speak(){
		System.out.println("bow bow ....");
	}
}
class mn{

public static void main(String args[]) throws Exception{

	animal obj = new cow();
	obj.speak();
	animal objw = new dog();
	objw.speak();
	
	// anonumos function
	animal obj1 = new animal(){
	
		public void speak(){
			System.out.println("I am annonymous function !!!!!!!!!.....*-*");
		}
	};
	obj1.speak();
}
}
