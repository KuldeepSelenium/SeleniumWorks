import java.util.Scanner;

public class SumOfNum {

	private static Scanner console;

	public static void main(String[] args) 
	{
		int num1, num2,sum;
		char ans;
		do 
			{
			
				console = new Scanner(System.in);
				System.out.println("Ennter Number one");
				num1 = console.nextInt();
				
				System.out.println("Ennter Number one");
				num2 = console.nextInt();
				sum = num1+num2;
				System.out.println(sum);
				System.out.println("Do you want to continue y/n");
				ans = console.next().charAt(0);		
			
			
			} while (ans == 'y' || ans == 'Y' );
	}

}
