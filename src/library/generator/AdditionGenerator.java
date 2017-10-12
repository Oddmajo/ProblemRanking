package library.generator;

import java.util.Random;

import library.problems.AdditionProblem;
import library.problems.Problem;


public class AdditionGenerator implements Generator 
{
	Random rand;
	
	AdditionGenerator()
	{
		rand = new Random();
	}

	public AdditionProblem GenerateRandom()
	{
		/*
		 * This should create random attributes to then pass to another function.
		 * For now, output all generated attributes to the console.
		 */
		
		return null;
	}
	
	public AdditionProblem GenerateSimilar(Problem problem)
	{
		
		return null;
	}
	
	public AdditionProblem GenerateSimilar(String problem)
	{
		
		return null;
	}
	
	public AdditionProblem GenerateSimilar(double rating)
	{
		
		return null;
	}

	
	
	
	//Specific Generation functions
	/*
	 * Digits in operands
	 * Digits in Answer (only 1 more than left/right)
	 * Amount of Carrying
	 * 
	 */
	public AdditionProblem GenerateSpecific(int digitsLeft, int digitsRight, boolean answerBigger, int digitsCarry)
	{
		//Check to make sure that the parameters are possible
		if(answerBigger && digitsCarry > 0)
		{
			int smallest;
			if(digitsLeft < digitsRight)
				 smallest = digitsLeft;
			else
				smallest = digitsRight;
			if(digitsCarry <= smallest)
			{
				/*
				 * Things to watch out for
				 * 		(in regards to digits) a smaller number added to a larger number to get a bigger answer
				 */
				char[] leftOperand = new char[digitsLeft];
				char[] rightOperand = new char[digitsRight];
				
				//If the answer should be bigger, then the last carry must be in the 'last digit,' and is already 'accounted for'
				if(answerBigger)
					digitsCarry--;
				for(int i = 0; i < smallest; i++)
				{
					leftOperand[i] = GenerateDigit();
					if(i == smallest-1)
					{
						if(answerBigger)
							rightOperand[i] = GenerateDigit(leftOperand[i], true);
						else 
							rightOperand[i] = GenerateDigit(leftOperand[i], false);
					}
					else if(digitsCarry > 0)
					{
						if(rand.nextInt() % 2 ==0)
						{
							rightOperand[i] = GenerateDigit(leftOperand[i], true);
							digitsCarry--;
						}
						else
							rightOperand[i] = GenerateDigit(leftOperand[i], false);
					}
				}
				
				
				
				
			}
		}
		return null;
	}
	
	
	
	/*
	 * Helper Functions
	 */
	private char GenerateDigit() { return GenerateDigit('0', false); }
	
	private char GenerateDigit(char compare, boolean carry)
	{
		 int newInt, compareInt = Character.getNumericValue(compare);
		
		/*
		 * Due to passing compare as a char, compareInt has to be a single digit if a valid char is passed (it won't be if 
		 * A check might be needed to ensure that compareInt is a single digit
		 * 
		 * If compareInt = 0, then finding an integer < 10 that will carry when added is impossible.
		 */
		if(carry)
		{
			newInt = 10 - ((rand.nextInt() % compareInt) + 1);
		}
		else
		{
			newInt = rand.nextInt() % (10 - compareInt);
		}
		
		return (char) newInt;
	}
}
