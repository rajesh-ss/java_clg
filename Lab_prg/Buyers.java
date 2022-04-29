import java.util.ArrayList; 

public class Buyers {
	
	private String Buyer_address;
	private String Buyer_name;
	private int Buyer_Age;
	private double Buyer_phone;
	private String Buyer_Items_ID;
	private int Buyer_pincode;
	private double Buyer_alternate_phone;
	private String Buyer_alternate_Address;
	
	// The buyers items- it's object of items
	private ArrayList<Items> itemsObj = new ArrayList<Items>();
	
	
	public String getBuyer_address() {
		return Buyer_address;
	}
	public void setBuyer_address(String buyer_address) {
		Buyer_address = buyer_address;
	}
	public String getBuyer_name() {
		return Buyer_name;
	}
	public void setBuyer_name(String buyer_name) {
		Buyer_name = buyer_name;
	}
	public double getBuyer_phone() {
		return Buyer_phone;
	}
	public void setBuyer_phone(double buyer_phone) {
		Buyer_phone = buyer_phone;
	}
	public int getBuyer_Age() {
		return Buyer_Age;
	}
	public void setBuyer_Age(int buyer_Age) {
		Buyer_Age = buyer_Age;
	}
	public String getBuyer_Items_ID() {
		return Buyer_Items_ID;
	}
	public void setBuyer_Items_ID(String buyer_Items_ID) {
		Buyer_Items_ID = buyer_Items_ID;
	}
	public int getBuyer_pincode() {
		return Buyer_pincode;
	}
	public void setBuyer_pincode(int buyer_pincode) {
		Buyer_pincode = buyer_pincode;
	}
	public double getBuyer_alternate_phone() {
		return Buyer_alternate_phone;
	}
	public void setBuyer_alternate_phone(double buyer_alternate_phone) {
		Buyer_alternate_phone = buyer_alternate_phone;
	}
	public String getBuyer_alternate_Address() {
		return Buyer_alternate_Address;
	}
	public void setBuyer_alternate_Address(String buyer_alternate_Address) {
		Buyer_alternate_Address = buyer_alternate_Address;
	}

	public buyItem(Items item){
		itemsObj.add(item);
	}

	public cancelItem(String Item_ID{
		     		
		 for (int i = 0; i < itemsObj.size(); i++) {
			
			if(item_ID.equals(itemsObj.get(i))){
				itemsObj.remove(i);
			}
    	}
	}

	public void buyerItemsHis(){

		System.out.println("your overall item purchases are\n");
		
		for (int i = 0; i < itemsObj.size(); i++) {
			System.out.println(itemsObj.get(i));
    	}
		
	}

}
