#include "Generator.h"
#include "AdditionProblem.h"

class AdditionGenerator : public Generator
{
public:
	AdditionProblem* GenerateProblem() {};

	AdditionProblem* GenerateSimilar(AdditionProblem& problem) {};
	AdditionProblem* GenerateSimilar(std::string problem) {};


private:
	//Helper Functions Here


};