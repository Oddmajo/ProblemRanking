package difficulty.partialFractions;

public class PartialFractionDifficultyComputer
{
    //
    // Singleton instance
    //
    protected static PartialFractionDifficultyComputer _theInstance;

    public static PartialFractionDifficultyComputer getInstance()
    {
        if (_theInstance != null) return _theInstance;

        _theInstance = new PartialFractionDifficultyComputer();

        return _theInstance;
    }
    

    // main
    public void compute()
    {
    }
}
