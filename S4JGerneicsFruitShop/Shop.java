package S4JGerneicsFruitShop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		String fruitName="";
		String fruitType="";
		String distributorName="";
		double fruitWeight=0;
		String fruitCategory="";
		String location="";
		String expiryDate="";
		int quantity=0;
		double cost=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Fruits Details to Add : ");
		int num=sc.nextInt();
		HashMap<Integer,Envy> hm1=new HashMap<Integer, Envy>();
		HashMap<Integer,Fuji> hm2=new HashMap<Integer, Fuji>();
		HashMap<Integer,Cameo> hm3=new HashMap<Integer, Cameo>();
		AppleCategory AC=new AppleCategory();
		Map m=new HashMap<>();
		for(int i=1;i<=num;i++)
		{
			
			sc.nextLine();
			System.out.println("Enter the Fruit Name : ");
			fruitName=sc.nextLine();
			System.out.println("Enter the Fruit Type : ");
			fruitType=sc.nextLine();
			System.out.println("Enter the Distributor Name : ");
			distributorName=sc.nextLine();
			System.out.println("Enter the Fruit Weight : ");
			fruitWeight=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the Fruit Category : ");
			fruitCategory=sc.nextLine();
			System.out.println("Enter the Location : ");
			location=sc.nextLine();
			System.out.println("Enter the Expiry Date : ");
			expiryDate=sc.nextLine();
			System.out.println("Enter the Quantity : ");
			quantity=sc.nextInt();	
			System.out.println("Enter the Cost : ");
			cost=sc.nextDouble();
			if(i == 1)
			{
				hm1.put(1,new Envy(fruitName, fruitType, distributorName, fruitWeight, fruitCategory, location, expiryDate, quantity, cost,cost*quantity));
				
				
				m.put(1,hm1);
			}
			else if(i==2)
			{
				hm2.put(2,new Fuji(fruitName, fruitType, distributorName, fruitWeight, fruitCategory, location, expiryDate, quantity, cost,cost*quantity));
				m.put(2,hm2);
			}
			else
			{
				hm3.put(3,new Cameo(fruitName, fruitType, distributorName, fruitWeight, fruitCategory, location, expiryDate, quantity, cost,cost*quantity));
				m.put(3,hm3);
			}
			new AppleCategory().getdetails(hm1);
			new AppleCategory().getdetails(hm2);
			new AppleCategory().getdetails(hm3);
			
}
		
}
}

