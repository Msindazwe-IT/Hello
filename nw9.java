import java.util.Scanner;
public class nw9
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int num;
		System.out.println("Enter the number:");
		num = kb.nextInt();
		
		if(num % 2 ==0 && num%3 ==0)
		{
			System.out.println(num);
		}
		else
		{
			System.out.println("error ");
		}
	}
}