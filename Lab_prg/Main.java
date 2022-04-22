import java.io.*;



class Main {

    // static block for printing welcome msg
    static{

        System.out.print("\n\n");
        System.out.print("Welcome to the Supply chain Service :)");

    }


        
    public  Items[] addItems() throws Exception{
        
        Items[] item = new Items[4];
        item[0] = new Items("laptop", "hp", "electronics", "BFPO-1520-0326", "ABCD-1234-5698",new StringBuffer("hp main manufacturing center, mumbai"), new StringBuffer("shanthi nagar, bangalore"), 1.05, 45000.0);
        item[1] = new Items("laptop", "lenova", "electronics", "BFPO-1520-0589", "IJKL-5678-1234",new StringBuffer("Lenova main manufacturing center, Bangalore"), new StringBuffer("jayanagar, bangalore"), 2.85, 55000.0);
        
        // calling constructor --> for constructor overloading 
        item[2] = new Items();


        //item[0].checkItemFinalPrice();
        return item;
    }


    //static class 
    static class search{
        
    // create seller array of object

    public static Seller[] addSeller_det(){


        Seller[] seller = new Seller[4];
        seller[0] = new Seller("Hp", 6, 1234567890, "hp main manufacturing center, mumbai", "Electronics", "ABCD-1234-5698", "hpWorld@gmail.com", "www.hpWorld.com" );
        seller[1] = new Seller("Lenova", 15, 1247856398, "Lenova main manufacturing center, Bangalore", "Electronics", "IJKL-5678-1234", "lenova@gmail.com", "www.Lenova.com" );
        seller[2] = new Seller("trends", 10, 1547896120, "trends main manufacturing center, chennai", "clothing", "2569-ALOP-2489", "trendz@gmail.com", "www.trendsclothing.come");
        seller[3] = new Seller("Bata", 05, 1179546230, "bata main manufacturing center, mumbai", "Footware", "7845-1234-5679", "bata@gmail.com", "www.bata.come");

        return seller;
    }

    // function overloading
    // search the seller by his organization 
    
    public static void SellerSearch(Seller[] seller, String sellerName){

        // for case insensitive
        sellerName = sellerName.toLowerCase();
            
        for(int i=0; i<4; i++){
            if (seller[i].getName_of_oraganization().toLowerCase().equals(sellerName)){
                System.out.println("The seller organization exists:"+seller[i].getName_of_oraganization());
                System.out.print("\n");
                return;
            }
        }

        System.out.println("The seller doesn't exist");
    }

    // search the seller by his number
    public static void SellerSearch(Seller[] seller, long phoneNumber)  {

        for(int i=0; i<4; i++){
            if (seller[i]. getPhone_number() == phoneNumber){
                System.out.println("The seller organization exists:"+seller[i].getName_of_oraganization());
                System.out.print("\n");
                return;
            }
        }

        System.out.println("The seller doesn't exist");

    }

    // search the seller by his ID last 4 digits
    public static void SellerSearch(Seller[] seller, int ID){

            int tmp = 0;

            for(int i=0; i<4; i++){

              // extract last 4 digit from a string
              tmp =  Integer.parseInt(seller[i].getOrganization_ID().substring(seller[i].getOrganization_ID().length()-4));
              
            if (tmp == ID){
                System.out.println("The seller organization exists:"+seller[i].getName_of_oraganization());
                System.out.print("\n");
                return;
            }
        }

        System.out.println("The seller doesn't exist");
    }

    }


  
    public static void main(String[] args) throws Exception{



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main mn = new Main();
        int option = 0;
        String orgaName = null;
        long ph = 0;
        int ID = 0;
        Seller[] seller = new Seller[4];
        Items[] item = new Items[4];
        seller = search.addSeller_det();
        item = mn.addItems();

        System.out.println("Select the option from the menu");
        System.out.println("1. For displaying all the seller\n2. search the seller by name\n3. search the seller by phone number\n4. search the seller by ID\n5. To check product price\n6. To change Item's destination address");

        option = Integer.parseInt(br.readLine());

        switch(option){

            case 1:
                    System.out.println("The sellers are ");
                    for(int i=0; i<4; i++){
                        System.out.println(i+". "+seller[i].getName_of_oraganization());
                    }
                    break;
            case 2: 
                    System.out.println("Enter the organization name");
                    orgaName = br.readLine();
                    search.SellerSearch(seller, orgaName);
                    break;
            case 3:
                    System.out.println("Enter the organization phone number");
                    ph = Long.parseLong(br.readLine());
                    search.SellerSearch(seller, ph);
                    break;
            case 4:
                    System.out.println("Enter the organization ID");
                    ID = Integer.parseInt(br.readLine());
                    search.SellerSearch(seller, ID);
                    break;
            case 5:
                    item = mn.addItems();
                    break;

            case 6:

                String item_id = "";
/*                 System.out.println("Enter fo which item you ean to change the destination address");
                for(int i=0; i< 4; i+=1){
                    System.out.println("Item Name:\t"+item[i].getItem_name());
                    System.out.println("Item ID:\t"+item[i].getItem_ID());
                } */
                System.out.println("Enter the Item ID for which you have to change the destination address");
                item_id = br.readLine();
                for(int i=0; i< 2; i+=1){
                    if(item_id.equals(item[i].getItem_ID())){
                        System.out.println("Item Name:\t"+item[i].getItem_name());
                        System.out.println("Item ID:\t"+item[i].getItem_ID());
                        item[i].changeDestinationAddress();
                        System.out.println("The address is changed !!");
                        System.out.println("The updated address is: "+item[i].getAddress_destination());
                    } 

                }
               
                break;
            default:
                System.out.println("You have entered invalid option :/");
        }       
    }
}