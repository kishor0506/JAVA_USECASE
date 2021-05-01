package S2JDTPOSReport;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReportMain {
	public int Total(int cost, int count)
	{
		int total = cost * count;
		return total;
	}
	
	public void Display(List<ProductRep> itemlist , int custid)
	{	
	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		int total =0;
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("\t\t\t\t  VIVASA Mart ");
		System.out.println("\t\t\t 123 Avenue CA Districe ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Customerid :" + custid);
		System.out.println("Date       :" + dtf.format(now));
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Id \tCategory\tDescription\tCount\t\tcost");
		for(ProductRep i:itemlist)
		{
			System.out.println(i.getId()+"\t"+i.getCategory()+"\t\t"+i.getDescription()+"\t\t"+i.getCount()+
					"\t\t"+i.getCost());
			total = total + Total(i.getCost(), i.getCount());
		}
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t--------------");
		System.out.println("\t\t\t\t\t\t Total \t" +total);
		float gst= (float) (0.12 * total);
		System.out.println("\t\t\t\t\t\t-----------------");
		System.out.println("\t\t\t\t\t\t S GST(6%) "+gst /2);
		System.out.println("\t\t\t\t\t\t-----------------");
		System.out.println("\t\t\t\t\t\t C GST(6%) "+gst /2);
		System.out.println("\t\t\t\t\t\t----------------");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t----------------");
		System.out.println("\t\t\t\t\t Grand Total:   " +(total + gst));
		System.out.println("\t\t\t\t\t\t----------------");
		
	}
}


