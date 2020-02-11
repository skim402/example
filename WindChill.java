//import Scanner
import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		
		//variables to get input from user and store
		double temperature;
		double windSpeed;
		//variables to store wind chill
		double windChill;
		
		//constant variables for the formula
		final double c1 = 35.74;
		final double c2 = 0.6215;
		final double c3 = 35.75;
		final double c4 = 0.4275;
		
		//string to store programmer's name
		String programmerName = "Sungmin Kim";
		
		//new object of scaaner named userInput
		Scanner userInput = new Scanner(System.in);
		
		//header of this application
		System.out.println("Wind Chill Calculator\n");
		
		//get temperature from user
		System.out.print("Enter the temperature in Fahrenheit (must be >= -45 and <= 40):");
		temperature = userInput.nextDouble();
		
		//get wind speed from user
		System.out.print("Enter the wind speed (must be >= 5 and <= 60):");
		windSpeed = userInput.nextDouble();
		
		//calculate wind chill by the formula
		windChill = c1 + c2*temperature - c3*Math.pow(windSpeed, 0.16) + c4*temperature*Math.pow(windSpeed, 0.16);
		
		//display the wind chill
		System.out.println("\nWind chill temperature: " + windChill + " degrees Fahrenheit\n");
		
		//display programmer's name 
		System.out.println("Programmer: " + programmerName);
		
		//close scanner object
		userInput.close();
		
	}
	
}