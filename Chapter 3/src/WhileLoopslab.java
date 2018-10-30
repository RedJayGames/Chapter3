import java.text.NumberFormat;
import java.util.Scanner;


public class WhileLoopslab {

	public static void main(String[] corbin) {
		//Problem 1
		//it keeps adding 1 to count, instead of subtracting 1
		//also, it was coded to print 0 instead of excluding it
		for(int count = 10; count >= 1; count--){
			System.out.println(count);
		}

		//Problem 2
		for(int count = 0; count < 100; count++){
			System.out.println("Fall break is coming up!");
		}

		//Problem 3
		Scanner scan = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("Please enter your current salary:");
		double salary = scan.nextDouble();
		System.out.println("Please enter your performance rating\non a scale from 1-3."
				+ "Please note:\n1 = excellent\n2 = good\n3 = poor");

		int performance = scan.nextInt();
		double newSalary;
		if(performance > 3){
			System.out.println("You're not that good, buddy.");
		}else if(performance < 1){
			System.out.println("You're better than that.\nHave some confidence!");
		}else if(performance == 1){
			newSalary = salary * 1.06;
			for(int count = 1; count < 30; count++){
				newSalary*=1.06;
			}
			System.out.println("Your salary was " + money.format(salary)
					+ ".\nYou will be receiving a raise of 6%\nYour salary in 30 years will be "
					+ money.format(newSalary));
		}else if(performance == 2){
			newSalary = salary * 1.03;
			for(int count = 1; count < 30; count++){
				newSalary*=1.03;
			}
			System.out.println("Your salary was " + money.format(salary)
					+ ".\nYou will be receiving a raise of 3%\nYour salary in 30 years will be "
					+ money.format(newSalary));
		}else if(performance == 3){
			newSalary = salary * 1.01;
			for(int count = 1; count < 30; count++){
				newSalary*=1.01;
			}
			System.out.println("Your salary was " + money.format(salary)
					+ ".\nYou will be receiving a raise of 1%\nYour salary in 30 years will be "
					+ money.format(newSalary));
		}
		//Problem 4 & 5
		int factorial = 1;
		System.out.println("Please enter a nonnegative integer:");
		int given = scan.nextInt();
		while(given < 0){
			System.out.println("That is not a nonnegative integer."
					+ "\nPlease enter a nonnegative integer:");
			given = scan.nextInt();
		}
		if(given == 0){
		}else{
			for(;given>0; given--){
				factorial*=given;
			}
		}
		System.out.println(factorial);

		//Problem 6
		String answer;
		int input, sum = 1;
		boolean again = true;
		while(again){
			System.out.println("Please enter a positive integer:");
			input = scan.nextInt();
			System.out.println(1);
			for(int mod = 2; mod <= input; mod++)
				if(input % mod == 0){
					if(input != mod)
						sum+=mod;
					System.out.println(mod);
				}

			//Determines if number is abundant, deficient, or perfect
			if(sum > input)
				System.out.println("The given number is abundant.");
			else if(sum < input)
				System.out.println("The given number is deficient.");
			else
				System.out.println("The given number is perfect.");

			//Asks to repeat program
			System.out.println("Would you like to test another number? (Y/N)");
			answer = scan.next();
			if(answer.charAt(0) != 'y')
				again = false;
		}
		scan.close();
	}
}
