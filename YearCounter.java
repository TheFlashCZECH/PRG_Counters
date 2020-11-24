public class YearCounter extends ModularCounter
{
    public YearCounter()
    {
        this(1, null);
    }

    public YearCounter(int origin)
    {
        this(origin, null);
    }

    public YearCounter(Counter lower)
    {
        this(1, lower);
    }

    public YearCounter(int origin, Counter lower)
    {
        super(9999, origin, lower);
    }

    public String Symbol()
    {
        return String.format("%04d", Value());
    }
}
