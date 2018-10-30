import java.text.NumberFormat;
import java.util.Scanner;


public class Roulette {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		double result;
		int money, bet, spin = 0, bankruptCount = 0, totalSpin = 0;
		int finalResult = 0;
		final int NUM_SIMS, STARTING_MONEY, SPINS;

		System.out.println("Please enter a starting amount:");
		STARTING_MONEY = scan.nextInt();
		System.out.println("Please enter the amount gambled per bet:");
		bet = scan.nextInt();
		System.out.println("Please enter the number of simulations:");
		NUM_SIMS = scan.nextInt();
		System.out.println("Please enter a max number of spins per person:");
		SPINS = scan.nextInt();

		// We are going to do 1000 simulations of 100000 spins each
		for (int simulation = 1; simulation <= NUM_SIMS; simulation++){
			money = STARTING_MONEY;
			spin = 0;
			// Simulate one player that plays for a lifetime
			for (boolean bankrupt = false; bankrupt == false && spin <= SPINS; spin++) {
				if(money >= bet){
					result = Math.random();
					//System.out.println(result);
					// Subtract the wager
					money -= bet;

					// Betting on a single number has a 1 in 38 chance of succeeding
					// Generate a random double between 0 and 1 and if it's less than 1/38, we have won
					if (result < 1.0/38) {
						money += 36 * bet;
					}
				}
				if(money <= 0){
					bankruptCount++;
					bankrupt = true;
				}
			}
			totalSpin+=spin;
			finalResult += money;
		}
		System.out.println("Average number of spins: " + spin);
		System.out.println("Average money left: " + finalResult/NUM_SIMS);
		System.out.println("Average percent gain: " + percent.format(((double)(finalResult/NUM_SIMS-STARTING_MONEY)/STARTING_MONEY)));

	}

}
