package library.problems;

public interface Problem
{
    // accept() in a Visitor design pattern
    public abstract void difficulty(ProblemVisitor v);
}
