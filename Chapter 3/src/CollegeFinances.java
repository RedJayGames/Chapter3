import java.text.NumberFormat;
import java.util.Scanner;


public class CollegeFinances {

	public static void main(String[] args) {
		double P, r, n, A, monthlySalary;
		String college;
		
		//determining values for variables
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a college:");
		college = scan.nextLine();
		System.out.println("Enter the current yearly cost of that college:");
		P = scan.nextDouble();
		P = P * 1.031 + P * Math.pow(1.031,2) + P * Math.pow(1.031, 3) + P * Math.pow(1.031,4);
		System.out.println("Enter the monthly interest rate:");
		r = scan.nextDouble();
		System.out.println("Enter the amount of months:");
		n = scan.nextInt();
		System.out.println("Enter your expected monthly salary:");
		monthlySalary = scan.nextDouble();

		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		System.out.println("The following information is for " + college + ":\n");
		
		for(double years = n / 12, monthly, incomePercent, percentOfTotal = .20, loan; 
				percentOfTotal <= 1; percentOfTotal+=.2){
			
			//Finds total cost to pay off loan
			loan = P * percentOfTotal;
			A = (loan * r) / (1 - Math.pow(1 + r, -n)) * n;
			monthly = A / n;
			incomePercent = monthly / monthlySalary;
			
			//Prints outputs
			System.out.println("For a " + money.format(loan) + " loan (" + 
					percent.format(percentOfTotal) + " of the four-year cost)\nat " + 
					percent.format(r) + " interest with a payoff period of " + years + 
					" years, \nyou would pay a total of " + money.format(A) + 
					", \nwhich is a monthly payment of " + money.format(monthly) + ".\n"
					 + "This would require " + percent.format(incomePercent) +
					 " of your take-home income.\n");
		}
		scan.close();
	}
}
