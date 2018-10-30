import java.util.Scanner;


public class Chapter3Review {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//Short Answers
	//3.17
		int[] values = new int[10];
		
		//asks for integer values
		System.out.println("Please enter 10 values (One at a time):");
		
		//determines integer values
		for(int i = 0; i < values.length;i++){
			values[i] = scan.nextInt();
		}
		
		//sorts integer values by numeric value
		for(int i = 0, j = 1;j < values.length;i++,j++){
			if(values[i] > values[j]){
				values[j] = values[i];
			}
		}
		System.out.println(values[values.length - 1]);
	//3.18
		System.out.println("Please enter some text");
		int aCount = 0;
		String given;
		given = scan.nextLine();
		for(int i = 0; i < given.length(); i++)
			if(given.charAt(i) == 'a')
				aCount++;
		System.out.println(aCount);
	//3.19
		System.out.println("Pleaes enter some text to have printed backwards");
		String given1 = scan.nextLine();
		for(int i = given1.length() - 1;i >= 0;i--)
			System.out.print(given1.charAt(i));
	//3.20
		System.out.println("Please enter some text");
		String given2 = scan.nextLine();
		for(int i = 0;i <= given2.length() - 1;i+=2)
			System.out.print(given2.charAt(i));
	}
}
