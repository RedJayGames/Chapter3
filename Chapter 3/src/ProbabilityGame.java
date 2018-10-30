import java.text.NumberFormat;
import java.util.Random;


public class ProbabilityGame {
	public static void main(String[] args) {
		Random rand = new Random();
		int roll1, roll2, sum, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, 
				count7 = 0, count8 = 0, count9 = 0, count10 = 0, count11 = 0, count12 = 0, count = 0;
		final int rollMax = 1000000;
		double expect2, expect3, expect4, expect5, expect6, expect7, expect8, expect9, 
		expect10, expect11, expect12, sumAve, sumSD, sumTotal = 0.0,
		error2, error3, error4, error5, error6, error7, error8, error9, error10, error11, error12;
		
		//determines expected value for every roll
		expect2 = Math.round(rollMax * 1.0 / 36);
		expect3 = Math.round(rollMax * 2.0 / 36);
		expect4 = Math.round(rollMax * 3.0 / 36);
		expect5 = Math.round(rollMax * 4.0 / 36);
		expect6 = Math.round(rollMax * 5.0 / 36);
		expect7 = Math.round(rollMax * 6.0 / 36);
		expect8 = Math.round(rollMax * 5.0 / 36);
		expect9 = Math.round(rollMax * 4.0 / 36);
		expect10 = Math.round(rollMax * 3.0 / 36);
		expect11 = Math.round(rollMax * 2.0 / 36);
		expect12 = Math.round(rollMax * 1.0 / 36);
		
		//rolls dice and counts total number of each outcome
		while (count <= rollMax){
			roll1 = rand.nextInt(6) + 1;
			roll2 = rand.nextInt(6) + 1;
			sum = roll1 + roll2;
			if(sum == 2)
				count2++;
			else if(sum == 3)
				count3++;
			else if(sum == 4)
				count4++;
			else if(sum == 5)
				count5++;
			else if(sum == 6)
				count6++;
			else if(sum == 7)
				count7++;
			else if(sum == 8)
				count8++;
			else if(sum == 9)
				count9++;
			else if(sum == 10)
				count10++;
			else if(sum == 11)
				count11++;
			else if(sum == 12)
				count12++;
			sumTotal+=sum;
			count++;
		}
		
		sumAve = sumTotal / rollMax; //calculates average sum
		System.out.println("The average sum is " + sumAve);
		
		//standard deviation formula
		sumSD = Math.sqrt((count2 * Math.pow(2 - sumAve,2) + 
				count3 * Math.pow(3 - sumAve,2) + 
				count4 * Math.pow(4 - sumAve,2) + 
				count5 * Math.pow(5 - sumAve,2) + 
				count6 * Math.pow(6 - sumAve,2) + 
				count7 * Math.pow(7 - sumAve,2) + 
				count8 * Math.pow(8 - sumAve,2) + 
				count9 * Math.pow(9 - sumAve,2) + 
				count10 * Math.pow(10 - sumAve,2) + 
				count11 * Math.pow(11 - sumAve,2) + 
				count12 * Math.pow(12 - sumAve,2)) /(rollMax - 1));
		System.out.println("The standard deviation is " + sumSD);
		
		//calculates percent error
		error2 = (expect2 - count2) / expect2;
		error3 = (expect3 - count3) / expect3;
		error4 = (expect4 - count4) / expect4;
		error5 = (expect5 - count5) / expect5;
		error6 = (expect6 - count6) / expect6;
		error7 = (expect7 - count7) / expect7;
		error8 = (expect8 - count8) / expect8;
		error9 = (expect9 - count9) / expect9;
		error10 = (expect10 - count10) / expect10;
		error11 = (expect11 - count11) / expect11;
		error12 = (expect12 - count12) / expect12;
		
		NumberFormat fmt = NumberFormat.getPercentInstance();
		//outputs table
		System.out.println("Sum\t\tOccurances\tExpected Number of Occurances\t% Error\n" + 
				"2\t\t" + count2 + "\t\t" + expect2 + "\t\t\t\t" + fmt.format(error2) + "\n" + 
				"3\t\t" + count3 + "\t\t" + expect3 + "\t\t\t\t" + fmt.format(error3) + "\n" +
				"4\t\t" + count4 + "\t\t" + expect4 + "\t\t\t\t" + fmt.format(error4) + "\n" + 
				"5\t\t" + count5 + "\t\t" + expect5 + "\t\t\t\t" + fmt.format(error5) + "\n" + 
				"6\t\t" + count6 + "\t\t" + expect6 + "\t\t\t\t" + fmt.format(error6) + "\n" + 
				"7\t\t" + count7 + "\t\t" + expect7 + "\t\t\t\t" + fmt.format(error7) + "\n" + 
				"8\t\t" + count8 + "\t\t" + expect8 + "\t\t\t\t" + fmt.format(error8) + "\n" + 
				"9\t\t" + count9 + "\t\t" + expect9 + "\t\t\t\t" + fmt.format(error9) + "\n" + 
				"10\t\t" + count10 + "\t\t" + expect10 + "\t\t\t\t" + fmt.format(error10) + "\n" + 
				"11\t\t" + count11 + "\t\t" + expect11 + "\t\t\t\t" + fmt.format(error11) + "\n" + 
				"12\t\t" + count12 + "\t\t" + expect12 + "\t\t\t\t" + fmt.format(error12) + "\n");
	}
}
