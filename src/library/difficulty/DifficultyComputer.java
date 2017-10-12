package difficulty;

import difficulty.partialFractions.PartialFractionDifficultyComputer;
import problems.AdditionProblem;
import problems.PartialFractionDecompositionProblem;
import problems.ProblemVisitor;

public class DifficultyComputer implements ProblemVisitor
{

    @Override
    public <T> void visit(AdditionProblem<?> ap)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visit(PartialFractionDecompositionProblem pfdp)
    {
        PartialFractionDifficultyComputer.getInstance().compute();
    }
    
}
