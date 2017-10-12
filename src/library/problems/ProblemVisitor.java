package library.problems;

public interface ProblemVisitor
{
    <T> void visit(AdditionProblem<?> ap);
    void visit(PartialFractionDecompositionProblem pfdp);
}
