package Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




class Items{
			
		private String itemName;
		private float price;
		private float quantity;
		private char itemType;
		private float tPrice;
		private float saleTax;
		private float finalPrice;
		
		
		
		//constructor
		public Items(String itemName,float price,float quantity,char itemType,float tPrice,float saleTax,float finalPrice) 
		{
			this.itemName=itemName;
			this.price=price;
			this.quantity=quantity;
			this.itemType=itemType;
			this.tPrice=tPrice;
			this.saleTax=saleTax;
			this.finalPrice=finalPrice;
		}
		
		
		
		public static void displayHeading()
		{
			System.out.format("-----------------------------------------------------------------------------------------------");
			System.out.print("\nItem_Name     Price   Quantity  Item_Type   Total_Price   Sales_Tax   Final_Price\n");
			System.out.format("-----------------------------------------------------------------------------------------------");
		}
		
		
		public void display()
		{
			System.out.format("\n%s      %.1f      %.1f       %c         %.1f         %.1f        %.1f",itemName,price,quantity,itemType,tPrice,saleTax,finalPrice);
		}
		
}	
	


public class Ques1 {
	
		
		public static void main(String args[]) throws Exception
		{
			
				List<Items> L1 = new ArrayList<Items>();  //ArrayList
				
				Scanner sc = new Scanner(System.in);
				
				String itemName=null;
				float price= 0;
				float quantity= 0;
				char itemType=0;
				float saleTax=0;
				float finalPrice=0;	
				char ch = 0;
				float tPrice=0;
				
			
				do
				{
					//taking user input
					System.out.println("$$ ENTER ITEM DETAILS $$");
					
					System.out.print("Enter Item Name : ");
					itemName=sc.next();
					
					System.out.print("Enter Price : ");
					price=sc.nextFloat();
					
					System.out.print("Enter Quantity : ");
					quantity=sc.nextFloat();
					
				    System.out.print("Enter Item Type (Raw/Manufactured) : ");
				    itemType=sc.next().charAt(0);
				    
				    
				    
				    tPrice = price*quantity;  
				
				    if(itemType=='R'|| itemType=='r')
					    {
					    	saleTax = tPrice*0.155f;
					    }
				    else if(itemType=='M' || itemType=='m')
					    {
					    	saleTax = tPrice*0.205f;
					    }
				    else
				    {
				    	System.out.println("Invalid Item Type Entered");
				    	break;
				    }
				   
				    finalPrice = tPrice + saleTax;
				    
				  
				    
				    //Creating Object of Items class
				    Items I1 =new Items(itemName,price,quantity,itemType,tPrice,saleTax,finalPrice);
				    
				    //Adding object to List
				    L1.add(I1);
				    
				    
				    System.out.print("Do you want to enter details of any other item (Y/N) :");
				    ch=sc.next().charAt(0);
				        
				    
				} while(ch=='Y'||ch=='y');
				
				
				
				
				Items.displayHeading();
				
				for(Items i : L1)
				{
					i.display();
				}
				
				sc.close();
				
		}


}
