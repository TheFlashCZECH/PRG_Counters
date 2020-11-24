public class MonthNumberCounter extends MonthCounter
{
    public MonthNumberCounter()
    {
        super();
    }

    public MonthNumberCounter(Counter _lower)
    {
        super(_lower);
    }

    public String Symbol()
    {
        return String.format("%02d", Value());
    }
}
