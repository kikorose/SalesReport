package ProduceASalesReport;

import java.util.Scanner;

public class SalesReport {
	private static Scanner scan;

	public static void main(String[] args) {

		int custNum; 
		String custName; 
		double salesAmt; 
		int taxCode; 
		double totalDue = 0.00; 
		double salesTax = 0.00;
		String HEADING = "Sales Report"; 

		scan = new Scanner(System.in); 
		
		// customer's number 
		System.out.println("What is the customer's number?"); 
		custNum = scan.nextInt();
		
		//get customer's name scan.nextLine();
		System.out.println("What is the customer's name? "); 
		custName = scan.nextLine(); 
		
		//get sales amount
		System.out.println("What is the sales amount?");
		salesAmt = scan.nextDouble();
		
		//get tax code
		System.out.println("What is their tax code?"); 
		taxCode = scan.nextInt();
		
		// switch statement to determine which sales tax 
		switch(taxCode) { 
		case 0:  // tax exempt 
		
		salesTax = 0.00; totalDue = salesAmt + salesTax; 
		break; 
		
		case 1: salesTax = salesAmt * 0.03; totalDue = salesAmt + salesTax;
		break; 
		
		case 2: salesTax = salesAmt * 0.05; totalDue = salesAmt + salesTax; 
		break;
		
		} 
		
		System.out.println(HEADING);
		
		System.out.println(custNum + " " + custName + " $" + salesAmt + " $" + salesTax + " $" + totalDue);
	     
	     } 
       
       }
     
    
   




