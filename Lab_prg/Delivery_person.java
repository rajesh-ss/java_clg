import java.util.*;



public class Delivery_person extends Employee{

	private String gender;
	private String veh_no;
	private int no_of_delivery;
	private int pending_delivery;
	private double phone_number;
	//private Date dOB;
	

	Delivery_person(String Employee_ID ,String Employee_name, String Employee_Department,String Employee_Adress,
	int no_of_delivery, int pending_delivery){
       

	   // super key-word for overriding
	   super(Employee_ID, Employee_name, Employee_Department, Employee_Adress);

		//this.Employee_ID = Employee_ID;
		//this.Employee_name = Employee_name;
		//this.Employee_Department = Employee_name;
		//this.Employee_Adress = Employee_Adress;
		this.no_of_delivery = no_of_delivery;
		this.pending_delivery = pending_delivery;

	}


	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}

	public String getVeh_no(){
		return veh_no;
	}
	public void setVeh_no(){
		this.veh_no = veh_no;
	}
	public int getNoOfDelivery(){
		return no_of_delivery;
	}
	public void setNoOfDelivery(){
		this.no_of_delivery = no_of_delivery;
	}
	public int getPendingDelivery(){
		return pending_delivery;
	}
	public void setPendingDelivery(){
		this.pending_delivery = pending_delivery;
	}
	public double getPhoneNumber(){
		return phone_number;
	}
	public void setPhoneNumber(){
		this.phone_number = phone_number;
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
