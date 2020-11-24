public class DayCounter extends ModularCounter
{
    private DateCounter _date;

    private boolean _carry;

    private final static int _days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public DayCounter(DateCounter _date)
    {
        this(_date, null);
    }

    public DayCounter(DateCounter _date, Counter _lower)
    {
        super(2, 1, _lower);

        assert _date != null;
        this._date = _date;
        _carry = true;
    }

    public boolean Pulse()
    {
        if (_carry) {
            int y = _date.Year();
            int m = _date.Month();
            boolean leap = y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
            int module = _days[m - 1];
            if (leap && m == 2)
                module++;
            Reset(module, 1);
        }

        _carry = super.Pulse();
        return _carry;
    }

    public String Symbol()
    {
        return String.format("%02d", Value());
    }
}
