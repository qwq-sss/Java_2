import java.util.Scanner;  // Scanner is in the java.util package

public class DisplayTime {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter three numbers
	    System.out.println("Enter a integer for second: ");
	    int seconds = input.nextInt();
	    
	    int minutes = seconds / 60;  //Find minutes in seconds
	    int remainingSeconds = seconds % 60; //Seconds remaining
	    System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");

	}

}
