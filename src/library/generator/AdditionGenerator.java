package library.generator;

import java.util.Random;

import library.problem.AdditionProblem;
import library.problem.Problem;

public class AdditionGenerator extends Generator 
{
	Random rand;
	
	AdditionGenerator()
	{
		rand = new Random();
	}

	AdditionProblem GenerateRandom()
	{
		
		return null;
	}
	
	AdditionProblem GenerateSimilar(Problem problem)
	{
		
		return null;
	}
	
	AdditionProblem GenerateSimilar(String problem)
	{
		
		return null;
	}
	
	AdditionProblem GenerateSimilar(double rating)
	{
		
		return null;
	}

	
	
	
	//Specific Generation functions
	/*
	 * Digits in operands
	 * Digits in Answer
	 * Amount of Carrying
	 * 
	 */
	private char GenerateDigit() { return GenerateDigit('0', false); }
	
	private char GenerateDigit(char compare, boolean carry)
	{
		 int newInt, compareInt = Character.getNumericValue(compare);
		
		/*
		 * Due to passing compare as a char, compareInt has to be a single digit if a valid char is passed
		 * This check might need to be moved elsewhere or removed sometime through development
		 * 
		 * If compareInt = 0, then finding an integer < 10 that will carry when added is impossible.
		 */
		if(compareInt < 10)
		{
			if(carry)
			{
				newInt = 10 - ((rand.nextInt() % compareInt) + 1);
			}
			else
			{
				newInt = rand.nextInt() % (10 - compareInt);
			}
		}
			
		
		
		
		return '0';
	}
}
