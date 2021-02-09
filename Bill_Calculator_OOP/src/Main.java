import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) 
    {   

	   //Using scanner to get input from user 
	   Scanner sc = new Scanner(System.in);
  	   
       //Creating object of 
       ComputeElectricityBill b1 = new ComputeElectricityBill();
       
       
       //Using setter to set unites   
       System.out.print("\nEnter number of units:");
       
       long temp = sc.nextLong(); //get value from user using scanner object
       
       b1.setUnits(temp); //set number of units 
       
       System.out.println(""); //for next line space
       
       //Compute bill and set bill price 
       b1.ComputeBill();
       
       //using getters for getting units and computed bill
       System.out.println("\nNo of Units : " + b1.getUnits()
       		+ "\nBill to pay : " + b1.getBill()); 
    } 
}