import java.util.Scanner;
public class Question1Lab2money {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //Asking for the user to enter a number of CAD
        System.out.println("Enter the number of CAD: ");
    	double cadvalue, usdvalue, eurvalue, usd, eur;
    		
    	cadvalue = scanner.nextDouble();
    	usdvalue = 0.75;
    	eurvalue = 0.68;
        
        //Formulas to convert the value of CAD to EURO and USD
    	usd = cadvalue * usdvalue;
    	eur = cadvalue * eurvalue;
        
        //Print out of the answer
		System.out.println("\nThe initial value is " + cadvalue);
        System.out.println("\n" + cadvalue + " CAD is equal to " + usd + "USD");
        System.out.println("\n" + cadvalue + " CAD is equal to " + eur + "EURO");
    }

}