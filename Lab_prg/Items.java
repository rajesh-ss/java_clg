import java.io.*;  


public class Items { 

	
	private String Item_name;
	private String Item_seller;
	private String Item_category;
	private String Item_ID;
	private String seller_ID;
    private final int GST_per = 18; 
	
	//private String Buyer_ID;
	private StringBuffer Adress_origin;
	private StringBuffer Address_destination;
	private double Item_weight;
	private double Item_price;
		
	public final String Item_standards = "ISO-9001-2000";


	

	// Constructor chaining (default constructor will initialise default values)
	public Items(){
		this("", "", "", "", "", null, null, 0.0, 0.0);
	}

    // we don't want to alter the gst price and don't want inherited classes to access this 
	final void cal_pr(double Item_price){
        this.Item_price = (Item_price * (GST_per)/100) + Item_price;
	}


	public Items(String Item_name, String Item_seller, 
	String Item_category, String Item_ID, String Seller_ID,
	StringBuffer Adress_origin, StringBuffer Address_destination, double Item_weight, double Item_price){
		
		this.Item_name = Item_name;
		this.Item_seller = Item_seller;
		this.Item_category = Item_category;
		this.Item_ID = Item_ID;
		this.seller_ID = seller_ID;
		this.Adress_origin = Adress_origin;
		this.Address_destination = Address_destination;
		this.Item_weight = Item_weight;
		cal_pr(Item_price);
		//this.Item_price = (Item_price * (GST_per)/100) + Item_price;
	}

	public String getItem_name() {
		return Item_name;
	}
	public void setItem_name(String item_name) {
		Item_name = item_name;
	}
	public String getItem_seller() {
		return Item_seller;
	}
	public void setItem_seller(String item_seller) {
		Item_seller = item_seller;
	}
	public double getItem_price() {
		return Item_price;
	}
	public void setItem_price(double item_price) {
		Item_price = item_price;
	}
	public String getItem_category() {
		return Item_category;
	}
	public void setItem_category(String item_category) {
		Item_category = item_category;
	}
	public String getItem_ID() {
		return Item_ID;
	}
	public void setItem_ID(String item_ID) {
		Item_ID = item_ID;
	}
	
	public String getseller_ID() {
		return seller_ID;
	}
	public void setSeller_ID(String seller_ID) {
		this.seller_ID = seller_ID;
	} 

	public StringBuffer getAdress_origin() {
		return Adress_origin;
	}
	public void setAdress_origin(StringBuffer adress_origin) {
		Adress_origin = adress_origin;
	}
	public StringBuffer getAddress_destination() {
		return Address_destination;
	}
	public void setAddress_destination(StringBuffer address_destination) {
		Address_destination = address_destination;
	}


	public void changeDestinationAddress() throws Exception{

		StringBuffer add;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("The Existing address is "+getAddress_destination());
		System.out.println("Enter the new Address:\t");
		//add = br.readLine();
		StringBuffer sb=new StringBuffer(br.readLine());
		setAddress_destination(sb);
	}

	// used for package price finalising the items price

	public void checkItemFinalPrice() throws Exception{
		
		boolean isFragile;
		String packageLevel;

   		InputStreamReader r=new InputStreamReader(System.in);    
   		BufferedReader br=new BufferedReader(r);        


		System.out.println("Enter which packing you want\nA. level-A package\nB. level-B package\n3. normal package");
		packageLevel = br.readLine();
		
		System.out.println("Is your item fragile");
		isFragile = Boolean.parseBoolean(br.readLine());


		

		if(packageLevel.toLowerCase().equals("a") || packageLevel.toLowerCase().equals("b")){
			packagingPriceupdate(packageLevel, Item_weight, isFragile);
		}
		else{
			packagingPriceupdate(isFragile, Item_weight);
		}
		
	}

	public void packagingPriceupdate(String packageLevel, double weight,boolean isFragile){

			System.out.println("Inside the package update function");
			if(packageLevel.equals("A") || packageLevel.equals("a")){
				if(isFragile){
					System.out.println(this.Item_price);
					this.Item_price+=120.0;
					System.out.println(this.Item_price);
				}
				else{
					System.out.println(Item_price);
					Item_price+=110.0;
					System.out.println(Item_price);
				}

			}
			else if(packageLevel.equals("B") || packageLevel.equals("b")){
				if(isFragile){
					Item_price+=110;
					System.out.println(Item_price);
				}
				else{
					Item_price+=100;
					System.out.println(Item_price);
				}
			}
	}

	public void packagingPriceupdate(boolean isFragile, double weight){

			if(isFragile){
				if(weight <= 2.0){
					Item_price+=40;
				}
				else if(weight > 2.0 && weight <= 10.0 ){
					Item_price+=50;
				}
				else if(weight>10.0){
					Item_price+=60;
				}
				
			}
			else{
					
				if(Item_weight <= 2.0){
					Item_price+=20;
				}
				else if(Item_weight > 2.0 && Item_weight <= 10.0 ){
					Item_price+=35;
				}
				else if(Item_weight>10.0){
					Item_price+=50;
				}
			}
	}
	
}
