import java.util.Scanner;

public class Grades {

	
	private static Scanner console;

	public static void main(String[] args) 
	{
		char Grade,Option;
		
		do {
			
			console = new Scanner(System.in);
			System.out.println("Enter Grades for Student A/B/C/D/F");
			Grade = console.next().charAt(0);
			
			if (Grade == 'A'|| Grade == 'a') 
			{	
				System.out.println("Firstlass");
			}
			else if (Grade == 'B'|| Grade == 'b') 
			{
				System.out.println("Second Class");
			}
			System.out.println("Enter Grades for Next Student");
			Option = console.next().charAt(0);
		} while (Option == 'Y' || Option == 'y' );

	}

}
