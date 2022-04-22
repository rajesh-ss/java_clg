import java.util.*;

public class Seller {

	
	private String Name_of_oraganization;
	private String Address;
	private String Seller_category;
	private String Organization_ID;
	private String Email_ID;
	private String Website_url;
	private int No_of_Items;
	private long Phone_number;


	private ArrayList<Items> damagedItems = new ArrayList<Items>(); 
	private ArrayList<Items> products = new ArrayList<Items>(); 
	
	private static String regexpPh = "^\\d{10}$";
	private static String regexpEmail = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	
	Seller(String Name_of_oraganization, int No_of_Items, long Phone_number, String Address, String Seller_category, String Organization_ID, String Email_ID, String Website_url){

		this.Name_of_oraganization = Name_of_oraganization;
		this.No_of_Items = No_of_Items;
		this.Phone_number = Phone_number;
		this.Address = Address;
		this.Seller_category = Seller_category;
		this.Organization_ID = Organization_ID;
		this.Email_ID = Email_ID;
		this.Website_url = Website_url;

		//Seller("print");
	}

	public Seller(){
		Name_of_oraganization = null;
		No_of_Items = 0;
		Phone_number = 0;
		Address = null;
		Seller_category = null;
		Organization_ID = null;
		Email_ID = null;
		Website_url = null;
	}

	public Seller(String option){
			if(option.equals("print")){
				System.out.println("Name_of_oraganization: "+Name_of_oraganization);
				System.out.println("No_of_Items: "+No_of_Items);
				System.out.println("Phone_number: "+Phone_number);
				System.out.println("Address: "+Address);
				System.out.println("Seller_category: "+Seller_category);
				System.out.println("Organization_ID: "+Organization_ID);
				System.out.println("Email_ID: "+Email_ID);
				System.out.println("Website_url: "+Website_url);
			}	
	}
	
	
	/*
	 *	 All the getters and setters for the data members that are private 
	 */
	public String getName_of_oraganization() {
		return Name_of_oraganization;
	}
	public void setName_of_oraganization(String name_of_oraganization) {
		Name_of_oraganization = name_of_oraganization;
	}
	public long getPhone_number() {
		return Phone_number;
	}
	public void setPhone_number(long phone_number) {
		Phone_number = phone_number;
	}
	public String getSeller_category() {
		return Seller_category;
	}
	public void setSeller_category(String seller_category) {
		Seller_category = seller_category;
	}
	public String getOrganization_ID() {
		return Organization_ID;
	}
	public void setOrganization_ID(String organization_ID) {
		Organization_ID = organization_ID;
	}
	public String getEmail_ID() {
		return Email_ID;
	}
	public void setEmail_ID(String email_ID) {
		Email_ID = email_ID;
	}
	public String getWebsite_url() {
		return Website_url;
	}
	public void setWebsite_url(String website_url) {
		Website_url = website_url;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getNo_of_Items() {
		return No_of_Items;
	}
	public void setNo_of_Items(int no_of_Items) {
		No_of_Items = no_of_Items;
	}
	
	/*
	 * 	Others functions
	 */
	
	public boolean IsEMailValid() {
		return Email_ID.matches(regexpEmail);
	}

	public boolean IsPhValid(){
		String tmp = Long.toString(Phone_number);
		return tmp.matches(regexpPh);
	}

	public void addDamItems(Items item){
		
		damagedItems.add(item);
	}

	public void DisplayDamItems(Items item){

		for (int i = 0; i < damagedItems.size(); i++) {
			System.out.println(damagedItems.get(i));
    	}
	}

}
