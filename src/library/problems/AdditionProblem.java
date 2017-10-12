package library.problems;

import java.util.ArrayList;

/**
 * We are summing n values of type T; T must inherit from the Number class
 */
public class AdditionProblem<T extends Number> extends Number implements Problem
{
    private static final long serialVersionUID = 1L;
    protected ArrayList<T> _values;

    AdditionProblem()
    {
        _values = new ArrayList<T>();
    }
    
    private double evaluate()
    {
        double sum = 0;

        for (T value : _values)
        {
            sum += value.doubleValue();
        }

        return sum; 
    }

    @Override
    public double doubleValue()
    {
        return (double)evaluate();
    }

    @Override
    public float floatValue()
    {
        return (float)evaluate();
    }

    @Override
    public int intValue()
    {
        return (int)evaluate();
    }

    @Override
    public long longValue()
    {
        return (long)evaluate();
    }

    @Override
    public void difficulty(ProblemVisitor v)
    {
        v.visit(this);
    }
}
