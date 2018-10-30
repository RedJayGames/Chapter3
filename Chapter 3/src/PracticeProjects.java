import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;


public class PracticeProjects {
	public static void main(String[] args) {
		//		double temperature = 74;
		//		String weather = "Partly Cloudy";
		//		
		//		if(temperature > 70){
		//			System.out.println("Not bad!");
		//		}else{
		//			System.out.println("It's not warm");
		//		}
		//		if(weather.equalsIgnoreCase("Partly Cloudy")){
		//			System.out.println("No need for sunglasses B)");
		//		}
		//		
		//		char grade = 'A';
		//		
		//		if(grade == 'A'){
		//			System.out.println("Congrats!");
		//		}else if(grade == 'B'){
		//			System.out.println("Almost there!");
		//		}else if(grade == 'C'){
		//			System.out.println("Not terrible...");
		//		}else if(grade == 'D'){
		//			System.out.println("Study harder!");
		//		}else if(grade == 'F'){
		//			System.out.println("oof");
		//		}else{
		//			System.out.println("How");
		//		}
		//		 final int MINOR = 21;
		Scanner scan = new Scanner (System.in);
		//
		//	      System.out.print ("Enter your age: ");
		//	      int age = scan.nextInt();
		//
		//	      System.out.println ("You entered: " + age);
		//
		//	      if (age < MINOR)
		//	         System.out.println ("Youth is a wonderful thing. Enjoy.");
		//
		//	      System.out.println ("Age is a state of mind.");
		//		
		//		if(!weather.equalsIgnoreCase("rain")){
		//			System.out.println("The exclamation mark works wonders");
		//		}
		//
		//		final double RATE = 8.60;  // regular pay rate
		//		final int STANDARD = 40;   // standard hours in a work week
		//
		//		double pay = 0.0;
		//		Scanner scan = new Scanner (System.in);
		//
		//		System.out.print ("Enter the number of hours worked: ");
		//		int hours = scan.nextInt();
		//
		//		System.out.println ();
		//
		//		// Pay overtime at "time and a half"
		//		if (hours > STANDARD) {
		//			pay = STANDARD * RATE + (hours-STANDARD) * (RATE * 1.5);
		//		}
		//		else {
		//			pay = hours * RATE;
		//		}
		//		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		//		System.out.println ("Gross earnings: " + fmt.format(pay));
		//
		//		if(temperature > 80){
		//			if(weather.equalsIgnoreCase("Sunny") || weather.equalsIgnoreCase("Partly cloudy")){
		//				System.out.println("Go swimming, fool!");
		//			}else{
		//				System.out.println("Stay indoors today");
		//			}
		//		}else{
		//			System.out.println("Maybe you shouldn't wear shorts today");
		//		}
		//
		//		int l = 1, m = 2, n = 3, o = 4, p = 5;
		//		
		//		if(l + m == o || n == l + m && o == 2 * m){
		//			System.out.println("&& has priority over ||");
		//		}
		//		if((p - 3 == o - m || m == 52) && o == 4){
		//			System.out.println("parenthesis have priority over &&");
		//		}
		//		
		//		String name1 = "Joe", name2 = "Sarah";
		//		if(name1.equalsIgnoreCase(name2)){
		//			System.out.println("Both names are the same.");
		//		}
		//		name1 += name2;//concatenates both strings
		//		System.out.println(name1);
		//		
		//		double g = 12.8, h = 17.2, sum = g + h;
		//		if(Math.abs(sum - 30) < 0.000001){
		//			System.out.println("Good");
		//		}
		//		
		//		int i = 3;
		//		i+=7;//quickly add 7
		//		i*=4;//quickly multiply by 4
		//		i/=8;//quickly divide by 8
		//		i%=2;//quickly moderator by 2
		//		i-=2;//quickly subtract 2
		//		System.out.println(i);
		//		
		//				int count = 1;
		//				while(count <= 1000000){
		//					System.out.println("Burger.");
		//					count++;
		//				}
		//
		//		Random rand = new Random();
		//		int dice1, dice2, diceSum;
		//		int rolls = 1;
		//		while (rolls <= 100000){
		//			dice1 = rand.nextInt(6)+1;
		//			dice2 = rand.nextInt(6)+1;
		//			diceSum = dice1 + dice2;
		//			System.out.println("You rolled a " + dice1 + " and a " + dice2 + 
		//					" for a total of " + diceSum + "!");
		//			rolls++;
		//		}
		//	 
		//		String response;
		//		boolean isPlaying = true;
		//		while(isPlaying){
		//			System.out.println("Isn't this so much fun!?");
		//			response = scan.nextLine();
		//			if(response.equalsIgnoreCase("no")){
		//				isPlaying = false;
		//			}
		//		}
		//
		//		int numGuesses = 0, guess, highestPossible = 101, lowestPossible = 1;
		//		String response;
		//		boolean done = false;
		//
		//		System.out.print("Think of a number between 1 and 100 and then press enter.");
		//		response = scan.nextLine();
		//
		//		while (!done)
		//		{
		//			guess = (highestPossible + lowestPossible) / 2;
		//			numGuesses++;
		//			System.out.print("Is the number " + guess + " (Correct, Low, High)? ");
		//			response = scan.nextLine();
		//
		//			if (response.charAt(0) == 'c')
		//				done = true;
		//			else if (response.charAt(0) == 'l')
		//				lowestPossible = guess;
		//			else if (response.charAt(0) == 'h')
		//				highestPossible = guess;
		//			else{
		//				System.out.println("Invalid input.  Try again.");
		//				numGuesses--;
		//			}
		//		}
		//		System.out.println("Number of guesses: " + numGuesses);
		//
		//		int count = 1;
		//
		//		while (count <= 25)
		//		{
		//		//	System.out.println (count);
		//			count = count - 1;
		//		}
		//		System.out.println(count);
		//		count++;
		//		System.out.println(count);
		//		System.out.println ("Done");  // this statement is never reached
		//
		//				String str, another = "y";
		//				int left, right;
		//		
		//				while (another.equalsIgnoreCase("y")) // allows y or Y
		//				{
		//					System.out.println ("Enter a potential palindrome:");
		//					str = scan.nextLine();
		//		
		//					left = 0;
		//					right = str.length() - 1;
		//		
		//					while (str.charAt(left) == str.charAt(right) && left < right)
		//					{
		//						left++;
		//						right--;
		//					}
		//		
		//					System.out.println();
		//		
		//					if (left < right)
		//						System.out.println ("That string is NOT a palindrome.");
		//					else
		//						System.out.println ("That string IS a palindrome.");
		//		
		//					System.out.println();
		//					System.out.print ("Test another palindrome (y/n)? ");
		//					another = scan.nextLine();
		//				}
		//			//initializatoin, condition, increment
		//		for(int count = 1; count <= 100; count++){
		//			System.out.println(count);
		//		}
		//		
		//		 final int PER_LINE = 5;
		//	      int value, limit, mult, count = 0;
		//
		//	      System.out.print ("Enter a positive value: ");
		//	      value = scan.nextInt();
		//
		//	      System.out.print ("Enter an upper limit: ");
		//	      limit = scan.nextInt();
		//
		//	      System.out.println ();
		//	      System.out.println ("The multiples of " + value + " between " +
		//	                       value + " and " + limit + " (inclusive) are:");
		//
		//	      for (mult = value; mult <= limit; mult += value)
		//	      {
		//	         System.out.print (mult + "\t");
		//
		//	         // Print a specific number of values per line of output
		//	         count++;
		//	         if (count % PER_LINE == 0)
		//	            System.out.println();
		//	      }
		//		
		//		 final int MAX_ROWS = 1000;
		//
		//	      for (int row = 1; row <= MAX_ROWS; row++)
		//	      {
		//	         for (int star = 1; star <= row; star++)
		//	            System.out.print ("pee ");
		//
		//	         System.out.println();
		//	      }
		//
		//		for(;;){
		//			System.out.println("p");
		//		}
		
		   int grade, count = 0, sum = 0, max, min;
		      double average;

		      //  Get the first grade and give max and min that initial value
		      System.out.print ("Enter the first grade (-1 to quit): ");
		      grade = scan.nextInt();

		      max = min = grade;

		      //  Read and process the rest of the grades
		      while (grade >= 0)
		      {
		         count++;
		         sum += grade;

		         if (grade > max)
		            max = grade;
		         else
		            if (grade < min)
		               min = grade;

		         System.out.print ("Enter the next grade (-1 to quit): ");
		         grade = scan.nextInt ();
		      }
		      //  Produce the final results
		      if (count == 0)
		         System.out.println ("No valid grades were entered.");
		      else
		      {
		         DecimalFormat fmt = new DecimalFormat ("0.##");
		         average = (double)sum / count;
		         System.out.println();
		         System.out.println ("Total number of students: " + count);
		         System.out.println ("Average grade: " + fmt.format(average));
		         System.out.println ("Highest grade: " + max);
		         System.out.println ("Lowest grade: " + min);
		      }

		
		scan.close();
	}
}
