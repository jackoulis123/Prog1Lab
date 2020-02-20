import java.util.Scanner;
public class Question1Lab2age {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //Asking for the user to enter his year of birth
        System.out.println("Enter your year of birth: ");

        int currentYear, yearOfBirth, age;
        currentYear = 2020;
        yearOfBirth = scanner.nextInt();
   
        //Formula to calculate the age of the user
        age = currentYear - yearOfBirth;
        //Answer
        System.out.println("I will be " + age + " years old in a couple of days");
    }
}