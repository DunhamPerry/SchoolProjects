import java.util.Scanner;

public class AssemblyLineParameters
	{

		public static void main(String[] args)
			{
				double feet = inputFeet();
				double inches = inputInches();
				double totalInches = convertInches(feet, inches);
				double centimeters = convertCentimeters(totalInches);
				double meters = convertMeters(centimeters);
				double totalFeet = convertFeet(meters);
				double backToInches = convertBackToInches(totalFeet);
			}
		public static double inputFeet(){
			Scanner userInput = new Scanner(System.in);
			System.out.println("please input your height in feet");
			return userInput.nextDouble();
		}
		public static double inputInches(){
			Scanner userInput = new Scanner(System.in);
			System.out.println("please input your height in inches");
			return userInput.nextDouble();
		}
		public static double convertInches(double x, double y){
			double totalInches = x * 12 + y;
			System.out.println("your height in inches is " + totalInches);
			return totalInches;
		}
		public static double convertCentimeters(double x){
			double centimeters = x * 2.54;
			System.out.println("your height in centimeters is " + centimeters);
			return centimeters;
		}
		public static double convertMeters(double x){
			double meters = x / 100;
			System.out.println("your height in meters is " + meters);
			return meters;
		}
		public static double convertFeet(double x){
			double totalFeet = x * 3.28084;
			System.out.println("your height in feet is " + totalFeet);
			return totalFeet;
		}
		public static double convertBackToInches(double x){
			double backToInches = x * 12;
			System.out.println("your height in inches is " + backToInches);
			return backToInches;
		}

	}
