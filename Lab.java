import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double number1;
		double lowNum;
		double highNum;
		
		RandomNumber myRandomNumber = new RandomNumber();
		
		System.out.print("Please enter a low number: ");
		lowNum = input.nextDouble();
		myRandomNumber.SetLowNumber(lowNum);
		
		System.out.print("Please enter a high number: ");
		highNum = input.nextDouble();
		myRandomNumber.SetHighNumber(highNum);
		
		double randomNum = myRandomNumber.GetANumber();

		System.out.print("Please enter a number in-between: ");
		number1 = input.nextDouble();
		
		

		if (number1 == randomNum)
			System.out.printf("Congrats, you guessed it. The correct number is %f\n", randomNum);
		else if (number1 > randomNum)
			System.out.printf("Your number is too large. The correct number is %f\n", randomNum);
		else
			System.out.printf("Your number is too small. The correct number is %f\n", randomNum);

	}

}