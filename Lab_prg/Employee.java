
import java.util.*;

public class Employee {

	private String Employee_ID;
	private String Employee_name;
	private String Employee_Department;
	private String Employee_Adress;
	private int Employee_age;
	private int Employee_experience;
	private double Employee_phone;
	private Date Employee_date_of_birth;
	private double Employee_salary;
	private String Employee_Designation;
	
	public static String Employee_company = "";
	
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
	
	
	public String getEmployee_ID() {
		return Employee_ID;
	}
	public void setEmployee_ID(String employee_ID) {
		Employee_ID = employee_ID;
	}
	public String getEmployee_name() {
		return Employee_name;
	}
	public void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}
	public String getEmployee_Department() {
		return Employee_Department;
	}
	public void setEmployee_Department(String employee_Department) {
		Employee_Department = employee_Department;
	}
	public String getEmployee_Adress() {
		return Employee_Adress;
	}
	public void setEmployee_Adress(String employee_Adress) {
		Employee_Adress = employee_Adress;
	}
	public int getEmployee_age() {
		return Employee_age;
	}
	public void setEmployee_age(int employee_age) {
		Employee_age = employee_age;
	}
	public int getEmployee_experience() {
		return Employee_experience;
	}
	public void setEmployee_experience(int employee_experience) {
		Employee_experience = employee_experience;
	}
	public double getEmployee_phone() {
		return Employee_phone;
	}
	public void setEmployee_phone(double employee_phone) {
		Employee_phone = employee_phone;
	}
	public Date getEmployee_date_of_birth() {
		return Employee_date_of_birth;
	}
	public void setEmployee_date_of_birth(Date employee_date_of_birth) {
		Employee_date_of_birth = employee_date_of_birth;
	}
	public void setEmployee_salary(double Employee_salary){
			this.Employee_salary = Employee_salary;
	}

	public double getEmployee_salary(){
		return Employee_salary;
	}

}
