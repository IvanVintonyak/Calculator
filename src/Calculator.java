import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		Scanner fromuser = new Scanner(System.in);
		
		double number1, number2, result;
		String action;
		
		System.out.println("Enter the first number..");
		number1 = Double.parseDouble (fromuser.nextLine());
		
		System.out.println("Enter the secont number..");
		number2 =Double.parseDouble (fromuser.nextLine());
		
		System.out.println("Enter the action(+-*/):");
		action = fromuser.nextLine();
		
		if (action.equals("/") && number2 ==0 )
		{
			System.out.println("No-no it is forbiden");
			return;
		}
		
		if (action.equals("+") || action.equals("addition"))
		{
			result = number1 + number2;
		}
		else if (action.equals("-")|| action.equals("substraction"))
		{
			result = number1 - number2;
		}
		else if (action.equals("*")|| action.equals("multiplication"))
		{
			result = number1 * number2;
		}
		else if (action.equals("/")|| action.equals("division"))
		{
			result = number1 / number2;
		}
		else
		{
			result = 0;
		}
		System.out.println("Result: "+ result);
		

	}

}
