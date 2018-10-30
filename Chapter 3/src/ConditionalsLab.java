import java.text.NumberFormat;
import java.util.Scanner;


public class ConditionalsLab {
	public static void main(String[] args) {
		double salary, performance, newSalary;
		Scanner scan = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();

		System.out.println("Please enter your current salary:");
		salary = scan.nextDouble();

		System.out.println("Please enter your performance rating\non a scale from 1-3."
				+ "Please note:\n1 = excellent\n2 = good\n3 = poor");
		performance = scan.nextInt();

		if(performance > 3){
			System.out.println("You're not that good, buddy.");
		}else if(performance < 1){
			System.out.println("You're better than that.\nHave some confidence!");
		}else if(performance == 1){
			newSalary = salary * 1.06;
			System.out.println("Your salary was " + money.format(salary)
					+ ".\nYou will be receiving a raise of 6%\nYour new salary is "
					+ money.format(newSalary));
		}else if(performance == 2){
			newSalary = salary * 1.03;
			System.out.println("Your salary was " + money.format(salary)
					+ ".\nYou will be receiving a raise of 3%\nYour new salary is "
					+ money.format(newSalary));
		}else if(performance == 3){
			newSalary = salary * 1.01;
			System.out.println("Your salary was " + money.format(salary)
					+ ".\nYou will be receiving a raise of 1%\nYour new salary is "
					+ money.format(newSalary));
		}
		double x, y;

		System.out.println("Please enter a value for x:");
		x = scan.nextDouble();

		System.out.println("Please enter a value for y:");
		y = scan.nextDouble();

		if(x == 0 || y == 0){
			if(x == 0 && y == 0){
				System.out.println("The point is on the origin.");
			}else if(x == 0){
				System.out.println("The point is on the y-axis.");
			}else if(y == 0){
				System.out.println("The point is on the x-axis.");
			}
		}else if(x > 0 && y > 0){
			System.out.println("The point is in quadrant I.");
		}else if(x < 0 && y > 0){
			System.out.println("The point is in quadrant II.");
		}else if(x < 0 && y < 0){
			System.out.println("The point is in quadrant III.");
		}else{
			System.out.println("The point is in quadrant VI.");
		}
		scan.close();
	}
}
