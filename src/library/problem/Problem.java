package library.problem;

public abstract class Problem 
{
	//Representation of rank/rating
	double ranking;
	
	//Ranking is not given or assigned to a problem, it is found - this should call appropriate functions to rank the problem
	abstract double findRanking();
	
	double getRanking()	{ return ranking; }
	
	
}
