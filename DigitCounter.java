public class DigitCounter implements Counter
{
    private final int _base;
    private final Counter _lower;

    private int _count;

    private static final String[] _digits = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

    public DigitCounter(int _base)
    {
        this(_base, null);
    }

    public DigitCounter(int _base, Counter _lower)
    {
        assert _base >= 1 && _base <= _digits.length;

        this._base = _base;
        this._lower = _lower;
        _count = 0;
    }

    public boolean Pulse()
    {
        if (_lower == null || _lower.Pulse()) {
            _count = (_count + 1) % _base;
            return _count == 0;
        }
        return false;
    }

    public String Display()
    {
        if (_lower != null)
            return _digits[_count] + _lower.Display();
        else
            return _digits[_count];
    }
}
