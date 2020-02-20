import java.util.Scanner;
public class Question1Lab2 {

    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
    	//Asking the user to enter any number of meters
    	System.out.println("Enter a number of meters: ");

    	double meters, feet, convert;
    	meters = scanner.nextDouble();
    	feet = 3.28084;
    	//Formula to convert meters to feet
    	convert = meters * feet;
    	//Answer
    	System.out.println(meters + " meter is equal to " + convert + " feet");
      }
}