import java.util.Scanner;

public class ModulusChallenge
	{

		public static void main(String[] args)
			{
				leapYearTest();
				arrayTest();
				fizzBuzzGame();

			}
		public static void leapYearTest(){
			Scanner userInput = new Scanner(System.in);
			System.out.println("input a year");
			int userYear = userInput.nextInt();
			if (userYear % 4 == 0 && userYear % 100 != 0){
			boolean isLeapYear = true;
			System.out.println(userYear + " is a leap year");
			System.out.println();
			}
			else {
			boolean isLeapYear = false;
			System.out.println(userYear + " isn't a leap year");
			System.out.println();
			}
		}
		public static void arrayTest(){
		int[]numArray = {2,4,6,8,10,12,14,16,18,20};
		for (int x = 0; x < numArray.length; x++){
			if (numArray[x] % 6 == 0){
				System.out.println(numArray[x]);
			}
		}
		System.out.println();
		}
		public static void fizzBuzzGame(){
			for (int x = 1; x < 101; x++){
			if (x % 3 == 0 && x % 5 != 0){
				System.out.println("Fizz");
			}
			else if (x % 3 != 0 && x % 5 == 0){
				System.out.println("Buzz");
			}
			else if (x % 3 == 0 && x % 5 == 0){
				System.out.println("FizzBuzz");
			}
			else {
				System.out.println(x);
			}
			}
		}

	}
