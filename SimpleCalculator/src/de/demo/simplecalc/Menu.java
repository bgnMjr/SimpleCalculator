package de.demo.simplecalc;

public class Menu {
		
	public void showIntro()
	{
		System.out.println("****************WELCOME******************");
		System.out.println("*                                       *");
		System.out.println("* Welcome to this simple calculator.    *");
		System.out.println("* For help type 'help'                  *");
		System.out.println("*                                       *");
		System.out.println("*****************************************");
	}
	
	public void showGoodbyeMessage()
	{
		System.out.println("Thank you for using this simple calculator!");
		System.out.println("Goodbye!");
	}
	
	public void showErrorMessage()
	{
		System.out.println("*****************ERROR*******************");
		System.out.println("*                                       *");
		System.out.println("* Well, looks like something was        *");
		System.out.println("* inputted wrong.                       *");
		System.out.println("* Remember, you can type something      *"); 
		System.out.println("* Like this: 2 * 3                      *");
		System.out.println("*                                       *");
		System.out.println("* You can use only integral numbers.    *");
		System.out.println("* Yeah, and division by 0 is also       *");
		System.out.println("* forbidden.                            *");
		System.out.println("*                                       *");
		System.out.println("*****************************************");
	}
	
	public void showHelp()
	{
		System.out.println("*****************HELP********************");
		System.out.println("*                                       *");
		System.out.println("* With this calculator you can add,     *");
		System.out.println("* subtract, divide and multiply two     *");
		System.out.println("* integral numbers separated by spaces. *");
		System.out.println("* EXAMPLE:                              *");
		System.out.println("* 1 + 1                                 *");
		System.out.println("*                                       *");
		System.out.println("* Note: The rest of the input will be   *");
		System.out.println("* ignored.                              *");
		System.out.println("*                                       *");
		System.out.println("* To exit type 'exit'                   *");
		System.out.println("*                                       *");
		System.out.println("* That's it, good luck!                 *");
		System.out.println("*                                       *");
		System.out.println("*****************************************");
	}
	
	public String doTheThing(int x, int y, String sign) 
	{
		String answer = "The Answer is: " + x + " " + sign + " " + y + " = ";
		
		switch(sign) {
			case "+": 
				answer += Math.addExact(x, y);
				break;
			case "-":
				answer += Math.subtractExact(x, y);
				break;
			case "*":
				answer += Math.multiplyFull(x, y);
				break;
			case "/":
				answer += Math.floorDiv(x, y);
				break;
			default:
				answer = "Wrong sign";
				break;
		}
		return answer;
	}
}