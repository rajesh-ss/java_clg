
import java.util.*;

abstract class Employee {

	 String Employee_ID;
	 String Employee_name;
	 String Employee_Department;
	 String Employee_Adress;
	 int Employee_age;
	 int Employee_experience;
	 double Employee_phone;
	 Date Employee_date_of_birth;
	 double Employee_salary;
	 String Employee_Designation;

	 Employee(String Employee_ID,String Employee_name, String Employee_Department,String Employee_Adress){

      this.Employee_ID = Employee_ID;
	  this.Employee_name = Employee_name;
	  this.Employee_Department = Employee_Department;
	  this.Employee_Adress = Employee_Adress;
	 }
	
/*	public static String Employee_company = "";
	
    	Employee(){
		Employee_ID = null;
		Employee_name = null;
		Employee_Department = null;
		Employee_Adress = null;
		Employee_age = 0;
		Employee_experience = 0;
		Employee_phone = 0;
		Employee_date_of_birth = null;
	}
	*/
	
	public abstract String getEmployee_ID();
	public abstract void setEmployee_ID(String employee_ID);
	public abstract String getEmployee_name();
	public abstract void setEmployee_name(String employee_name) ;
	public abstract String getEmployee_Department();
	public abstract void setEmployee_Department(String employee_Department);
	public abstract String getEmployee_Adress();
	public abstract void setEmployee_Adress(String employee_Adress);
	public abstract int getEmployee_age() ;
	public abstract void setEmployee_age(int employee_age) ;
	public abstract int getEmployee_experience() ;
	public abstract void setEmployee_experience(int employee_experience) ;
	public abstract double getEmployee_phone();
	public abstract void setEmployee_phone(double employee_phone);
	public abstract Date getEmployee_date_of_birth();
	public abstract void setEmployee_date_of_birth(Date employee_date_of_birth) ;
	public abstract void setEmployee_salary(double Employee_salary);
	public abstract double getEmployee_salary();

}
