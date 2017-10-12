package library.generator;

import library.problems.Problem;

public abstract interface Generator 
{
	abstract Problem GenerateRandom();
	
	//Create a problem of similar rating, given either a problem, string, or a rating
	//Subject to change
	abstract Problem GenerateSimilar(Problem problem);
	
	abstract Problem GenerateSimilar(String problem);
	
	abstract Problem GenerateSimilar(double rating);
	
	
}
