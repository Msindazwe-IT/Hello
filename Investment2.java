import java.util.Scanner;
public class Investment
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		double amntInvested,interest;
		int year;
		System.out.println("Enter the amount invested:");
		amntInvested = keyboard.nextDouble();
		System.out.println("Enter the number of years invested:");
		year = keyboard.nextInt();
		System.out.println("Enter the interest rate:");
		interest = keyboard.nextDouble();
		
		double balance = amntInvested * interest;
		
		if(amntInvested == 0 || year == 0 || interest == 0 )
		{
			System.out.println("SYSTEM ERROR ");
	  }
	  else
	  {
	  	double total;
	  	int x = 1;
	  	System.out.println("Balance "+"\t"+"Year ");
	  	while(x <= year)
	  	{
	  	total = (balance * interest) * x + amntInvested;
	  	System.out.println(total+" \t"  +x);
	  	x++;
	  	}
	  }
	}
}
