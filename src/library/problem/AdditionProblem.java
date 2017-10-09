package library.problem;

public class AdditionProblem extends Problem
{
	//String representation of the problem
	String problem;
	
	/*
	 * Possible value requirements:
	 * 		Answer
	 * 		Breakdown of parts
	 * 		Solution Tree (maybe)
	 */
	
	AdditionProblem()
	{
		//Set stuff to default values
		rating = 0.0;
	}
	AdditionProblem(AdditionProblem original)
	{
		//DO SOME STUFF - Copy Constructor
	}
	AdditionProblem(String problem)
	{
		//DO SOME STUFF - This should accept a String representation of the problem, and generate all relevant information
	}	
	
	
	
	double findRating()
	{
		//DO SOME STUFF
		
		return rating;
	}
	
	String showProblem()
	{
		//DO SOME STUFF
		//Needs to pull information on the problem and format it correctly
		
		return problem;
	}
	
	
}
