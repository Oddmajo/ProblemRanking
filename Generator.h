#include <string>
#include "Problem.h"

class Generator
{
public:
	Generator(void) {};
	~Generator(void) {};

	virtual Problem& GenerateProblem() = 0;

	virtual Problem& GenerateSimilar(Problem&) = 0;
	virtual Problem& GenerateSimilar(std::string) = 0;
};