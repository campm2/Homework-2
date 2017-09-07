/* ========================================================================== */
/*	PROGRAM Stock Transaction Simulator 

    AUTHOR: Megan Camp, Mercedes Kent
    COURSE NUMBER: CIS 210
    COURSE SECTION NUMBER: 02
    INSTRUCTOR NAME: Dr.Tian
    PROJECT NUMBER: 2 
    DUE DATE: 09/07/2017

SUMMARY
The amount of money Tian paid for the stock.
The amount of commission Tian paid his broker when he bought the stock.
The amount that Tian sold the stock for.
The amount of commission Tian paid his broker when he sold the stock
 Display the amount of profit that Tian made after selling his stock and paying the two
commissions to his broker (If the amount of profit that your program displays is a negative number , then Tian lost money on the transaction)

INPUT
Numbers of shares to buy (an integer)
Price to be bought (a real number)
Number of shares to sell (an integer)
Price to be sold (a real number) 
The users name

OUTPUT
The name 
The number of shares you want to purchase
Purchase price
The number of shares you want to sell
Sold price


ASSUMPTIONS
-When asked for the name, the user types in character rather than variable
 

/* MAIN FUNCTION */
import java.util.Scanner;

public class StockTransactionSimulator{
   public static void main(String [] args){ 
	   int numShares= 0;
	   double price_Per_Share= 0;
	   int num_Shares_Sold=0;
	   double priceSoldStock;
	   final double comm=.02;
	   String name= "";
	   double brokerFee=0;
	   double brokerFeeSharesSold=0;
	   double brokerProfit=0;
	   
	   
	   
	   //create an scanner object for read in values from the user
	   Scanner keyboard = new Scanner(System.in);
	   
	   //Read in name
	   System.out.print("Please enter your name: ");
	   name=keyboard.nextLine();
	   
	   //Read in the number of shares to purchase
	   System.out.print("The number of shares you want to purchase: ");
	   numShares=keyboard.nextInt();
	   
	   //Read in Purchase Price
	   System.out.print("Purchase price: ");
	   price_Per_Share=keyboard.nextDouble();
	   
	   //Read in Number of shares to sell
	   System.out.print("The number of shares you want to sell: ");
	   num_Shares_Sold=keyboard.nextInt();
	   
	   //Read in Sold Price
	   System.out.print("Sold price: ");
	   priceSoldStock=keyboard.nextDouble();
	   
	   //Calculate Broker fee when purchasing shares
	   brokerFee=(price_Per_Share*numShares)*comm;
	   
	   //Calculate Broker fee when shares were sold
	   brokerFeeSharesSold= (priceSoldStock*num_Shares_Sold)*comm;
	   
	   //Add the broker fee from purchasing shares and the broker fee from selling shares
	   brokerProfit=(priceSoldStock-brokerFee-brokerFeeSharesSold-price_Per_Share);
	   
	    
	   System.out.print(name + " has purhcased " + numShares + " at $" + price_Per_Share + 
			   " and then sold " + num_Shares_Sold + " at $" + priceSoldStock + ". He paid $" 
			   +brokerFee + " for broker fee when buying the stock and $" + brokerFeeSharesSold 
			   + " for broker fee when selling the stock. So his profit is $"+ brokerProfit + ".");
	   System.out.println("Goodbye");
	   //close input
	 
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
			   
   }
	   
   
	   
   }