package library.problems;

public class PartialFractionDecompositionProblem implements Problem
{

    public PartialFractionDecompositionProblem()
    {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void difficulty(ProblemVisitor v)
    {
        v.visit(this);
    }

}
