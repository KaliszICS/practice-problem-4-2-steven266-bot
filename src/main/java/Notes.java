import java.util.Scanner;

class Notes {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		
		//While loop review
		
		// int num;
		// num = 0;

		// while (num < 5) {
		// 	System.out.println(num);
		// 	num = num + 1;
		// }

		// System.out.println("Rest of code");
		

		//For loops
		//Initialization , condition, increment step
		// Initialization step happens once

			//These are all the same
			//i++
			//i = i + 1
			//i += 1
		
		// for (int i = 0; i < 15; i++) {
		// 	//i is a local variable now
		// 	System.out.println(i);
		//  
		// } //Increment Step happens

		// System.out.println(i);

		System.out.println("Rest of code");
		

		//Counters - counts how often something occurs

		int count;
		count = 0; //always start at 0 since we have no idea if it will occur or not
		
		for (int i = 0; i < 5; i++) {
			int num;
			System.out.print("Input an integer: ");
			num = input.nextInt();
			if (num == 5) { //condition that we want to count
				count++; //increase count since condition has occured
			}
		}

		System.out.println("They input 5: " + count + " times.");
		

		
	}
}