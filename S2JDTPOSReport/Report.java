package S2JDTPOSReport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Report {
	public static void main(String[] args) {
		String category,description;
		int count,cost;
		Scanner sc  = new Scanner(System.in);	
		 System.out.println("Enter Your Customer Id");
		int cid = sc.nextInt();
		List<ProductRep> itemList = new ArrayList<ProductRep>(); 
		 System.out.println("Enter The Item to be Added in your List:");
		int n = sc.nextInt();
		
		for(int i= 0; i< n ;i++)
		{
			 System.out.println("Enter the Category");
			category = sc.next();
			 System.out.println("Enter the Description:");
			description = sc.next();
			 System.out.println("Enter The Count");
			count= sc.nextInt();
			 System.out.println("Enter The Cost");
			cost= sc.nextInt();
			
			itemList.add(new ProductRep(i+1, category, description, count, cost));
		}
		ReportMain rm = new ReportMain();
		
		rm.Display(itemList, cid);

}
}
