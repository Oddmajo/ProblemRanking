#include <string>


class Problem
{
public:
	float getRating();
	virtual void findRating() = 0;

private:
	float rating;

	//Plaintext representation of the problem
	std::string problem;
};