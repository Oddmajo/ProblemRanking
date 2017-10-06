#include "Problem.h"

class AdditionProblem : public Problem
{
public:
	AdditionProblem() {};
	AdditionProblem(std::string problem) {};

	~AdditionProblem() {};

	void findRating() {};

	std::string getProblem();
	std::string setProblem();
 	
private:
	//TODO: Some form of problem representation

};