public class MonthNameCounter extends MonthCounter {

    private final static String[] _months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public MonthNameCounter() { super(); }

    public MonthNameCounter(Counter _lower)
    {
        super(_lower);
    }

    public String Symbol()
    {
        return _months[Value()-1];
    }
}
