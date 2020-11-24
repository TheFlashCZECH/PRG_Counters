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


/*String tmp = _format
                .replaceAll("\\by\\b", "\\%1\\$04d")
                .replaceAll("\\bm\\b", "\\%2\\$02d")
                .replaceAll("\\bd\\b", "\\%3\\$02d");*/