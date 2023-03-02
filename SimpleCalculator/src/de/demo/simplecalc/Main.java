package de.demo.simplecalc;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		String[] equation = new String[3];
		
		Menu menu = new Menu();
		
		menu.showIntro();
		
		while (!exit) 
		{
			// We get the first inputed token			
			equation[0] = sc.next();
			
			/* Then we check whether one of the keywords,
			 * that is "exit" or "help" was inputed
			 */
			if (equation[0].equals("exit"))
			{
				//Upon exit we close the program
				sc.close();
				exit = true;
				menu.showGoodbyeMessage();
			} else if (equation[0].equals("help"))
			{
				menu.showHelp();
				sc.nextLine(); //This advances the Scanner to the next line.
			} else 
			{
				/* When none of the keywords were used
				 * we fill in our buffer with the next
				 * two signs/numbers/letters
				 */
				for (int i = 1; i < 3; i++) 
				{
					equation[i] = sc.next();
				}
				
				// And we clear the rest of the buffer
				// in order to ignore the rest of the input
				sc.nextLine(); //This advances the Scanner to the next line.
				
				int x = 0;
				int y = 0;
				String sign = equation[1];
				
				/*
				 * And try to calculate 
				 */
				try
				{
					x = Integer.parseInt(equation[0]);				
					y = Integer.parseInt(equation[2]);
					System.out.println( menu.doTheThing(x, y, sign) );
				} catch (Exception e)
				{
					menu.showErrorMessage();
				}
				
			}
		}
	}
	
}
