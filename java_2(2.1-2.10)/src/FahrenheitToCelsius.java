
import java.util.Scanner;  // Scanner is in the java.util package

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a radius
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
        double celsius = (0.5 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " is Celsius");
	}

}