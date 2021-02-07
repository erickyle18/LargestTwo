import java.util.Scanner;

public class LargestTwo {

	public static void main(String[] args) {
		//create the scanner object
		Scanner input = new Scanner(System.in);
		
		//initialize the variables
		int counter = 2;
		int largest = 0;
		int secondLargest = 0;
		
		//prompt the user to enter a number
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		largest = number;
			
		//start the while loop to allow the input of 10 numbers
		while(counter <= 10)
		{
			System.out.print("Enter another number: ");
			number = input.nextInt();
			
			if(number > largest)
			{
				secondLargest = largest;
				largest = number;
			}
			else if(number > secondLargest)
			{
				secondLargest = number;
			}
				
				
			counter++;
		}
		
		System.out.println("Largest Number: "+largest);
		System.out.println("Second Largest Number: "+secondLargest);
		
	}

}
